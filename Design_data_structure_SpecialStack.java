import java.util.Stack;

class SpecialStack{
    private Stack<Integer> stack;
    private int min;

    SpecialStack(){
        stack = new Stack<>();
        System.out.println("Stack Created with Size 7");
    }
    public boolean isEmpty(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(stack.size()==7){
            System.out.println("Stack is Full");
            return true;
        }
        return false;
    }

    public void push(int p){
        if(this.isFull()){
            System.out.println("Element can not be pushed "+p);
            return;
        }
        stack.push(p);
        System.out.println("Element Pushed "+p);
        if(stack.size()==1)
            min = p;
        if(p < min){
            min = p;
        }
    }

    public void pop(){
        if (this.isEmpty()){
            System.out.println("Element can not be popped");
            return;
        }
        int elem = stack.pop();
        System.out.println("Popped Element "+elem);
    }

    public void getMin(){
        if (this.isEmpty()){
            System.out.println("Could not find Minimum element.");
            return;
        }
        System.out.println("Minimum Element "+min);
    }
    public void display(){
        System.out.println("Current Stack");
        System.out.println(stack.toString());
    }
}



public class Design_data_structure_SpecialStack {
    public static void main(String[] args) {

        SpecialStack specialStack = new SpecialStack();
        specialStack.isEmpty();
        specialStack.push(20);
        specialStack.push(40);
        specialStack.push(30);
        specialStack.push(36);
        specialStack.push(23);
        specialStack.push(27);
        specialStack.push(34);
        specialStack.push(39);
        specialStack.getMin();
        specialStack.pop();
        specialStack.push(10);
        specialStack.push(50);
        specialStack.push(60);
        specialStack.push(5);
        specialStack.display();
        specialStack.isFull();
        specialStack.getMin();
        specialStack.display();
    }
}