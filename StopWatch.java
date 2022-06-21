import java.util.Scanner;
public class StopWatch 
{
public static void main(String args[]) {
	System.out.println("Enter a character and press Enter to start watch");
	Scanner sc =new Scanner(System.in);
	char start=sc.next().charAt(0);
	long startch =System.currentTimeMillis();
	System.out.println("Enter a character and press Enter to stop watch");
	Scanner sc1=new Scanner(System.in);
	char stopch=sc1.next().charAt(0);
	long stop =System.currentTimeMillis();
	float timeElapsed =(float)(stop-start)/1000;
	System.out.println("Time in Seconds =" +timeElapsed);
}
}

