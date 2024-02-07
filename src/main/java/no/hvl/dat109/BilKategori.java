package no.hvl.dat109;

public enum BilKategori {
	A(800), B(1200), C(1800), D(2500);

	private final int pris;
	BilKategori(int pris) {
		this.pris = pris;
	}

	public int pris() {
		return pris;
	}
}
