
class Login1 {
Login1(){
	System.out.println("login through gmail");
}	
	Login1(String username, String pwd){
		System.out.println("login through username and pwd");
	}
	Login1(long phone, int otp){
	System.out.println("logon through otp");
	}
}



public class ConstuctorOverloading {
public static void main(String[] args) {
	Login1 l=new Login1();
	//new Login1("Arun", "bgae23");
	//new Login1(965865423l, 2356);
}
}
