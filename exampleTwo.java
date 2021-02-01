

class exampleTwo{

	int var;

	exampleTwo(int num){
        var=num;

	}
	int getDisplay(){
      return var;
	}
	public static void main(String args[]){
		exampleTwo obj = new exampleTwo(11);
		System.out.println(obj.getDisplay());
	}
}