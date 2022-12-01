class motorcycle {
public static void bike() {
	String Brand="Honda";
	String model= "SP125";
	int cc=125;
	System.out.println(Brand +model);
	System.out.println(cc);
}
public static void car() {
	String brand="Tata";
	String model= "tigor";
	String vari="XZ+";
	System.out.println(brand +model);
	System.out.println(vari);
}

public static void main(String[]args) {
	System.out.println("Main starts");
	System.out.println("___Bike details___");
	bike();
	System.out.println("___Car details___");
	car();
	System.out.println("Main ends");
}
}
