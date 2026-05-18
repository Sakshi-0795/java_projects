import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
	
	public static void main(String[]args) {
		ArrayList<String> shoppingcart = new ArrayList<>();
		
		shoppingcart.add("Apple");
		shoppingcart.add("Banana");
		shoppingcart.add("Papaya");
		shoppingcart.add("Orange");
		shoppingcart.add("Kiwi");
		shoppingcart.add("Mango");
		shoppingcart.add("Avocado");
		
		
		
		System.out.println(shoppingcart);
		shoppingcart.remove(6);
		for(String items:shoppingcart) {
			System.out.println(items);
		}
	}

}
