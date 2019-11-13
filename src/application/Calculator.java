package application;

/**
 * Berechnet das Formelrad
 * 
 * @author Tim Dubath und Yannick Ruck
 * @version 13.11.2019
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double wiederstand;

	public Calculator(double leistung, double spannung, double strom, double wiederstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.wiederstand = wiederstand;
	}

	public double getLeistung() {
		return leistung;
	}

	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiederstand() {
		return wiederstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + ", spannung=" + spannung + ", strom=" + strom + ", widerstand="
				+ wiederstand + "]";
	}

	public void calculate() {
		/*
		 * Hier auf Grund der vorhanden Werte entscheiden welche Methode unten
		 * aufgerufen werden muss.
		 */

		if(spannung != 0 && strom != 0) {
			System.out.println("test");
			leistung = pAusUundI(spannung, strom);
		}

		else if(spannung != 0 && wiederstand != 0) {

			leistung = pAusUx2durchR(spannung, wiederstand);

		}

		else if(wiederstand != 0 && strom != 0) {

			leistung = pAusRundIx2(wiederstand, strom);
			spannung = uAusRundI(wiederstand, strom);
		}
		
		else if(leistung != 0 && strom != 0) {
			
			spannung = uAusPundI(leistung, strom);
		}

	}

	/*
	 * Hier die Methoden mit den Formlen hinzuf�gen
	 */

	public double pAusUundI(double spannung, double strom) {
		return spannung * strom;
	}

	public double pAusUx2durchR(double spannung, double wiederstand) {
		return (spannung * spannung) / wiederstand;
	}

	public double pAusRundIx2(double wiederstand, double strom) {

		return wiederstand * (strom * strom);
	}

	public double uAusRundI(double wiederstand, double strom) {

		return wiederstand * strom;
	}
	
	public double uAusPundI(double leistung, double strom) {
		
		return leistung / strom;
	}
	
}
