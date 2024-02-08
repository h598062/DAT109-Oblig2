package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Klasse for utleikontor
 */
public class Utleiekontor {
	private static int nesteKontorNummer = 1;
	private int kontorNummer;
	private String adresse;
	private String telefon;

	private List<Bil> bilar;
	private List<Reservasjon> reservasjoner;

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
		bilar = new ArrayList<>();
		reservasjoner = new ArrayList<>();
	}

	public static void leverBil() {
	}

	public List<Reservasjon> getReservasjoner() {
		return reservasjoner;
	}

	public static void hentBil(Selskap selskap) {

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

	public List<Bil> getBilar() {
		return bilar;
	}

	public List<Bil> ledigeBilar() {
		return bilar.stream()
				.filter(Bil::getLedigStatus)
				.toList();
	}

	@Override
	public String toString() {
		return "Utleiekontor{" + "kontorNummer=" + kontorNummer + ", adresse='" + adresse + '\'' + ", telefon='" + telefon + '\'' + ", bilar=" +
		       bilar + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Utleiekontor that = (Utleiekontor) o;
		return kontorNummer == that.kontorNummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kontorNummer);
	}

	public void leggTilBil(Bil bil) {
		bilar.add(bil);
	}

	public void leggTilReservasjon(Reservasjon reservasjon) {
		reservasjoner.add(reservasjon);
	}
}
