package com.Windesheim.Java.opgave2;

public class Bankbiljet
{
	private int getal;
	private Munteenheid munteenheid;

	public Bankbiljet() { }

	public Bankbiljet( int getal, Munteenheid munteenheid ) {
		this.getal = getal;
		this.munteenheid = munteenheid;
	}

	// gelijk als getal en munteenheid gelijk zijn.
	public boolean equals( Bankbiljet obj ) {
		return
				this.getal == obj.getal
				&& this.munteenheid == obj.munteenheid;
	}
}
