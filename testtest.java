package by.epam.tr.main;

import java.util.*;
public class testtest {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double x;
		
		Scanner conin = new Scanner(System.in);
		
		System.out.println("Enter a");
		
		if(conin.hasNextDouble())
		{
			a = conin.nextDouble();
			if (a == 0) {
				System.out.println("Denominator = 0");
				return;
			}
		}
		System.out.println("Enter b");
		if(conin.hasNextDouble()){
			b = conin.nextDouble();
		}
		System.out.println("Enter c");
		if(conin.hasNextDouble()){
			c = conin.nextDouble();
		}
		
		x = ((b+(Math.sqrt((b*b)+(4*a*c))))/(2*a))-((a*a*a)*c)+b;
		System.out.println("X="+x);
	}

}
