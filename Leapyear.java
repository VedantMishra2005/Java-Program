import java.util.*;
class Leapyear{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no:");
		int num = sc.nextInt();
		if (num%100!=0 && num%4==0 || num%400==0){
			System.out.println("leap year");
			}
		else {
			System.out.println("not leap year");
			}
	}
}
