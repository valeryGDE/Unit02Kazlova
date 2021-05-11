package by.epam.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		
		int x = 25;
		int y = 3523;
		int temp = 0;
		
		if (x<y) {
			temp = x;
			x = y;
			y = temp;
		} 
		
		System.out.println("x = " + x + " and y = " + y);
	}
}
