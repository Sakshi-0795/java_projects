abstract class Shape {

   abstract void area();    
}
class Circle extends Shape{

    void area(){
        System.out.println("circle..!!!");
    }
}
public class HP{

public static void main(String[]args){
    Circle c1 = new Circle();
    c1.area();
}
}
