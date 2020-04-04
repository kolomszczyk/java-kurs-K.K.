
public class First {
	
	public static void main(String[] argv) {
		
		// wejscie
		int n = -1;
		// sprawdzenie czy liczba jest dodatnia
		if(n < 0) {
			System.out.println("Liczba "+ n+ " nie jest liczba pierwsza");
			return;
		}
		// tworzenie tablicy 
		boolean[] tab = new boolean[n+1];
		
		// sito erastotelesa 
		
		for (int i=2; i <= Math.sqrt(n); i++) {
			
			if(tab[i] == false) {
			
				for(int j = i+i; j <= n; j= j+i) {
						tab[j] = true;
				}
			}
		}
		tab[0] = true; tab[1] = true;
		// sprawdzenie czy liczba jest pierwsza 
		if (tab[n] == false) 
			System.out.println("Liczba "+ n+ " jest liczba pierwsza");
		else
			System.out.println("Liczba "+ n+ " nie jest liczba pierwsza");
	}
}
