abstract class Account{
abstract void Adhaar();
abstract void pan();
}
class Bank extends Account{
void Adhaar(){
System.out.println("Adhaar linked");
}
void pan(){
System.out.println("Pan linked");
}
}
public class Abstract {
public static void main(String[] args) {
	Account ref=new Bank();
	ref.Adhaar();
	ref.pan();
}
}
