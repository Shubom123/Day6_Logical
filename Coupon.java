import java.util.Scanner;

public class Coupon {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of coupons you want: ");
	int number=sc.nextInt();
	for(int i=0; i<number; i++){
		int Coupon_Number = (int) Math.floor(Math.random()*10)%10000+1000;
		System.out.println("Coupons numbers are: " + Coupon_Number);
}
}
}
