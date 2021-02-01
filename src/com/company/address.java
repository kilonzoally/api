
class address{

	int streetNum;
	String city;
	String state;
	String country;

	address(int str, String ct, String st, String co){
		this.streetNum=str;
		this.city = ct;
		this.state = st;
		this.country =co;
	}

}
 class studentExample {
 	int rollNum;
 	String studentName;
 	address studentaddrr;

 	studentExample(int roll,String studentName, address addrr){
 		this.rollNum=roll;
 		this.studentName=studentName;
 		this.studentaddrr=addrr;
 	}

 	public static void main(String args[]){
 		address obj1 = new address(12,"KInondon","Dsm","Tanzania");
 		studentExample obj = new studentExample(001,"Ally",obj1);
 		System.out.println(obj.studentaddrr.streetNum);
 		System.out.println(obj.studentaddrr.city);
 		System.out.println(obj.studentaddrr.state);
 		System.out.println(obj.rollNum);
 		System.out.println(obj.studentName);
 		

 	}

 }

