package question7;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		float c=sc.nextFloat();
		float num=(a*b*c)/100;
		System.out.printf("%.2f",num);
	}
}
