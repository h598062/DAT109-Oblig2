package no.hvl.dat109;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DataSystem {
	private static final int fastAvvik = 500;
	private static Scanner s = new Scanner(System.in);

	public static void startSystem(Selskap selskap) {
		boolean avslutt = false;

		while (!avslutt) {
			System.out.println("\nHva vil du gjøre?");
			int svar = MenyValgHelper.lagEnkelMenyValg(List.of(
					"Finne / Reservere bil",
					"Hente bil",
					"Levere bil",
					"Vis alle aktive reservasjoner",
					"Vis alle aktive utleier",
					"Avslutt program"));

			switch (svar) {
				case 0:
					finnBiler(selskap);
					break;
				case 1:
					Utleiekontor uk = velgUtleiekontor(selskap);
					uk.hentBil();
					break;
				case 2:
					Utleiekontor ukkk = velgUtleiekontor(selskap);
					ukkk.leverBil();
					break;
				case 3:
					visAktiveReservasjoner(selskap);
					break;
				case 4:
					visAktiveUtleier(selskap);
					break;
				case 5:
					avslutt = true;
					break;
				default:
					System.out.println(svar + "finnes ikke. Prøv på nytt");
			}
		}
		s.close();

	}

	private static Utleiekontor velgUtleiekontor(Selskap selskap) {
		System.out.println("Hvilke utleiekontor er du på");
		return MenyValgHelper.lagMenyValg(selskap.getUtleiekontorer());
	}

	private static void visAktiveReservasjoner(Selskap selskap) {
		List<Reservasjon> reservasjoner = selskap.getReservasjoner();

		for (Reservasjon reservasjon : reservasjoner) {
			System.out.println(reservasjon.toString());
		}
	}

	private static void visAktiveUtleier(Selskap selskap) {
		List<Bil> alleBiler = selskap.getAlleBiler();
		List<Bil> ikkeLedige = alleBiler.stream()
		                                .filter(x -> !x.getLedigStatus())
		                                .toList();
		for (Bil bil : ikkeLedige) {
			System.out.println(bil.toString());
		}
	}

	private static void finnBiler(Selskap selskap) {
		System.out.println("Velg hvor du vil hente bil");
		List<Utleiekontor> utleiekontorer = selskap.getUtleiekontorer();
		Utleiekontor inputKontor1 = MenyValgHelper.lagMenyValg(utleiekontorer);

		System.out.println("Velg hvor du vil levere bil");
		Utleiekontor inputKontor2 = MenyValgHelper.lagMenyValg(utleiekontorer);

		Bil inputBil = velgBil(inputKontor1);

		reserverBil(inputKontor1, inputKontor2, inputBil);
	}

	private static Bil velgBil(Utleiekontor utleiekontor) {
		List<Bil> ledigeBiler = utleiekontor.ledigeBilar();
		System.out.println("Velg bilkategori:");
		BilKategori menyValg = MenyValgHelper.lagMenyValg(Arrays.asList(BilKategori.values()));

		List<Bil> ledigeBilerMedKategori = ledigeBiler.stream()
		                                              .filter(x -> x.getUtleigegruppe()
		                                                            .equals(menyValg))
		                                              .toList();

		System.out.println("Velg bil:");
		return MenyValgHelper.lagMenyValg(ledigeBilerMedKategori);
	}

	private static void reserverBil(Utleiekontor kontor1, Utleiekontor kontor2, Bil bil) {
		int antallDager = ConsoleInputHelper.getInt("Hvor mange dager vil du leie bilen?");
		double pris = regnUtPris(bil, antallDager, kontor1, kontor2);

		System.out.println("Er du sikker på at du vil reservere " + bil);
		int bekreftelse = MenyValgHelper.lagEnkelMenyValg(List.of("Ja", "Nei"));
		if (bekreftelse == 1) {
			return;
		}

		Kunde kunde = beOmKundeInfo();

		Reservasjon reservasjon = new Reservasjon(kontor1, kontor2, LocalDate.now(),
		                                          LocalTime.now(), kunde, antallDager, pris, bil);
		System.out.println(reservasjon);
		kontor1.leggTilReservasjon(reservasjon);
	}

	private static Kunde beOmKundeInfo() {
		String navnTypeFor = ConsoleInputHelper.getString("Hva er fornavnet ditt?", "Fornavn må være minst en bokstav", 1,1000);
		String etterTypeNavn = ConsoleInputHelper.getString("Hva er ditt etternavn?", "Etternavn må være minst en bokstav", 1, 1000);
		String korhenHenBurAdresse = ConsoleInputHelper.getString("Adresse?", "Adressen må være minst en bokstav", 1, 1000);
		String telefonTypeApple = ConsoleInputHelper.getString("Skriv inn telefonnummer");
		while (!InputValidator.validerTlf(telefonTypeApple)) {
			System.out.println("Ikke gyldig telefonnummer, kan kun inneholde tall");
			telefonTypeApple = ConsoleInputHelper.getString("Skriv inn telefonnummer");
		}
		return new Kunde(navnTypeFor, etterTypeNavn, korhenHenBurAdresse, telefonTypeApple);
	}

	private static double regnUtPris(Bil bil, int antallDager, Utleiekontor kontor1, Utleiekontor kontor2) {
		double pris = 0.0;
		BilKategori gruppe = bil.getUtleigegruppe();
		pris = pris + (gruppe.pris() * antallDager);

		if (!kontor1.equals(kontor2)) {
			return pris * fastAvvik;
		}

		return pris;
	}
}
