package first_class;

public class Static_Instance2 {

	String name;// instance variable
	
public void payment() {
	
	
	name= "rafi : ";
	Static_Instance.salary = 3000;
	Static_Instance.bonus = 500;
	int total= Static_Instance.salary + Static_Instance.bonus;// local variable
	
	System.out.println(name+total);
	
}

public  static void getSalary () {
	
	Static_Instance.name1= "kaniz ";
	Static_Instance.salary = 600;
	Static_Instance.bonus= 700;
	int total1 = Static_Instance.salary + Static_Instance.bonus;
	System.out.println( Static_Instance.name1+total1 );

}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static_Instance2 obj = new Static_Instance2();
		obj.payment();
		Static_Instance2.getSalary();
		
	}

}
