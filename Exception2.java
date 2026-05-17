public class Exception2{
    public static void main(String[]args){
        int numbers [] = {1,2,3};

        try
        {
            System.out.println(numbers[2]);
        }
        catch(Exception e){
            System.out.println("The index is not correct ");
        }


    }
}