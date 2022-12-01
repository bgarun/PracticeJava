
class Day01{
	void app() {
		System.out.println("Application");
	}
}
class Day02 extends Day01{
	void round1() {
		System.out.println("1st round ");
	}
}
class Day03 extends Day02{
	void hrround() {
		System.out.println("Final round");
	}
}





public class Inheritance {
public static void main(String[] args) {
	Day03 d=new Day03();
	d.hrround();
	d.round1();
	d.app();
}
}
