package first_class;

public class Const {
	
	Const(String name, int bonus){
	System.out.println(name+bonus);	
	}
	Const(double salary){
		System.out.println(salary);
	}
	
public static void main(String[] args) {
	Const obj = new Const("fahim " , 1000);
	//Const obj1 = new Const(1000);

}
}
