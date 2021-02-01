

class teachers{

	private String desgination="Mwalimu Mkuu";
	private String collegeName="elpatronInc";

	protected String getdesgination(){
		return desgination;
	}
	protected void setdesgination(String desgination){
		this.desgination = desgination;
	}
	protected void setcollegeName(String collegeName){
		this.collegeName = collegeName;
	}
	protected String getcollegeName(){
		return collegeName;
	}
	void does(){
		System.out.println("Teachings");
	}
}
  class javaExample extends teachers{
 	String Tname = "Teacher dully";

 	public static void main(String [] args){
 		javaExample obj = new javaExample();

 		System.out.println(obj.getdesgination());
 		System.out.println(obj.getcollegeName());
 		System.out.println(obj.Tname);

 		obj.does();

 	}
 }