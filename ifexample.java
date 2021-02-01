

public class ifexample{


	public static void main(String[]args){
		int age = 20;

		if(age>17){
			System.out.println("you growing enough");
		}


		int number = 11;

		if(number%2==0){
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		int year=2020;

		if(((year%4==0)&&(year%400==0))||(year%100!=0)){
			System.out.println("Leap Year");
		}else{
			System.out.println("common Year");
		}

		int marks=70;

		if(marks<100&&marks>80){
			System.out.println("Excellent");
		}else if(marks<=80 && marks>50){
			System.out.println("Pass");

		}else if(marks<=50 && marks>20){
			System.out.println("Averagee");
		}else{
			System.out.println("fail");
		}

		int numbers = -30;
		if(numbers>0){
			System.out.println("positive");
		}else if(numbers<0){
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
		int ages=18;
		int weight=70;
		if(age>=18){
			if(weight>=70){
			System.out.println("eligible to donate blood");
		}else{
			System.out.println("your not eligible to donate blood");
		}

		}

		int month=3;
		String monthString=" ";

		switch(month){
			case 1:monthString="1 - January";
			break;
			case 2:monthString="2 - February";
			break;
			case 3:monthString="3 - March";
			break;
			default:System.out.println("invalid month");

		}
		System.out.println(monthString);

for(int c=1; c<=4;c++){
	for (int j=1;j<=4 ;j++) {
		System.out.println(c+" "+j);
	}
	
}
for(int t=1;t<=4;t++){
	for(int d=1;d<=t;d++){
		System.out.print("*");
	}
	System.out.println();
}
int term =7;
for (int b=1;b<=term ;b++ ) {
	for (int u=term;u>=b ;u-- ) {
		System.out.print("*");
	}
	System.out.println();
}
int arr[] ={1,2,4,22,21};
for(int r:arr){
	System.out.println(r);
	}
	int sum=0;
	for (int e=1;e<=10 ;e++ ) {
		sum +=e;

	}
	System.out.println("sum is:" +sum);



        int i = 0;
        for(;i <= 5; i++ )
        {
            System.out.println("i = " + i );
        }

        System.out.println("i after the loop = " + i );
    
    int namba = 5;
    int factorial =1;
    for (int s=2;s<=namba ;s++ ) {
    	factorial *= factorial;
    	
    }
    System.out.println("5! is:" +factorial);


}
}