package no.hvl.dat109;

import java.util.Scanner;

public class StartSystem {

	public static void startReservasjon() {
		System.out.println("Hva vil du gjøre? " +
		                   "\n1. Finne / Reservere bil" +
		                   "\n2. Hente bil" +
		                   "\n3. Levere bil" +
		                   "\n4. Vis alle aktive reservasjoner" +
		                   "\n5. Vis alle aktive utleier");
		Scanner s = new Scanner(System.in);
		int svar =  Integer.parseInt(s.nextLine());

		switch(svar) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			default:
		}
	}
}
