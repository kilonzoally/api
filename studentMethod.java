

class Student{
	int id;
	String name;

	void setDisplay(int a, String b){
         id = a;
         name = b;
	}

	void getStudent(){
		System.out.println("studentId-:" +id +"name:"+name);
	}
}

class studentMethod{

	public static void main(String[]args){
		Student obj = new Student();
		Student obj1 = new Student();
		  obj.setDisplay(100,"ally" );
		  obj1.setDisplay(101,"doto" );
		  obj.getStudent();
		  obj1.getStudent();

	}
  
}
