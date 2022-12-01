
class Super1{
	int a;
	Super1(int d){
		a=25;
		System.out.println("super class constructor");
	}
}
class Sub extends Super1{
	int b;
	Sub(int c){
		super(98);
		b=66;
		System.out.println("Sub class constructor");
	}
}



public class ConstructorChaining {
public static void main(String[] args) {
	Sub s1=new Sub(23);
	System.out.println(s1.b);
	System.out.println(s1.a);
}
}
