
class Rectangle{
	int length;
	int width;

	void setdisplay(int a, int b){
       length =a;
       width=b;
	}
	void display(){
		System.out.println(length*width);
	}
}
class testRectangle{
	public static void main(String[]args){
		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle();
		obj1.setdisplay(20,30);
		obj2.setdisplay(22,4);

		obj1.display();
		obj2.display();

	}
}