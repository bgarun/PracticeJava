
class Day010 {
	void Application() {
		System.out.println("Applied to the job");
	}
}
class Day020 extends Day010{
	void technical() {
		System.out.println("Technical round cleared");
	}
}
class Day030 extends Day020{
	void hrround() {
		System.out.println("HR round");
	}
}

public class MultiLevlInheritance {
public static void main(String[] args) {
	Day010 ref= new Day030();
	ref.Application();
	Day020 ref1 =new Day030();
	ref1.Application();
	ref1.technical();
	Day030 ref3=new Day030();
	ref3.Application();
	ref3.technical();
	ref3.hrround();
	Object ob=new Day030();
	

	
	if (ref instanceof Day020) {
		Day030 r3=(Day030) ref;
		System.out.println("Downcasting Achieved");
	}
}
}
