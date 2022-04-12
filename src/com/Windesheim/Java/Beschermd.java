package com.Windesheim.Java;

//vraag 1
public class Beschermd {
	private int getal = 12345;
	private static int aantalSlechteWaardes = 0;
	private static int aantalGoedeWaardes = 0;

	public Beschermd(int getal){
		this.getal = getal;
		getalBeschermd(getal);
	}


	public void setGetal(int getal) {
		getalBeschermd(getal);
		this.getal = getal;
	}

	@Override
	public String toString() {
		return getalBeschermd(getal) + "\n" +  "Beschermd : getal = " + getal;
	}
	public static void printLogging(){
		System.out.println(" # ok = "+ aantalGoedeWaardes + "# mag niet = " + aantalSlechteWaardes);
	}

	private String getalBeschermd(int getal){
		if(getal > 10){
			aantalGoedeWaardes++;
			return "ok";
		}
		aantalSlechteWaardes++;
		return "mag niet";

	}

}
