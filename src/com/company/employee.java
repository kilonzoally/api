
public class employee{

	String empName;
	int empSalary;
	String empAddress;

	public employee(){
		this("ally");
	}
	public employee(String name){
		this(name,2000000);
	}
	public employee(String name, int sal){
		this(name,sal,"Magomeni");
	}
	public employee(String name,int sal, String Address){
		this.empName=name;
		this.empSalary=sal;
		this.empAddress=Address;

	}

	void getDisplay(){
		System.out.println("Employeee name is: "+empName);
		System.out.println("Employee Salary is: "+empSalary);
		System.out.println("Employee Address is:"+empAddress);
	}
	public static void main(String[] args) {
		employee obj = new employee();
		obj.getDisplay();
	}
}