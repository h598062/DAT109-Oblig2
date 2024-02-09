package no.hvl.dat109;

public class Main {
	public static void main(String[] args) {
		Selskap selskap = new Selskap("Akat Utleie og Kebab AS & Co", "42069666", "Nesttunvegen 99, 5221 Nesttun");
		lagTestData(selskap);

		DataSystem.startSystem(selskap);
	}

	/**
	 * Lager test data slik at vi slipper å legge inn data hver gang
	 *
	 * @param selskap
	 */
	private static void lagTestData(Selskap selskap) {
		Utleiekontor uk = new Utleiekontor("Nesttunvegen 99, 5221 Nesttun", "12345678");
		Utleiekontor uk2 = new Utleiekontor("Giskegjerde 69", "87654321");
		Utleiekontor uk3 = new Utleiekontor("Pokemongaten 12", "444444");
		selskap.leggTilUtleieKontor(uk);
		selskap.leggTilUtleieKontor(uk2);
		selskap.leggTilUtleieKontor(uk3);

		Bil kasseBil = new Bil("EB42069", "Rollis Roycis", "Ghost", "kvit", BilKategori.A);
		Bil kasseBil2 = new Bil("AB12345", "Mercedes-Benz", "S-Class", "Black", BilKategori.A);
		Bil kasseBil3 = new Bil("CC98765", "BMW", "X5", "Silver", BilKategori.B);
		Bil kasseBil4 = new Bil("BD24680", "Audi", "A4", "Blue", BilKategori.C);
		Bil kasseBil5 = new Bil("DA54321", "Toyota", "Camry", "Red", BilKategori.D);
		Bil kasseBil6 = new Bil("AC67890", "Tesla", "Model 3", "White", BilKategori.A);
		Bil kasseBil7 = new Bil("CB13579", "Lamborghini", "Huracan", "Yellow", BilKategori.B);
		Bil kasseBil8 = new Bil("DC97531", "Ferrari", "488 GTB", "Red", BilKategori.C);
		Bil kasseBil9 = new Bil("BA24680", "Porsche", "911", "Green", BilKategori.D);
		Bil kasseBil10 = new Bil("BB98765", "Ford", "Mustang", "Blue", BilKategori.A);
		Bil kasseBil11 = new Bil("CD86420", "Chevrolet", "Corvette", "Orange", BilKategori.B);

		uk.leggTilBil(kasseBil);
		uk.leggTilBil(kasseBil3);
		uk.leggTilBil(kasseBil2);
		uk2.leggTilBil(kasseBil4);
		uk2.leggTilBil(kasseBil5);
		uk2.leggTilBil(kasseBil6);
		uk2.leggTilBil(kasseBil7);
		uk3.leggTilBil(kasseBil8);
		uk3.leggTilBil(kasseBil9);
		uk3.leggTilBil(kasseBil10);
		uk.leggTilBil(kasseBil11);

		Kunde kunde1 = new Kunde("Crissiboiiii", "España Rojo", "Chili", "47031975");
	}
}
