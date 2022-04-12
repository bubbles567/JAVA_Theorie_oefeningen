
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Melding {

    private String berichtTekst;
    private int niveau;
    private String dagAanduiding;
    private LocalDate aanmaakDatum;
    private DayOfWeek dagVanBericht;

    public Melding(String berichtTekst) {
        this(berichtTekst, 1);
    }

    public Melding(String berichtTekst, int niveau) {
        this.berichtTekst = berichtTekst;
        setNiveau(niveau);
        dagAanduiding = "vandaag";
        aanmaakDatum = LocalDate.now();
        dagVanBericht = aanmaakDatum.getDayOfWeek();
    }

    public String getNiveauAlsTekst() {
        if (niveau == 1) {
            return "Mededeling";
        } else if (niveau == 2) {
            return "WAARSCHUWING";
        } else {
            return "NOODSITUATIE!!!";
        }
    }

    public String toString() {
        String s = getNiveauAlsTekst() + ": " + berichtTekst + " ("
                + dagAanduiding + ", " + dagVanBericht + " " + aanmaakDatum + ")";
        return s;
    }

    public void setNiveau(int niveau) {
        if (niveau < 1) {
            this.niveau = 1;
        } else if (niveau > 3) {
            this.niveau = 3;
        } else {
            this.niveau = niveau;
        }
    }
	
	public void setAangepasteDag(DayOfWeek aangepasteDag) {
        DayOfWeek teVergelijkenDag = this.dagVanBericht;    // originele dag
        this.dagVanBericht = aangepasteDag;                 // nieuwe dag
        boolean tenMinsteEenDagVersprongen = false;

        while (teVergelijkenDag.getValue() != aangepasteDag.getValue()) {
            // Niet de DayOfWeek-objecten direct vergelijken, maar de ints

            teVergelijkenDag = teVergelijkenDag.plus(1);    // verklein verschil

            aanmaakDatum = aanmaakDatum.plusDays(1);        // ook datum nog mee
            if (!tenMinsteEenDagVersprongen) {
                dagAanduiding = "morgen";                   // eerste iteratie
                tenMinsteEenDagVersprongen = true;
            } else {
                dagAanduiding = "over" + dagAanduiding;     // vervolgloops
            }
        }
    }

    public String getBerichtTekst() {
        return berichtTekst;
    }

    public int getNiveau() {
        return niveau;
    }

    public String getDagAanduiding() {
        return dagAanduiding;
    }

    public LocalDate getAanmaakDatum() {
        return aanmaakDatum;
    }

    public DayOfWeek getDagVanBericht() {
        return dagVanBericht;
    }

}
