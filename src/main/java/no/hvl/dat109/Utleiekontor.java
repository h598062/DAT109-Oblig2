package no.hvl.dat109;

public class Utleiekontor {
	private int nesteKontorNummer = 1;
	private int kontorNummer;
	private String adresse;
	private String telefon;

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
