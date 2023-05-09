package esercizio1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;
		while (true) {
			try {
				System.out.println("Inserisci il numero di parole da inserire:");
				n = scanner.nextInt();
				break;

			} catch (InputMismatchException e) {
				System.out.println("input non valido! inserisci un numero intero positivo");
				scanner.nextLine();
			}

		}

		Set<String> duplicati = new HashSet<>();
		Set<String> parole = new HashSet<>();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.println("Inserisci la parola numero" + " " + (i + 1) + ":");
				String parola = scanner.next();
				if (parole.contains(parola)) {
					duplicati.add(parola);

				} else {
					parole.add(parola);
				}
				System.out.println("set duplicati: " + duplicati);
				System.out.println("numero di parole duplicate: " + duplicati.size());
				System.out.println("set parole distinte: " + parole);
			}

		}

		scanner.close();
	}

}
