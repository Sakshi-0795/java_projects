public class Calculation {
  public int area (int side ){
	  return side * side;
	  
  }
  public double area (int length ,int width) {
	  return length * width;
	  
  }
  public static void main(String[]args) {
	  Calculation c1 = new Calculation();
	  System.out.println("The area of square is "+ c1.area(10));
	  System.out.println("The area of rectangle is " + c1.area(10, 5));
  }
  
}
