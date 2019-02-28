import java.util.HashSet;
import java.util.Scanner;

public class Return_number_of_unique_characters_in_string {
    public static int uniqueCharCount(String str)
    {
        HashSet<Character> string1 = new HashSet<Character>();
        char[] arr= str.toCharArray();
        for (int i=0; i<arr.length; i++)
        {
            string1.add(arr[i]);
        }
        return string1.size() ;
    }


    public static void main(String args[])
    {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(uniqueCharCount(str));

    }
}
