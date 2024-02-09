package no.hvl.dat109;

public class Main {
	public static void main(String[] args) {
		Selskap selskap = new Selskap("Akat Utleie og Kebab AS & Co", "42069666", "Nesttunvegen 99, 5221 Nesttun");
		lagTestData(selskap);

		DataSystem.startSystem(selskap);
	}

	/**
	 * Lager test data slik at vi slipper å legge inn data hver gang
	 * @param selskap
	 */
	private static void lagTestData(Selskap selskap) {
		Utleiekontor uk = new Utleiekontor("Nesttunvegen 99, 5221 Nesttun", "12345678");
		Utleiekontor uk2 = new Utleiekontor("Giskegjerde 69", "87654321");
		selskap.leggTilUtleieKontor(uk);
		selskap.leggTilUtleieKontor(uk2);

		Bil kasseBil = new Bil("EB42069", "Rollis Roycis",
		                       "Ghost", "kvit", BilKategori.A);
		uk.leggTilBil(kasseBil);

		Kunde kunde1 = new Kunde("Crissiboiiii",
		                         "España Rojo",
		                         "Chili", "47031975");
	}
}
