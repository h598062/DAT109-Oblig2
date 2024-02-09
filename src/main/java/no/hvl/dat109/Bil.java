package no.hvl.dat109;

/**
 * Lager en bil
 */
public class Bil {
	private String registreringsnummer;
	private String merke;
	private String modell;
	private String farge;
	private BilKategori utleigegruppe;
	private boolean ledigStatus;

	public Bil(String registreringsnummer, String merke, String modell, String farge, BilKategori utleigegruppe) {
		this.registreringsnummer = registreringsnummer;
		this.merke               = merke;
		this.modell              = modell;
		this.farge               = farge;
		this.utleigegruppe       = utleigegruppe;
		ledigStatus              = true;
	}

	public BilKategori getUtleigegruppe() {
		return utleigegruppe;
	}


	public boolean getLedigStatus() {
		return ledigStatus;
	}

	public void setLedigStatus(boolean ledigStatus) {
		this.ledigStatus = ledigStatus;
	}

	@Override
	public String toString() {
		return "Merke: " + merke + " - Modell: " + modell + " - Farge: " + farge + " - Registreringsnummer: " + registreringsnummer + " - Gruppe: " +
		       utleigegruppe;
	}
}
