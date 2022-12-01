
interface Zomato{
	abstract void menu();
	abstract void delivery();
}
class Mcdonalds implements Zomato{
	public void menu() {
		System.out.println("Mcdonalds menu");
	}
	public void delivery() {
		System.out.println("mcdonals delivery");
	}
}
class Dominos implements Zomato{
	public void menu() {
		System.out.println("Dominos menu");
	}
	public void delivery() {
		System.out.println("Dominos delivery");
	}
}



public class Abstraction {
public static void main(String[] args) {
	Zomato ref=new Mcdonalds();
	ref.menu();
	ref.delivery();
	ref=new Dominos();
	ref.menu();
	ref.delivery();
}
}
