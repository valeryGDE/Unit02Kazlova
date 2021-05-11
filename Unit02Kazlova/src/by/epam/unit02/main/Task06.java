package by.epam.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		
		int m = 2211;
		int n = 3433;
		
		double fraction = (double) m / n;
		
		System.out.println("Fraction is: " + fraction);
		
		int younger = (int)fraction % 10;
		int older = (int)(fraction * 10) % 10;
		
		System.out.println("Younger number is: " + younger);
		System.out.println("Older number is: " + older);
	}

}
