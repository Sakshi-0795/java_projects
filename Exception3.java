public class Exception3{
    public static void main(String[]args){
        String name = null;

        try{
            System.out.println(name.length());
        }
        catch(Exception e){
            System.out.println("The value of string is not defines");
        }
        System.out.println("hello everyone");
    }
}