package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * Selskapet som er øverst av alle klassen. Selskap eier flere utleiekontor og lignande
 */
public class Selskap {
	private String navn;
	private String telefon;
	private String firmaadresse;

	private List<Utleiekontor> utleiekontorer;

	public Selskap(String navn, String telefon, String firmaadresse) {
		this.navn         = navn;
		this.telefon      = telefon;
		this.firmaadresse = firmaadresse;
		utleiekontorer    = new ArrayList<>();
	}

	public List<Bil> getAlleBiler() {
		return utleiekontorer.stream()
		                     .flatMap(x -> x.getBilar()
		                                    .stream())
		                     .toList();
	}

	public List<Reservasjon> getReservasjoner() {
		return utleiekontorer.stream()
		                     .flatMap(x -> x.getReservasjoner()
		                                    .stream()).toList();
	}

	public void leggTilUtleieKontor(Utleiekontor kontor) {
		utleiekontorer.add(kontor);
	}

	public List<Utleiekontor> getUtleiekontorer() {
		return utleiekontorer;
	}


}
