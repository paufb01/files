package writerActivitat2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterActivitat2 {

	static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String text;
		int opcio;
		boolean sortir = false;
		File archiv = new File("./fitxer.txt");

		System.out.println("Introdueix el text que vulguis inserir a l'arxiu 'archiv.txt'.");
		text = teclat.nextLine();

		while (!sortir) {

			System.out.println("------------------------------------");
			System.out.println("Tria com vols escriure el fitxer: ");
			System.out.println("------------------------------------");
			System.out.println("1. Caràcter a caràcter");
			System.out.println("");
			System.out.println("2. Escriure el text junt");
			System.out.println("");
			System.out.println("3.Paraula a paraula");
			System.out.println("------------------------------------");

			if (!teclat.hasNextInt()) {
				System.out.println("ERROR: Has d'introduir un número eh? -.-''");
				teclat.next();
			} else {
				opcio = teclat.nextInt();

				switch (opcio) {
				case 1:
					System.out.println("Escrivint caràcter a caràcter...");
					writeChar(archiv, text);

					sortir = true;
					break;

				case 2:
					System.out.println("Escriu el text...");

					writeText(archiv, text);

					sortir = true;
					break;

				case 3:
					System.out.println("Escrivint paraules...");
					writeWords(archiv, text);

					sortir = true;
					break;

				}
			}

		}

	}

	public static void writeChar(File archiv, String text) {
		try {
			FileWriter fw = new FileWriter(archiv, true);

			char[] arrayChars = text.toCharArray();

			for (int i = 0; i < arrayChars.length; i++) {

				fw.write(arrayChars[i]);
			}

			System.out.println("El text s'ha escrit correctament.");
			fw.write("\n");
			fw.close();
		} catch (IOException e) {
			System.out.println("ERROR: No s'ha pogut escriure el text. Algo ha fallat.");
		}

	}

	public static void writeText(File archiv, String text) {

		try {
			FileWriter fw = new FileWriter(archiv, true);
			text = teclat.nextLine();
			fw.write(text);

			System.out.println("El text s'ha escrit correctament.");
			fw.write("\n");
			fw.close();

		} catch (IOException e) {
			System.out.println("ERROR: No s'ha pogut escriure el text.");
		}

	}

	public static void writeWords(File archiv, String text) {

		try {
			FileWriter fw = new FileWriter(archiv, true);

			String[] wort = text.split(" ");

			for (String paraula : wort) {
				fw.write(paraula);
			}

			System.out.println("El text s'ha escrit correctament.");
			fw.write("\n");
			fw.close();

		} catch (Exception e) {
			System.out.println("ERROR: No s'ha pogut escriure el text paraula per paraula. Algo ha fallat.");
		}

	}

}
