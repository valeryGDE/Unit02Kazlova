package by.epam.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		
		int x;
		double fx; 
		
		x = 4;

		if (x <= -3) {
			fx = 9;
		} else if (x > 3) {
			fx = 1 / (Math.pow(x, 2) + 1);
		} else {
			fx = 0;
		}

		System.out.println("F(x) = " + fx);
		
	}// молодец

}
