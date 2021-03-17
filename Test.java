package by.epam.tr.main;

import java.util.*;
public class Test {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double x;
		
		Scanner conin = new Scanner(System.in);
		
		System.out.println("Enter number 'a'");
		
		if(conin.hasNextDouble())
		{
			a = conin.nextDouble();
			if (a == 0) {
				System.out.println("Denominator = 0");
				return;
			}
		}else {
			System.out.println("Not a number");
			return;
		}
		
		System.out.println("Enter number 'b'");
		if(conin.hasNextDouble()){
			b = conin.nextDouble();
		}else{
			System.out.println("Not a number");
			return;
		}
		
		System.out.println("Enter number 'c'");
		if(conin.hasNextDouble()){
			c = conin.nextDouble();
		}else{
			System.out.println("Not a number");
			return;
		}
		
		x = ((b+(Math.sqrt((Math.pow(b,2))+(4*a*c))))/(2*a))-((Math.pow(a,3))*c)+b;
		System.out.println("X = "+x);
	}

}
