package no.hvl.dat109;

import java.util.Random;

/**
 * Lage en kunde
 */
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

	public String getTelefonnummer() {
		return telefonnummer;
	}


	/**
	 * Lager et tilfeldig kredittkort nummer
	 * @return String tilfeldig kredittkort nummer
	 */
	public String lagKredittKort() {
		StringBuilder kredittkort = new StringBuilder();

		for (int i = 0; i < 4; i++) {
			int randomTall = new Random().nextInt(1000, 9999);

			if (i < 3) {
				kredittkort.append(" ");
			}

			kredittkort.append(randomTall);
		}
		return kredittkort.toString();
	}

	@Override
	public String toString() {
		return fornavn + " " + etternavn + " - Tlf: " + telefonnummer + " - Adresse: " + adresse;
	}
}
