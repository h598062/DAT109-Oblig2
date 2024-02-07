package no.hvl.dat109;

public class Kunde {
	private String fornavn;
	private String etternavn;
	private String adresse;
	private String telefonnummer;

	public Kunde(String fornavn, String etternavn, String adresse, String telefonnummer) {
		this.fornavn       = fornavn;
		this.etternavn     = etternavn;
		this.adresse       = adresse;
		this.telefonnummer = telefonnummer;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
}
