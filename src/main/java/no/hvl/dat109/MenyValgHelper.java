package no.hvl.dat109;

import java.util.List;
import java.util.Scanner;

public class MenyValgHelper {

	private static Scanner s = new Scanner(System.in);

	/**
	 * Lager en menyvalg liste ut ifra en liste med elementer
	 *
	 * @param valgMuligheter Liste med elementer som kan velges mellom
	 * @param <T>            Typen til elementet
	 *
	 * @return Det valgte elementet
	 */
	public static <T> T lagMenyValg(List<T> valgMuligheter) {
		if (valgMuligheter == null) {
			return null;
		}
		boolean invalid = true;
		T retur = null;
		while (invalid) {
			for (int i = 0; i < valgMuligheter.size(); i++) {
				System.out.printf(
						"%d. %s%n",
						i,
						valgMuligheter.get(i)
						              .toString());
			}
			System.out.print("Valg: ");
			String in = s.nextLine();
			try {
				int j = Integer.parseInt(in);
				retur = valgMuligheter.get(j);
				invalid = false;
			} catch (NumberFormatException | IndexOutOfBoundsException e) {
				System.out.println("Feil ved input, prøv igjen");
			}
		}
		System.out.println();
		return retur;
	}

	/**
	 * Lager en menyvalg liste ut ifra en gitt liste med visningstekst
	 * @param valgMuligheter Liste med tekst for valgmuligheter
	 * @return int tall som representerer det valget som ønskes, tilsvarer posisjon i input liste
	 */
	public static int lagEnkelMenyValg(List<String> valgMuligheter) {
		if (valgMuligheter == null) {
			return -1;
		}
		boolean invalid = true;
		int retur = -1;
		while (invalid) {
			for (int i = 0; i < valgMuligheter.size(); i++) {
				System.out.printf(
						"%d. %s%n",
						i, valgMuligheter.get(i));
			}
			System.out.print("Valg: ");
			String in = s.nextLine();
			try {
				retur = Integer.parseInt(in);
				invalid = false;
			} catch (NumberFormatException e) {
				System.out.println("Feil ved input, prøv igjen");
			}
		}
		System.out.println();
		return retur;
	}
}
