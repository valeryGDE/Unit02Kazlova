package by.epam.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 7;
		
		// не нужно пренебрегать объявлением переменных, а то через полгодика и под дулом пистолета не вспомнишь, что ты тут писала :)
		
		System.out.println(((x>=-4 && x<=4) && (y<=0 && y>=-3)) || ((x>=-2 && x<=2) && (y>=0 && y<=4)));

	}

}
