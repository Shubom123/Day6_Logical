import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
      int i, number;
      Scanner  sc = new Scanner(System.in);
      System.out.print(" Please Enter any Integer : ");
        number = sc.nextInt();
        for (i = 2; i<=number/2; i++)
        {
            if(number % i == 0)
            {
                System.out.println( number + " is not a Prime Number");
		break;
            }
	    else {
		System.out.println(number + " is Prime Number");
	    }
        }
        }
    }

