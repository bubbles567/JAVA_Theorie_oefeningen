package com.Windesheim.Java.opgave2;

import java.util.Arrays;

//vraag 3
public class Verkiezingen{
	private int[] stemmen;
	private int aantalStemmen;

	// vraag (a) https://www.javatpoint.com/java-initialize-array
	public Verkiezingen( int aantalKandidaten ) {
		// datatype [] arrayName = new datatype [ size ]
		this.stemmen = new int[aantalKandidaten];
	}

	// vraag (b)
	public void stemOp( int kandidaatnr ) {
		try {
			var kandidaat = this.stemmen[kandidaatnr];
			kandidaat++;
			this.stemmen[kandidaatnr] = kandidaat;
		} catch (IndexOutOfBoundsException indexOutOfBoundsException) {
			System.out.println("gebruiker " + kandidaatnr + " bestaat niet");
		}
	}



	// vraag (b)
	public void print() {
		if(aantalStemmen >= 0){
			aantalStemmen ++;
		}
	}
}
