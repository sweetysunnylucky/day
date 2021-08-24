package question3;
import java.util.Scanner;
public class SwappingTwoNumbers {
	public static void main(String[] args) {
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}

}
