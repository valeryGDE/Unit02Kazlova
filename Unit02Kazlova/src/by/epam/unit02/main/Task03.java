package by.epam.unit02.main;

public class Task03 {

	public static void main(String[] args) {
		
		int t = 121;
		int hour, min, sec;
		
		if ((t > 86400) || (t < 0)) {
			System.out.println("Incorrect value");
			return;
		}
		
		hour = t / 3600;
		t = t - hour * 3600;
		min = t / 60;
		t = t - min * 60;
		sec = t;
		
		System.out.printf("%02dh "+"%02dmin "+"%02ds ", hour,min,sec);

	}
}
