public abstract class PhonePay {

	public abstract void checkbalance();
	
	public abstract void deposite(int ammount);
	
	public abstract void withdraw(int ammount);
	
}
class Bankk extends PhonePay {
	int balance  = 10000;
	public void checkbalance() {
		System.out.println("The balance " + balance);
	}
	public void deposite(int ammount) {
		balance+=ammount;
		System.out.println("Money deposited successfully" + ammount);
	}
	public void withdraw(int ammount) {
		balance-=ammount;
		System.out.println("Money withdrwal done " + ammount);
	}
	public static void main(String[]args) {
		Bankk acc1 = new Bankk();
		acc1.checkbalance();
		acc1.deposite(2000);
		acc1.withdraw(1000);
		
	}

}

