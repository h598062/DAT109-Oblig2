package no.hvl.dat109;

public class Utleiekontor {
	private int nesteKontorNummer = 1;
	private int kontorNummer;
	private String adresse;
	private int telefon;

	public Utleiekontor(String adresse, int telefon) {
		this.adresse = adresse;
		this.telefon = telefon;
		this.kontorNummer = nesteKontorNummer;
		nesteKontorNummer++;
	}

	public int getKontorNummer() {
		return kontorNummer;
	}

	public String getAdresse() {
		return adresse;
	}

	public int getTelefon() {
		return telefon;
	}
}
