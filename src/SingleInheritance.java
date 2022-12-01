
class Super{
	void method() {
		System.out.println("super class");
	}
}
class Subclass extends Super{
	void method2() {
		System.out.println("Sub class method");
	}
}

public class SingleInheritance {
public static void main(String[] args) {
	Subclass s=new Subclass();
	s.method();
	s.method2();
}
}
