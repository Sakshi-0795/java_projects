import java.util.Scanner;
class Age{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current age");
        int age = sc.nextInt();

        int year = age + 5;
        System.out.println("Your age after 5 years is "+ year + " 5Years!!!");
    }
}