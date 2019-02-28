import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class print_number_of_occurences_of_each_character_in_string {
    static void CharCount(String input){
        HashMap<Character,Integer> charCountMap = new HashMap<>();
        char[] strArr= input.toCharArray();
for (char c: strArr){
    if (charCountMap.containsKey(c)){
        charCountMap.put(c, charCountMap.get(c)+1);
    }else {
        charCountMap.put(c,1);
    }
}
for (Map.Entry entry :charCountMap.entrySet()){
    System.out.println("Number of occurences of "+entry.getKey()+" is "+entry.getValue());
}

    }

    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       CharCount(str);
    }

}
