package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Application2 {

	public static void main(String[] args) {
		listaOrdinata(4);
		List<Integer> lista = listaOrdinata(4);
		System.out.println(listaInversa(lista));
		pariODispari(lista, false);

	}

	public static List<Integer> listaOrdinata(int n) {
		Random r = new Random();
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int numeroRandomico = r.nextInt(101);
			lista.add(numeroRandomico);
		}
		return (lista);
	}

	public static List<Integer> listaInversa(List<Integer> lista) {
		List<Integer> listaInversa = new ArrayList<>(lista);
		Collections.reverse(listaInversa);
		lista.addAll(listaInversa);
		return lista;

	}

	public static void pariODispari(List<Integer> lista, boolean bool) {
		if (bool == true) {
			for (int i = 0; i < lista.size(); i += 2) {
				System.out.println(lista.get(i));
			}

		} else {

			for (int i = 1; i < lista.size(); i += 2) {
				System.out.println(lista.get(i));

			}

		}

	}

}
