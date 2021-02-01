

public class encapDemo{

	private int id;
	private String empName;
	private int empAge;


 public int getEmpId(){
 	return id;
 }
 public String getEmpName(){
 	return empName;
 }
 public int empAge(){
 	return empAge;
 }
 public void setEmpId(int newValue){
      id = newValue;
 }
 public void setName(String newValue){
 	empName = newValue;
 }
 public void setAge(int newValue){
    empAge = newValue;
 }
}
 public class encaptest{
 	public static Void main(String args []){
 		encapDemo obj = new encapDemo();
 		obj.setEmpId(001);
 		obj.setName("ally");
 		obj.setAge(28);
 	
 	System.out.println(obj.getEmpId());
 	System.out.println(obj.setName());
 	System.out.println(obj.setAge());
 }
 }