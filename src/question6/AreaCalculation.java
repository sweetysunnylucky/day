package question6;

import java.util.Scanner;

public class AreaCalculation {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			float d=sc.nextFloat();
			System.out.println(a*a);
			System.out.println(b*c);
			System.out.printf("%.2f",+(3.14*d*d));
		}

}
