package no.hvl.dat109;

/**
 * Klasse for å validere diverse input
 */
public class InputValidator {

	/**
	 * Tar inn et tlf nummer og sjekker om det er gyldig
	 *
	 * @param tlf Tlf nummer som skal sjekkes
	 *
	 * @return boolean true om tlf er gyldig
	 */
	public static boolean validerTlf(String tlf) {
		// sjekker om den har en + foran (for landkode +47 etc.)
		// og at den kun består av tall ellers
		return tlf.matches("\\+?\\d+");
	}

	/**
	 * Sjekker om oppgitt kontonummer er riktig
	 * <p>
	 * Vi godtar kun norske kontonummer
	 *
	 * @param kontonummer Kontomnummeret som skal sjekkes
	 *
	 * @return boolen true om den er gyldig
	 */
	public static boolean validerKontonummer(String kontonummer) {
		return kontonummer.matches("\\d{11}");
	}

	/**
	 * Validerer registreringsnummer
	 * <p>
	 * godtar kun norske registreringsnummer med store bokstaver
	 *
	 * @param regnummer registreringsnummereret som skal sjekkes
	 *
	 * @return boolean true om den er gyldig
	 */
	public static boolean validerRegnummer(String regnummer) {
		return regnummer.matches("[A-Z]\\d{5}");
	}
}
