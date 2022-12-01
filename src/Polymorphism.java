
class Loan{
	void homeloan() {
		System.out.println("loan by all bank");
	}
}
class Canara1 extends Loan{
	void homeloan() {
		System.out.println("Home loan by canara bank");
	}
}
class Sbi11 extends Loan{
	void homeloan() {
		System.out.println("Home loan by SBI");
	}
}
class Person{
	void applyloan(Loan ref) {
		ref.homeloan();
	}
}

public class Polymorphism {
public static void main(String[] args) {
	Person p=new Person();
	p.applyloan(new Canara1());
	p.applyloan(new Sbi11());
}
}
