package no.hvl.dat109;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Lager en reservasjon
 */
public class Reservasjon {
	private Utleiekontor sted;
	private Utleiekontor destinasjon;
	private LocalDate dato;
	private LocalTime klokkeslett;
	private Kunde kunde;
	private int antallDager;
	private double pris;
	private Bil bil;
	boolean hentet;

	public Reservasjon(
			Utleiekontor sted, Utleiekontor destinasjon, LocalDate dato, LocalTime klokkeslett, Kunde kunde, int antallDager, double pris, Bil bil) {
		this.sted        = sted;
		this.destinasjon = destinasjon;
		this.dato        = dato;
		this.klokkeslett = klokkeslett;
		this.kunde       = kunde;
		this.antallDager = antallDager;
		this.pris        = pris;
		this.bil         = bil;
		hentet           = false;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setHentet(boolean hentet) {
		this.hentet = hentet;
	}

	public Bil getBil() {
		return bil;
	}

	public int getAntallDager() {
		return antallDager;
	}


	@Override
	public String toString() {
		return "Bil: " + bil + "\nLokasjon: " + sted + "\nDato: " + dato + " " + klokkeslett + "\nLeveringssted: " + destinasjon + "\nPris: " + pris;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}
}
