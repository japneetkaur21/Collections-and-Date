import java.util.Arrays;
import java.util.Comparator;

    class Employee {
        private String name;
        private double age;
        private double salary;

        public Employee(String name, double age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return this.name;
        }

        public double getAge() {
            return this.age;
        }

        public double getSalary() {
            return this.salary;
        }

       @Override
        public String toString() {
            return "Employee: " + this.getName() + " Age: " + this.getAge() + " Salary: " + this.getSalary();
        }


public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
    @Override
    public int compare(Employee o1, Employee o2) {
        return(int) (o2.getSalary() - o1.getSalary());
    }
};

    }
public class Sort_employee_objects_based_on_highest_salary{
    public static void main(String[] args) {
Employee[] empArr= new Employee[3];
       empArr[0]= new Employee("Nitin", 32, 12.02);
               empArr[1]= new Employee("Raj", 23, 3.75);
                empArr[2]=new Employee("Amit", 27, 8.3);

        Arrays.sort(empArr, Employee.SalaryComparator);
        System.out.println(Arrays.toString(empArr));
    }
}