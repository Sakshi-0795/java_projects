import java.util.Scanner;
class ThreeInt{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;

        double avg = sum/3.0;

        System.out.println("Sum of the three numbers" + sum);
        System.out.println("Avarage of the three numbers"  + avg);
  }

}
