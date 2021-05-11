package by.epam.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		
		double x = 1.3;
		double y = 1.6;
		
		double result = ((Math.sin(x) + Math.cos(x)) / (Math.cos(x) - Math.sin(x))) * Math.tan(x * y);
		
		System.out.println("Result is " + result);
	}

}
