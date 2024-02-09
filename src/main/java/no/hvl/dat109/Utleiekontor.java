package no.hvl.dat109;

import java.time.LocalDate;
import java.time.LocalTime;
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
	private List<Utleie> utleier;

	/**
	 * Konstruktør for utleikontor
	 * Kontor nummer blir opprettet automatisk
	 *
	 * @param adresse Hvor befinner utleiekontoret seg?
	 * @param telefon hva er  telefonnummeret?
	 */
	public Utleiekontor(String adresse, String telefon) {
		this.adresse = adresse;
		this.telefon = telefon;
		kontorNummer = nesteKontorNummer++;
		bilar         = new ArrayList<>();
		reservasjoner = new ArrayList<>();
		utleier       = new ArrayList<>();
	}

	public void leverBil() {
		String telefonNummer = faaTelefonNummer();
		List<Utleie> asda = utleier.stream()
		                                      .filter(k -> k.getKunde()
		                                                    .getTelefonnummer()
		                                                    .equals(telefonNummer))
		                                      .toList();
		Utleie utleie = null;
		if (asda.isEmpty()) {
			System.out.println("Fant ingen utleier på dette nummeret, prøv på nytt");
			return;
		} else if (asda.size() == 1) {
			utleie = asda.getFirst();
		} else {
			System.out.println("Hvilke bil ynche du å levera?");
			utleie = MenyValgHelper.lagMenyValg(asda);
		}

		utleie.setDatoLevert(LocalDate.now());
		utleie.setTidspunktHent(LocalTime.now());

		utleie.getBil().setLedigStatus(true);

		Regning regning = utleie.opprettRegning(utleie.getDatoLevert(), this);
		utleie.setRegning(regning);

		System.out.println("Du har nå levert inn:\n" + utleie);
	}

	public List<Reservasjon> getReservasjoner() {
		return reservasjoner;
	}



	private static String faaTelefonNummer() {
		String tlf = ConsoleInputHelper.getString("Hvem heter din telefon nummeret");
		while (!InputValidator.validerTlf(tlf)) {
			System.out.println("Ikke gyldig telefonnummer, kan kun inneholde tall");
			tlf = ConsoleInputHelper.getString("Hvem heter din telefon nummeret");
		}
		return tlf;
	}

	public void hentBil() {
		String telefonNummer = faaTelefonNummer();
		List<Reservasjon> asda = reservasjoner.stream()
		                                      .filter(k -> k.getKunde()
		                                                    .getTelefonnummer()
		                                                    .equals(telefonNummer))
		                                      .toList();
		Reservasjon reservasjon = null;
		if (asda.isEmpty()) {
			System.out.println("Fant ingen reservasjoner på dette nummeret");
			return;
		} else if (asda.size() == 1) {
			reservasjon = asda.getFirst();
		} else {
			System.out.println("Kvilken reservasjon ynche du å henta?");
			reservasjon = MenyValgHelper.lagMenyValg(asda);
		}
		System.out.println("Bilen din er nå hentet\n" + reservasjon.toString());
		Utleie utleie = new Utleie(this, 0 , LocalDate.now(), LocalTime.now(),
		                             LocalDate.now().plusDays(reservasjon.getAntallDager()),
		                             LocalTime.now().plusHours(reservasjon.getAntallDager() * 24),
		                             reservasjon.getKunde().lagKredittKort(), reservasjon.getKunde(), reservasjon, reservasjon.getBil());

		reservasjon.getBil().setLedigStatus(false);
		this.leggTilUtleie(utleie);
		reservasjon.setHentet(true);
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
		return "Kontor " + kontorNummer + " - Adresse: " + adresse + " - Tlf: " + telefon;
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

	public void leggTilUtleie(Utleie utleie) {utleier.add(utleie);}
}
