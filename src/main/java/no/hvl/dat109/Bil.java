package no.hvl.dat109;


public class Bil {
	private String registreningsnummer;
	private String merke;
	private String modell;
	private String farge;
	private String utleigegruppe;
	private String ledigStatus;

public Bil(String registreningsnummer, String merke, String modell, String farge, String utleigegruppe, String ledigStatus) {
	this.registreningsnummer = registreningsnummer;
	this.merke = merke;
	this.modell =  modell;
	this.farge = farge;
	this.utleigegruppe = utleigegruppe;
	this.ledigStatus = ledigStatus;
}

}
