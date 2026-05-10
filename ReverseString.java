import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String");
        String s  = sc.nextLine();
        for(int  name = s.length() - 1 ; name>=0;name--){
            System.out.println(s.charAt(name));
        }
        sc.close();

    }
}