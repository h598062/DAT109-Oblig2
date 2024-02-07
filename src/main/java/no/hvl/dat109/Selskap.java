package no.hvl.dat109;

public class Selskap {
	private String navn;
	private int telefon;
	private String firmaadresse;

	public Selskap(String navn,int telefon, String firmaadresse) {
		this.navn = navn;
		this.telefon = telefon;
		this.firmaadresse = firmaadresse;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public String getFirmaadresse() {
		return firmaadresse;
	}

	public void setFirmaadresse(String firmaadresse) {
		this.firmaadresse = firmaadresse;
	}
}
