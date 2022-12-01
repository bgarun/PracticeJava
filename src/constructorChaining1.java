
class Super0{
Super0(int a){
System.out.println("Constructor from super class");
}
}
class Sub0 extends Super0{
Sub0(){
	super(25);
System.out.println("Constructor from sub class");
}
}
public class constructorChaining1{
public static void main(String[]args){
Sub0 s=new Sub0();
}
}