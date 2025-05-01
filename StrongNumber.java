import java.util.*;
public class StrongNumber {
	static int factorial(int n){
		int fact=1;
		for (int i=1; i<=n; i++){
			fact*=i;
		}
		return fact ;
	}
	public static void main(String []args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter no");
		int number = Sc.nextInt();
		int original_number=number;
		int sum=0;
		while(number!=0){
			int digit = number%10;
			sum+=factorial (digit);
			number /=10;
		}
		if (sum == original_number){
			System.out.println(original_number+"is strong");
			}
		else{
			System.out.println(original_number+"is not strong");
			}
	}
}