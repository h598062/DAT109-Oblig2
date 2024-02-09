package no.hvl.dat109;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * En utleie blir opprettet når en bil er hentet og kunden har den
 */
public class Utleie {

	private Utleiekontor henteSted;
	private Utleiekontor levertSted;
	private int kilometerstandVedHent;
	private int kilometerstandVedRetur;
	private LocalDate datoHent;
	private LocalTime tidspunktHent;
	private LocalDate datoForventetLevert;
	private LocalTime tidspunktForventetLevert;
	private LocalDate datoLevert;
	private LocalTime tidspunktLevert;
	private String kredittkort;
	private Regning regning;
	private Kunde kunde;

	public Utleie(
			Utleiekontor henteSted, int kilometerstandVedHent, LocalDate datoHent, LocalTime tidspunktHent, LocalDate datoForventetLevert,
			LocalTime tidspunktForventetLevert, String kredittkort, Kunde kunde) {
		this.henteSted                = henteSted;
		this.kilometerstandVedHent    = kilometerstandVedHent;
		this.datoHent                 = datoHent;
		this.tidspunktHent            = tidspunktHent;
		this.datoForventetLevert      = datoForventetLevert;
		this.tidspunktForventetLevert = tidspunktForventetLevert;
		this.kredittkort              = kredittkort;
		this.kunde                    = kunde;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setTidspunktHent(LocalTime tidspunktHent) {
		this.tidspunktHent = tidspunktHent;
	}

	public LocalDate getDatoLevert() {
		return datoLevert;
	}

	public void setDatoLevert(LocalDate datoLevert) {
		this.datoLevert = datoLevert;
	}

	public void setRegning(Regning regning) {
		this.regning = regning;
	}

	public Regning opprettRegning(LocalDate datoLevert, Utleiekontor utleiekontor) {
		return new Regning(datoLevert, utleiekontor);
	}
}
