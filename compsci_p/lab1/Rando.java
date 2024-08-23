package lab1;

import java.util.Random;

public class Rando {
	public static void main (String[] args) {
		Random random = new Random();
		int Rand1, Rand2, Rand3;
		int i = 0;
		while(i<200) {
			Rand1 = random.nextInt(1,15);
			Rand2 = random.nextInt(1,15);
			Rand3 = random.nextInt(1,15);
			System.out.println(Rand1+"-"+Rand2+"-"+Rand3);
			i++;
		}
	}
}
