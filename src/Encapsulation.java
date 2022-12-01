
class Details{
	private String name;
	private String pan;
	private long phone;
	Details(String name, String pan, long phone){
		this.name=name;
		this.pan=pan;
		this.phone=phone;
		
	}
	public String getName() {
		return name;
	}
	public String getPan() {
		return pan;
	}
	public long getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPhone(long phone) {
		this.phone=phone;
	}
	
}




public class Encapsulation {
public static void main(String[] args) {
Details d=new Details("Arun", "gdf235648v", 8956458745l);
System.out.println(d.getName());
System.out.println(d.getPan());
System.out.println(d.getPhone());
d.setName("Arunkumar");
System.out.println(d.getName());
d.setPhone(9856547856l);
System.out.println(d.getPhone());
	
}
}
