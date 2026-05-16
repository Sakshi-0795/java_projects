import java.util.Scanner;

class InvalidPinException extends Exception {

    InvalidPinException(String message) {
        super(message);
    }
}

public class ATMMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int pin;

        try {

            System.out.println("Enter the ATM PIN : ");
            pin = sc.nextInt();

            if (pin != correctPin) {
                throw new InvalidPinException("Wrong PIN");
            }

            System.out.println("PIN verified successfully");
            System.out.println("Welcome to ATM Service");

        } catch (InvalidPinException e1) {

            System.out.println(e1.getMessage());
            System.out.println("Remaining attempts : 2");

            try {

                System.out.print("Re-enter ATM PIN : ");
                pin = sc.nextInt();

                if (pin != correctPin) {
                    throw new InvalidPinException("Wrong PIN");
                }

                System.out.println("PIN verified successfully");
                System.out.println("Welcome to ATM service");

            } catch (InvalidPinException e2) {

                System.out.println(e2.getMessage());
                System.out.println("Remaining attempts : 1");

                try {

                    System.out.println("Re-enter ATM PIN : ");
                    pin = sc.nextInt();

                    if (pin != correctPin) {
                        throw new InvalidPinException("Wrong PIN");
                    }

                    System.out.println("PIN verified successfully");
                    System.out.println("Welcome to ATM service");

                } catch (InvalidPinException e3) {

                    System.out.println(e3.getMessage());
                    System.out.println("ATM card blocked");
                }
            }
        }

        sc.close();
    }
}