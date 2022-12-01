
class Login2{
	Login2(){
		this(985647823l, 2356);
		System.out.println("login through gmail");
	}	
		Login2(String username, String pwd){
			this();
			System.out.println("login through username and pwd");
		}
		Login2(long phone, int otp)
		{
		System.out.println("logon through otp");
		}
	}



public class ThisStatement {
public static void main(String[] args) {
	new Login2("Arun", "bga1235");
}
}
