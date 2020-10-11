import java.util.*;
class pallaviCommit1{
	
	public static void findEven(int n){
		if(n%2==0){
			System.out.println("No is even!");
		}else{
			System.out.println("No is odd!");
		}
	
	}
	
	public static void main(String args[]){
		Scanner sn = new Scanner(System.in);
		System.out.println("My first java program.");
		System.out.println("Enter +ve no to check for even -->");
		int a = sn.nextInt();
		findEven(a);//call findEven function
	}

}
