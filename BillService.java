interface BillService {
	
	void genrateBill(int units);
	
    void showBills();
	
}
 class DomesticCustomer implements BillService{
	 int units;
	 double billAmount;
	 
	 public void genrateBill(int units) {
		 this.units = units;
		 billAmount = units * 5;
	 }
	 public void showBills() {
		 System.out.println("Domestic Customer Bill");
		 System.out.println("Units Consumed : " + units);
		 System.out.println("Bill Amount : " +billAmount);
	 }
 }
 class ComercialCustomer implements BillService{
	 int units ;
	 double billAmount;
	 
	 public void genrateBill(int units)
	 {
		 this.units = units;
		 billAmount = units * 8;
	 }
	 public void showBills() {
		 System.out.println("Commercial customer bill");
		 System.out.println("Units consumed : " + units);
		 System.out.println("Bill Ammount: " + billAmount );
		 
		 
	 }
	 
	 public class name{
 
	 public static void main(String[]args) {
		 DomesticCustomer domestic = new DomesticCustomer();
		 domestic.genrateBill(600);
		 domestic.showBills();
		 
		 System.out.println();
		 
		 ComercialCustomer commercial = new ComercialCustomer();
		 commercial.genrateBill(400);
		 commercial.showBills();
	 }
 }}
