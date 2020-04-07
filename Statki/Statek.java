package statki;

public class Statek {

	short[] bord;
	
	public Statek (short[] x) {
		short[] bord = x;
		this.bord = bord;
	}
	
	
	public boolean isHit(int x) {
		if (this.bord[x] == 1 || this.bord[x] == 2) 
			return true; 
		else
			return false;
	}
	
	
	public boolean isAlive() {
		for(int i= 0; i< this.bord.length; i++) {
			if (this.bord[i] == 1) {
				return true;
			}
		}
		return false;
	}
	
	private void Hit(int x) {
		if(!isAlive(x)) {
			System.out.println("Trafiono");
			this.bord[x] = 2;
		}
		else {
			System.out.println("Nie trafiono lub juz trafiono");
		}
	}
}
