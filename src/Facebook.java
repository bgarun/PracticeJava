

class FacebookDemo{
		void login() {
			System.out.println("user name");
		}
		void login(String name, String pwd) {
			System.out.println("login by username");
		}

		void login(long ph, int otp) {
			System.out.println("login by otp");
		}
		}
	


public class Facebook {
	public static void main(String[] args) {
		FacebookDemo fb=new FacebookDemo();
		fb.login();
		fb.login(956458245l, 2356);
		fb.login("Arun", "Arun@123");
	}



}




