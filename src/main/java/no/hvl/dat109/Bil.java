package no.hvl.dat109;


public class Bil {
	private String registreningsnummer;
	private String merke;
	private String modell;
	private String farge;
	private String utleigegruppe;
	private boolean ledigStatus;

public Bil(String registreningsnummer, String merke, String modell, String farge, String utleigegruppe) {
	this.registreningsnummer = registreningsnummer;
	this.merke = merke;
	this.modell =  modell;
	this.farge = farge;
	this.utleigegruppe = utleigegruppe;
	ledigStatus = true;
}

	public String getRegistreningsnummer() {
		return registreningsnummer;
	}

	public void setRegistreningsnummer(String registreningsnummer) {
		this.registreningsnummer = registreningsnummer;
	}

	public String getMerke() {
		return merke;
	}

	public void setMerke(String merke) {
		this.merke = merke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public String getUtleigegruppe() {
		return utleigegruppe;
	}

	public void setUtleigegruppe(String utleigegruppe) {
		this.utleigegruppe = utleigegruppe;
	}

	public boolean getLedigStatus() {
		return ledigStatus;
	}

	public void setLedigStatus(boolean ledigStatus) {
		this.ledigStatus = ledigStatus;
	}
}
