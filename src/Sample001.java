
public class Sample001 {
	public void sample(){
		System.out.println("method 01");

	}
	public void sample(int x){
System.out.println("method 02");

	}
	public void sample(int r, int d, String name) {
System.out.println("method 03");
	}

}
class Sample02{
public static void main(String[] args) {
	Sample001 d=new Sample001();
	d.sample();
	d.sample(25);
	d.sample(21,25,"arun");
}
}
	
	
	
