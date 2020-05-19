package spoj.pesel;

import java.util.*;

public class Main {
	
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt();
		for(int j=0; j<howMany; j++) {
			Main m = new Main(scan.nextLong());
			int sum = 0;
		// wylicza sume
			for(int i=0; i<11; i++) {
				if(i==0 || i==4 || i==8 || i==10) {
					// 1
					sum = sum + (m.get(i) * 1);
					//System.out.println(i+1 + ": " + "*1 "+ m.get(i) + " " + sum );
				} else
				if(i==1 || i==5 || i==9) {
					// 3
					sum = sum + (m.get(i) * 3);
					//System.out.println(i+1+ ": " + "*3 "+ m.get(i) + " " + sum);
				}else
				if(i==2 || i==6) {
					// 7
					sum = sum + (m.get(i) * 7);
					//System.out.println(i+1+ ": " + "*7 " + m.get(i) + " " + sum);
				} else
				if(i==3 || i==7) {
					// 9
					sum = sum + (m.get(i) * 9);
					//System.out.println(i +1+ ": " + "*9 " + m.get(i) + " " + sum);
				}
			}
			//System.out.println("end : " + sum);
			if(sum%10 == 0) 
				System.out.println("D");
			else
				System.out.println("N");
		}
			
		scan.close();
		
	}	

	/////////////////////////////////////////////
	private String value= null;
	
	public void add(long value) {
		this.value = String.valueOf(value);
	}

	public int get(int i) {
		return Integer.valueOf(this.value.substring(i, i+1));
	
	}
	
	public Main(long value) {
		this.add(value);
	}
	
}
	

