public class VariableDemo{
    int age = 20;

    static String college = "SGM college karad";

    public static void main(String[]args){
        System.out.println("Cpllege Name : " + college);
         
        VariableDemo obj = new VariableDemo();
        System.out.println("Age : " + obj.age);

        String name = "Sakshi";

        System.out.println("Name : " + name);

        obj.show();

    }
    void show(){
        int marks = 95;
         
        System.out.println("Marks :  " + marks);

        System.out.println("Age from show method : " + age);

        System.out.println("college from show method : " + college);
    }
}