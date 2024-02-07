package no.hvl.dat109;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class StartSystem {
	private static final int fastAvvik = 500;
	private static Scanner s = new Scanner(System.in);

	public static void startReservasjon(Selskap selskap) {
		boolean avslutt = false;

		while (!avslutt) {
		System.out.println("Hva vil du gjøre?");
		int svar = MenyValgHelper.lagEnkelMenyValg(List.of("Finne / Reservere bil",
		                                        "Hente bil", "Levere bil",
		                                        "Vis alle aktive reservasjoner",
		                                        "Vis alle aktive utleier",
		                                        "Avslutt program"));

			switch(svar) {
				case 0:
					finnBiler(selskap);
					break;
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

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
				.filter(x -> x.getUtleigegruppe().equals(menyValg))
				                                      .toList();

		System.out.println("Velg bil:");
		return MenyValgHelper.lagMenyValg(ledigeBilerMedKategori);
	}

	private static void reserverBil(Utleiekontor kontor1, Utleiekontor kontor2, Bil bil) {
		System.out.println("Hvor mange dager vil du leie bilen?");
		int antallDager = Integer.parseInt(s.nextLine());
		double pris = regnUtPris(bil, antallDager, kontor1, kontor2);

		System.out.println("Er du sikker på at du vil reservere " + bil);
		int bekreftelse = MenyValgHelper.lagEnkelMenyValg(List.of("Ja", "Nei"));
		if (bekreftelse == 1) {
			return;
		}

		Reservasjon reservasjon = new Reservasjon(kontor1, kontor2, LocalDate.now(),
		                                          LocalTime.now(), antallDager, pris);
		System.out.println(reservasjon);
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
