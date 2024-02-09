package no.hvl.dat109;

import java.time.LocalDate;

public class Regning {
	private static int regning_teller = 1000;

	private int regning_nr;

	private LocalDate dato;

	private Utleiekontor utleiekontor;

	public Regning (LocalDate dato, Utleiekontor utleiekontor) {
		this.regning_nr = regning_teller++;
		this.dato = dato;
		this.utleiekontor = utleiekontor;
	}

	public int getRegning_nr() {
		return regning_nr;
	}

	public void setRegning_nr(int regning_nr) {
		this.regning_nr = regning_nr;
	}

	public LocalDate getDato() {
		return dato;
	}

	public void setDato(LocalDate dato) {
		this.dato = dato;
	}

	public Utleiekontor getUtleiekontor() {
		return utleiekontor;
	}

	public void setUtleiekontor(Utleiekontor utleiekontor) {
		this.utleiekontor = utleiekontor;
	}
}
