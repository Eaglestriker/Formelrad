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
	private double widerstand;

	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
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

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + ", spannung=" + spannung + ", strom=" + strom + ", widerstand="
				+ widerstand + "]";
	}

	public void calculate() {
		/*
		 * Hier auf Grund der vorhanden Werte entscheiden welche Methode unten
		 * aufgerufen werden muss.
		 */

		if(spannung != 0 && strom != 0) {
			System.out.println("test");
			leistung = pAusUundI(spannung, strom);
			widerstand = rAusUundI(spannung, strom);
		}

		else if(spannung != 0 && widerstand != 0) {

			leistung = pAusUx2durchR(spannung, widerstand);

		}

		else if(widerstand != 0 && strom != 0) {

			leistung = pAusRundIx2(widerstand, strom);
			spannung = uAusRundI(widerstand, strom);
		}
		
		else if(leistung != 0 && strom != 0) {
			
			spannung = uAusPundI(leistung, strom);
			widerstand = rAusPundI(leistung, strom);
		}
		
		else if(leistung != 0 && widerstand != 0) {
			
			spannung = uAusPundRwurzel(leistung, widerstand);
		}
		
		else if(spannung != 0 && leistung != 0) {
			
			widerstand = rAusUundP(spannung, leistung);
		}

	}

	/*
	 * Hier die Methoden mit den Formlen hinzuf�gen
	 */

	public double pAusUundI(double spannung, double strom) {
		return spannung * strom;
	}

	public double pAusUx2durchR(double spannung, double widerstand) {
		return (spannung * spannung) / widerstand;
	}

	public double pAusRundIx2(double widerstand, double strom) {

		return widerstand * (strom * strom);
	}

	public double uAusRundI(double widerstand, double strom) {

		return widerstand * strom;
	}
	
	public double uAusPundI(double leistung, double strom) {
		
		return leistung / strom;
	}
	
	public double uAusPundR(double leistung, double strom) {
		
		return leistung / strom;
	}

	public double uAusPundRwurzel(double leistung, double widerstand) {
	
	double ergebnis = Math.sqrt(leistung * widerstand);
	return ergebnis;
	}
	
	public double rAusUundI(double spannung, double widerstand) {
		
		return spannung / widerstand;
	}
	
	public double rAusPundI(double leistung, double strom) {
		
		return leistung / (strom * strom);
	}
	
	public double rAusUundP(double spannung, double leistung) {
		
		return (spannung * spannung) / leistung;
	}
	
	
	
}
