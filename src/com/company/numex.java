
class numex{

	public static void main(String args[]){
        int arr[] = {2,3,4,10,11,9};
        System.out.println("The odd number are:");
		for (int x=0; x<=arr.length; x++){

			if (arr[x] % 2 == 1 ){
				System.out.println( arr[x]);
			}
			// if (x/2 == 0){
			// 	continue;
			// }
			// System.out.println(x+ " ");


		}
	}
}