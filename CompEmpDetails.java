import java.util.Scanner;

public class CompEmpDetails {
	public static void main(String[] args) {
		Department dp = new Department();

		
		Scanner scname = new Scanner(System.in);
		Scanner scloca = new Scanner(System.in);
		Scanner scid = new Scanner(System.in);
		Scanner scemp = new Scanner(System.in);
		
		
		System.out.println("Give Name ");
		String name = scname.nextLine();

		System.out.println("Give NameID ");
		int id = scid.nextInt();
		
		System.out.println("Give Name Location ");
		String locationn = scloca.nextLine();
		
		System.out.println("Give Name NoOfEmpl ");
		int noemp = scemp.nextInt();
		
		dp.getId();
		dp.setId(id);
		dp.getLocation();
		dp.setLocation(locationn);
		dp.getName();
		dp.setName(name);
		
		dp.getNoOfEmp();
		dp.setNoOfEmp(noemp);
		
		
		System.out.println("Name is "+name);
		System.out.println("NID is "+id);
		System.out.println("NLocATION is "+locationn);
		System.out.println("NnO oF EMO is "+noemp);
	
	}
}
class Department
{
	private int id;
	int noOfEmp;
	String location;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	




	
}