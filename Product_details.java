
import java.util.ArrayList;
class Products {
	
	int id;
	String name;
	double price;
	
	
	public Products(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	

}

public class Product_details {
	public static void main(String[]args) {
		ArrayList<Products> products=new ArrayList<>();
		
		products.add(new Products(1001,"Mobile",5000000));
		products.add(new Products(1002,"TV",450000));
		products.add(new Products(1003,"Fridge",10000));
		products.add(new Products(1004,"AC",35000));
		
		
		Products highest=products.get(0);
		
		for(Products p:products)
		{
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		
		for(Products p1:products) {
			if(p1.price>highest.price)
			{
				highest=p1;
			}
		}
	}

}

