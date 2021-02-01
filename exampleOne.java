
class exampleOne{

	int var;

	exampleOne(){
		this.var = 10;
	}

	exampleOne(int x){
		this.var = x;
	}

	int myDisplay(){
		return var;
	}

	public static void main(String []args){
		exampleOne obj = new exampleOne();
		exampleOne obj1 = new exampleOne(1000);
		System.out.println("id :"+obj.myDisplay());
			System.out.println("id :"+obj1.myDisplay());
	}

}
