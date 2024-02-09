package no.hvl.dat109;

import java.time.LocalDate;

/**
 * Lager en regning som blir levert ut når en utleie er levert
 */
public class Regning {
	private static int regning_teller = 1000;

	private int regning_nr;

	private LocalDate dato;

	private Utleiekontor utleiekontor;

	private double pris;

	public Regning(LocalDate dato, Utleiekontor utleiekontor, double pris) {
		this.pris         = pris;
		this.regning_nr   = regning_teller++;
		this.dato         = dato;
		this.utleiekontor = utleiekontor;
	}

	@Override
	public String toString() {
		return "Regning nummer: " + regning_nr + " - Dato: " + dato + " - Pris: " + pris;
	}
}
