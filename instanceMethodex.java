
class instanceMethodex{

	public static void main(String[] args) {
		instanceMethodex obj = new instanceMethodex();
		 int d = obj.add(2,8);
		 System.out.println(d);
		
	}
   int s;
	public int add(int a, int b){
		s = a+b;
		return s;

	}
}