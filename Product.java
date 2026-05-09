import java.util.Scanner;
class Product{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is Your Product Name???");
        String product = sc.next();

        System.out.println("Enter Quantity");
        int quantity = sc.nextInt();

        System.out.println("Enter the price of product");
        int price = sc.nextInt();
        
        double total = quantity * price;

        System.out.println(total);


    }
}