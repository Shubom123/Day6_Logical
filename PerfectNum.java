import java.util.Scanner;
public class PerfectNum {
    public static void main(String args[]) {
	int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        sc.close();
        int perfect = 0;
        for (int i = 1; i <= n / 2; i++) {
           int k =n/i;
            System.out.println(k);
            if (n % i == 0) {
                perfect = perfect + i;
            }
        }
        if (perfect == n) {
            System.out.println(n + " is perfect number.");
        } else {
            System.out.println(n + " is not perfect number.");
        }
    }
}