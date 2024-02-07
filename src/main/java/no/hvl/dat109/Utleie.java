package no.hvl.dat109;

import java.time.LocalDateTime;

public class Utleie {

	private Utleiekontor henteSted;
	private Utleiekontor levertSted;
	private int kilometerstandVedHent;
	private int kilometerstandVedRetur;
	private LocalDateTime datoHent;
	private LocalDateTime datoForventetLevert;
	private LocalDateTime datoLevert;
	private String kredittkort;
	private Regning regning;

	public Utleie(Utleiekontor henteSted, int kilometerstandVedHent, LocalDateTime datoHent, LocalDateTime datoForventetLevert, String kredittkort) {
		this.henteSted             = henteSted;
		this.kilometerstandVedHent = kilometerstandVedHent;
		this.datoHent              = datoHent;
		this.datoForventetLevert   = datoForventetLevert;
		this.kredittkort           = kredittkort;
	}
}
