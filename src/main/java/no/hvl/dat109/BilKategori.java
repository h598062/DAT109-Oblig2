package no.hvl.dat109;

/**
 * Enum for å si bestemme hvilke størrelse og gruppe en bil hører til
 */
public enum BilKategori {
	A(800), B(1200), C(1800), D(2500);

	private final int pris;
	BilKategori(int pris) {
		this.pris = pris;
	}

	public int pris() {
		return pris;
	}

	@Override
	public String toString() {
		return name() + " - Pris: " + pris();
	}
}
