

class factorial{

	public static void main(String[] args) {
		
		int number =5;
		int factory = 1;

		for(int i=2; i<=number;i++){
			factory*=i;
		}
		System.out.println("5! is :"+factory);
	}
}