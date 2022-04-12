public abstract class Figuur implements Rotatie
{

	protected int kleur;

	public Figuur( int kleur ) { this.kleur = kleur; }

	public void setKleur( int kleur ) { this.kleur = kleur; }


	public abstract double oppervlakte();
}


/*
	// code uit de toets:
	public static void demo_figuren() {
		Figuur figuur = new Rechthoek( 5, 10, 1 );
		System.out.println( figuur );
		System.out.println( figuur.oppervlakte() );
		figuur.roteer();
		System.out.println( figuur );

		Vierkant vierkant = new Vierkant( 4, 13 );

		HeeftZijkanten zijkanter = vierkant;
		int n = zijkanter.getAantalZijkanten();
		System.out.println( n );

		figuur = vierkant;
		System.out.println( figuur );
		System.out.println( figuur.oppervlakte() );
		figuur.roteer();
		System.out.println( figuur );

		figuur = new Cirkel( 2, 77 );
		System.out.println( figuur );
		System.out.println( figuur.oppervlakte() );
		figuur.roteer();
		figuur.setKleur( 808 );
		System.out.println( figuur );
	}

*/