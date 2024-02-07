package no.hvl.dat109;

import java.time.LocalDate;

public class Regning {

	private int regning_nr;

	private int faktura;

	private LocalDate dato;

	private String utleiekontor;

	public Regning (int regning_nr,int faktura,LocalDate dato,String utleiekontor) {
		this.regning_nr = regning_nr;
		this.faktura = faktura;
		this.dato = dato;
		this.utleiekontor = utleiekontor;
	}

	public int getRegning_nr() {
		return regning_nr;
	}

	public void setRegning_nr(int regning_nr) {
		this.regning_nr = regning_nr;
	}

	public int getFaktura() {
		return faktura;
	}

	public void setFaktura(int faktura) {
		this.faktura = faktura;
	}

	public LocalDate getDato() {
		return dato;
	}

	public void setDato(LocalDate dato) {
		this.dato = dato;
	}

	public String getUtleiekontor() {
		return utleiekontor;
	}

	public void setUtleiekontor(String utleiekontor) {
		this.utleiekontor = utleiekontor;
	}
}
