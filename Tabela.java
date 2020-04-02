
import java.util.Scanner;

public class Tabela {
	
	public static void main(String[] argv) {
	
		Scanner scaner = new Scanner(System.in);
		System.out.println("Podaj x: ");
		int x= scaner.nextInt();
		System.out.println("Podaj y: ");
		int y= scaner.nextInt();
		int[][] tab = new int[x][y];
		int number= 0;
		for(int i= 0; i<x; i++) {
			for(int j=0; j<y; j++) {
				tab[i][j]= number;
				number++;
			}
		}
		
		System.out.println(tab[x-1][y-1]);	

	}
}
