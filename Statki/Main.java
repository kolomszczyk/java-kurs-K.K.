package statki;

import java.util.Scanner;

public class Main {

	public static void main(String[] argv) {
		
		Statek friend = new Statek(1, 1, 0, 0, 0);
		Statek enemy = new Statek(0, 0, 0, 1, 1);
		
		Scanner scan = new Scanner(System.in);
		int pocisk;
		String pocisk_time;
		while(true) {
			
			// ruch przyjaciela
			System.out.println("przyjaciel - Gdzie mam poslac pocik na przeciwnika");
			
			pocisk = String.valueOF(scan.nextInt());
			enemy.Hit(pocisk);
			
			// ruch przeciwnika
			System.out.println("przeciwnik - Gdzie mam poslac pocis na wroga");
			pocisk = scan.nextInt();
			friend.Hit(pocisk);
			if(!friend.isAlive()) {
				System.out.println("Przeciwnik Wygrywa");
			}
		}
		
		
	}
	
}
