
class Owner1{
	void car() {
		System.out.println("Original car");
	}
	void bike() {
		System.out.println("not sold");
	}
}
class Owner2 extends Owner1{
	void car() {
		System.out.println("Modification of car");
	}
}


public class MethodOverriding {
public static void main(String[] args) {
	Owner2 o=new Owner2();
	o.car();
	o.bike();
	Owner1 o1=new Owner1();
	o1.car();
	Owner1 o2=new Owner2();
	o2.car();
	o2.bike();
}
}
