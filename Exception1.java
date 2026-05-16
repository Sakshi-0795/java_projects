public class Exception1 {
	public static void main(String[]args) {
		int a = 20;
		int b = 30;
		int c = 0;
		System.out.println(a+b);
		System.out.println(b-a);
		try {
		System.out.println(a/c);
		}catch(Exception e) {
			System.out.println("Can't divide by 0");
		}
		System.out.println(a*b);
		System.out.println("Arithmatic operation");
	}
	

}
