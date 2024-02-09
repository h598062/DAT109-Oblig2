package no.hvl.dat109;

import java.util.Scanner;

public class ConsoleInputHelper {

	private static final Scanner s = new Scanner(System.in);

	/**
	 * Henter en String fra console, og sjekker om den e gyldig
	 * @param message Meldinger som vises til brukeren
	 * @param error Feilmelding som vises hvis det er noe feil
	 * @param min Minimum lengde på String
	 * @param max Max lengde på String
	 * @return Stringen
	 */
	public static String getString(String message, String error, int min, int max) {
		System.out.println(message);
		boolean invalid = true;
		String result = "";
		while (invalid) {
			System.out.print("Input: ");
			result = s.nextLine();
			if (result.length() >= min && result.length() <= max) {
				invalid = false;
			} else {
				System.out.println(error);
			}
		}
		return result;
	}

	public static String getString(String message, String error) {
		return getString(message, error, -1, 100);
	}

	public static String getString(String message) {
		return getString(message, "Ugyldig input", -1, 100);
	}

	/**
	 * Henter et tall fra console, sjekker at d blir riktig og spør på nytt om det går gale
	 * @param message Spørsmålet brukeren får før de skal skrive
	 * @param error Feilmelding som kommer om de skriver feil
	 * @return Et tall (int)
	 */
	public static int getInt(String message, String error) {
		System.out.println(message);
		boolean invalid = true;
		int result = -1;
		while (invalid) {
			System.out.print("Input: ");
			try {
				result = Integer.parseInt(s.nextLine());
				invalid = false;
			} catch (NumberFormatException e) {
				System.out.println(error);
			}
		}
		return result;
	}

	public static int getInt(String message) {
		return getInt(message, "Du kan kun skrive inn gyldige heltall, prøv igjen");
	}
}
