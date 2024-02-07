package no.hvl.dat109;

/**
 * Klasse for utleikontor
 */
public class Utleiekontor {
	private int nesteKontorNummer = 1;
	private int kontorNummer;
	private String adresse;
	private String telefon;

	/**
	 * Konstruktør for utleikontor
	 * Kontor nummer blir opprettet automatisk
	 * @param adresse Hvor befinner utleiekontoret seg?
	 * @param telefon hva er  telefonnummeret?
	 */
	public Utleiekontor(String adresse, String telefon) {
		this.adresse = adresse;
		this.telefon = telefon;
		kontorNummer = nesteKontorNummer;
		nesteKontorNummer++;
	}

	public int getKontorNummer() {
		return kontorNummer;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getTelefon() {
		return telefon;
	}
}
