package application;

/**
 * Berechnet das Formelrad
 * @author Peter Rutschmann
 * @version 13.09.2018
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
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ wiederstand + "]";
	}

	public void calculate() {
		/* Hier auf Grund der vorhanden Werte entscheiden
		 * welche Methode unten aufgerufen werden muss.
		 */
		
		if(leistung != 0 && spannung !=0) {
			System.out.println("test");
			strom = pAusUundI(leistung, spannung);
		}
		
		else if(leistung != 0 && wiederstand != 0) {
			
			strom = pAusUx2durchR(leistung, wiederstand);
		}
		
	}
	
	/* Hier die Methoden mit den Formlen hinzuf�gen
	 */
	
	public double pAusUundI(double leistung, double spannung) {
		return leistung*spannung;
		}
	
	public double pAusUx2durchR(double leistung, double wiederstand) {
		return (leistung * leistung)/wiederstand;
	}
	
}
