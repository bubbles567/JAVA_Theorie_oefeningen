package com.Windesheim.Java.opgave2;

//vraag 2
public class Plaatje
{
	public int pixel1;
	public int pixel2;

	public Plaatje( int pixel1, int pixel2 ) {
		this.pixel1 = pixel1;
		this.pixel2 = pixel2;
	}
	//omdat de pixel 1 en 2 niet refereren naar de pixel waarheen het bedoeld is

	public void toon() {
		System.out.println( "Plaatje: "  + pixel1 + ", " + pixel2 );
	}
}
