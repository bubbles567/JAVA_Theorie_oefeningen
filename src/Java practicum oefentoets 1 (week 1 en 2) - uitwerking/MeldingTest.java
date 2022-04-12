import java.time.DayOfWeek;

public class MeldingTest {

    public static void main(String[] args) {

        Melding m1 = new Melding("Hallo hallo!");
        System.out.println(m1);
        m1.setNiveau(2);
        System.out.println(m1);
		
		int niveau = 2;
        Melding melding2 = new Melding("De kantine is gesloten.", niveau);
        System.out.println(melding2);

        melding2.setAangepasteDag(DayOfWeek.SATURDAY);
        System.out.println(melding2);

    }

}
