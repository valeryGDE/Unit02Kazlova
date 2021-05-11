package by.epam.unit02.main;

public class Task04 {

	public static void main(String[] args) {

		double x1 = 0;
		double y1 = 4;
		double x2 = 2;
		double y2 = -2;
		
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("Distance is " + distance);
	}

}
