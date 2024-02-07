package no.hvl.dat109;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservasjon {
	private String sted;
	private LocalDate dato;
	private LocalTime klokkeslett;
	private int antallDager;
	private double pris;

	public Reservasjon(String sted, LocalDate dato, LocalTime klokkeslett, int antallDager, double pris) {
		this.sted        = sted;
		this.dato        = dato;
		this.klokkeslett = klokkeslett;
		this.antallDager = antallDager;
		this.pris        = pris;
	}
}