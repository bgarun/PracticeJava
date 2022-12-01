
class RBI{
	void rules() {
		System.out.println("Rules of RBI");
	}
}
class SBI extends RBI{
	void loan() {
		System.out.println("loan scheme by SBI");
	}
}
class Canara extends RBI{
	void fixeddepo() {
		System.out.println("FD plan of canara bank");
	}
}


public class HirarchicalInheritance {
public static void main(String[] args) {
	Canara c= new Canara();
	c.fixeddepo();
	c.rules();
	SBI s=new SBI();
	s.loan();
	s.rules();
}
}
