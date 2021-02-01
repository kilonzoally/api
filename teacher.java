 
 class teacher{

 	String desgination = "Mwalimu";
 	String collegeName = "elpatronInc";

 	void does(){
 		System.out.println("Teaching");

 	}
 	 }

  class physicsTeacher extends teacher{

 	String Tname = "mwalimu Adam";

 public static void main(String [] args){

 	physicsTeacher obj = new physicsTeacher();

 	System.out.println("Kazi yako :"+ obj.desgination);
 	System.out.println("Jina la chuo: "+obj.collegeName);
 	System.out.println("Jina la mwalimu: "+obj.Tname);
 	obj.does();


 }


 }