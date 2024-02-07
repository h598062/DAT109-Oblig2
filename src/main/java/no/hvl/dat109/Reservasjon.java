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

	public String getSted() {
		return sted;
	}

	public void setSted(String sted) {
		this.sted = sted;
	}

	public LocalDate getDato() {
		return dato;
	}

	public void setDato(LocalDate dato) {
		this.dato = dato;
	}

	public LocalTime getKlokkeslett() {
		return klokkeslett;
	}

	public void setKlokkeslett(LocalTime klokkeslett) {
		this.klokkeslett = klokkeslett;
	}

	public int getAntallDager() {
		return antallDager;
	}

	public void setAntallDager(int antallDager) {
		this.antallDager = antallDager;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}
}