package no.hvl.dat109;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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

	public Utleie(
			Utleiekontor henteSted, int kilometerstandVedHent, LocalDate datoHent, LocalTime tidspunktHent, LocalDate datoForventetLevert,
			LocalTime tidspunktForventetLevert, String kredittkort) {
		this.henteSted                = henteSted;
		this.kilometerstandVedHent    = kilometerstandVedHent;
		this.datoHent                 = datoHent;
		this.tidspunktHent            = tidspunktHent;
		this.datoForventetLevert      = datoForventetLevert;
		this.tidspunktForventetLevert = tidspunktForventetLevert;
		this.kredittkort              = kredittkort;
	}

	public Utleiekontor getHenteSted() {
		return henteSted;
	}

	public void setHenteSted(Utleiekontor henteSted) {
		this.henteSted = henteSted;
	}

	public Utleiekontor getLevertSted() {
		return levertSted;
	}

	public void setLevertSted(Utleiekontor levertSted) {
		this.levertSted = levertSted;
	}

	public int getKilometerstandVedHent() {
		return kilometerstandVedHent;
	}

	public void setKilometerstandVedHent(int kilometerstandVedHent) {
		this.kilometerstandVedHent = kilometerstandVedHent;
	}

	public int getKilometerstandVedRetur() {
		return kilometerstandVedRetur;
	}

	public void setKilometerstandVedRetur(int kilometerstandVedRetur) {
		this.kilometerstandVedRetur = kilometerstandVedRetur;
	}

	public LocalDate getDatoHent() {
		return datoHent;
	}

	public void setDatoHent(LocalDate datoHent) {
		this.datoHent = datoHent;
	}

	public LocalTime getTidspunktHent() {
		return tidspunktHent;
	}

	public void setTidspunktHent(LocalTime tidspunktHent) {
		this.tidspunktHent = tidspunktHent;
	}

	public LocalDate getDatoForventetLevert() {
		return datoForventetLevert;
	}

	public void setDatoForventetLevert(LocalDate datoForventetLevert) {
		this.datoForventetLevert = datoForventetLevert;
	}

	public LocalTime getTidspunktForventetLevert() {
		return tidspunktForventetLevert;
	}

	public void setTidspunktForventetLevert(LocalTime tidspunktForventetLevert) {
		this.tidspunktForventetLevert = tidspunktForventetLevert;
	}

	public LocalDate getDatoLevert() {
		return datoLevert;
	}

	public void setDatoLevert(LocalDate datoLevert) {
		this.datoLevert = datoLevert;
	}

	public LocalTime getTidspunktLevert() {
		return tidspunktLevert;
	}

	public void setTidspunktLevert(LocalTime tidspunktLevert) {
		this.tidspunktLevert = tidspunktLevert;
	}

	public String getKredittkort() {
		return kredittkort;
	}

	public void setKredittkort(String kredittkort) {
		this.kredittkort = kredittkort;
	}

	public Regning getRegning() {
		return regning;
	}

	public void setRegning(Regning regning) {
		this.regning = regning;
	}
}
