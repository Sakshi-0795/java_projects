public class Single {
	String name;
	int id;
	
	public Single(String name , int id) {
		this.name = name;
		this.id = id;
		
	}
	public void work()
	{
		System.out.println(name +"is working");
	}

}
class Developer extends Single{
	String programminglanguage;
	public Developer(String name,int id) {
		super(name,id);
	}
	public void writecode() {
		System.out.println(name + "is coding in java lang");
	}
}
class Manager extends Single{
	public Manager(String name,int id) {
		super(name,id);
	}
	void conductmeeting()
	{
		System.out.println(name+ "is conducting meeting");
		
	}
	public static void main(String[]args) {
		Developer emp1 = new Developer("Sakshi",101);
		emp1.work();
		emp1.writecode();
		Manager emp2 = new Manager("Shraddha",102);
		emp2.work();
		emp2.conductmeeting();
	}
}
