

class number{

	int num1;
	int num2;

	void setNum(int x, int y){
     num1 = x;
     num2 = y;
	}
	void getNum(){
		System.out.println(num2*num1);
	}
}
class twoNumber{
	public static void main(String []args){
		number obj = new number();
		obj.setNum(10,11);
		obj.getNum();

	}
}