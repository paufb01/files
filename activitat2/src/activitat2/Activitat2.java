package activitat2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Activitat2 {

	static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String archiv;
		File fitxer;
		File arguments = new File(args[0]);
		int opcio;
		int opcioConsola1;
		int opcioConsola2;
		boolean sortir = false;
		boolean sortirConsola1 = false;
		boolean sortirConsola2 = false;

		while (!sortir) {
			System.out.println("Tria una de les 3 opcions: ");
			System.out.println("______________________________");
			System.out.println("");
			System.out.println("1.Llegir per arguments ");
			System.out.println("2. Llegir per consola");
			System.out.println("3. Sortir");
			System.out.println("");
			System.out.println("______________________________");

			if (!teclat.hasNextInt()) {
				System.out.println("");
				System.out.println("ERROR: Ha d'introduir un número!!");
				teclat.next();
			} else {

				opcio = teclat.nextInt();

				switch (opcio) {
				case 1:

					while (!sortirConsola1) {

						System.out.println("Llegint per arguments...");
						System.out.println("");
						System.out.println("Tria com vols llegir l'argument:");
						System.out.println("");
						System.out.println("1. Caràcter a caràcter");
						System.out.println("");
						System.out.println("2. De 20 en 20 caràcters");
						System.out.println("");
						if (!teclat.hasNextInt()) {
							System.out.println("");
							System.out.println("ERROR: Ha d'introduir un número!!");
							teclat.next();
						} else {

							opcioConsola1 = teclat.nextInt();

							switch (opcioConsola1) {
							case 1:

								arguments = new File(args[0]);

								System.out.println("Llegint caràcter a caràcter...");
								System.out.println("");

								llegir1a1Args(arguments);

								break;

							case 2:
								fitxer = new File(args[0]);

								System.out.println("Llegint de 20 en 20...");
								llegir20a20Args(arguments);
								sortirConsola1 = true;
								break;

							default:
								System.out.println("ERROR: La opció no es troba dins les possibilitats.");
							}

						}

					}

				case 2:

					while (!sortirConsola2) {
						System.out.println("Llegint per consola...");

						System.out.println("");
						System.out.println("Tria la forma en què vols llegir el fitxer: ");
						System.out.println("");
						System.out.println("1. Caràcter a caràcter");
						System.out.println("");
						System.out.println("2. De 20 en 20 caràcters");
						System.out.println("");

						if (!teclat.hasNextInt()) {
							System.out.println("");
							System.out.println("ERROR: Ha d'introduir un número!!");
							teclat.next();
						} else {

							opcioConsola2 = teclat.nextInt();

							switch (opcioConsola2) {

							case 1:
								System.out.println("Llegint caràcter a caràcter...");
								System.out.println("Escull un fitxer del sistema:");
								archiv = teclat.next();
								fitxer = new File(archiv);
								llegir1a1(fitxer);

								sortirConsola2 = true;
								break;

							case 2:
								System.out.println("Llegint de 20 en 20...");
								System.out.println("Escull un fitxer del sistema:");
								archiv = teclat.next();
								fitxer = new File(archiv);
								llegir20a20(fitxer);
								sortirConsola2 = true;
								break;

							default:
								System.out.println("ERROR: La opció que ha introduit no existeix.");
								break;

							}
						}
					}
					break;

				case 3:
					System.out.println("Adeu!");
					sortir = true;
					break;

				default:
					System.out.println("ERROR: La opció no existeix. Tria una de les opcions existents.");

				}
			}

		}

	}
	
	//									MÈTODES LLEGIR
	
	

		public static void llegir1a1(File x) {
	
			int j;
	
			try {
				FileReader fr = new FileReader(x);
				while ((j = fr.read()) != -1) {
					System.out.println((char) j + ": " + j);
	
				}
				fr.close();
	
			} catch (Exception e) {
				System.out.println("ERROR: No s'ha pogut trobar l'arxiu.");
			}
	
		}
	
		public static void llegir20a20(File x) throws IOException {
	
			int k;
			char zahler[] = new char[20];
			try {
				FileReader fr = new FileReader(x);
				while ((k = fr.read(zahler)) != -1) {
					System.out.println((char) k + ": " + k);
	
				}
				fr.close();
			} catch (Exception e) {
				System.out.println("ERROR: No s'ha pogut trobar l'arxiu.");
			}
	
		}
	
		public static void llegir1a1Args(File y) throws IOException {
	
			int j;
	
			try {
				FileReader frA = new FileReader(y);
				while ((j = frA.read()) != -1) {
					System.out.println((char) j + ": " + j);
	
				}
				frA.close();
			} catch (Exception e) {
				System.out.println("ERROR: No s'ha pogut trobar l'argument.");
			}
	
		}
	
		public static void llegir20a20Args(File y) throws IOException {
	
			int k;
			char zahler[] = new char[20];
			try {
				FileReader frA = new FileReader(y);
				while ((k = frA.read(zahler)) != -1) {
					System.out.println((char) k + ": " + k);
	
				}
				frA.close();
			} catch (Exception e) {
				System.out.println("ERROR: No s'ha pogut trobar l'argument.");
			}
	
		}
}
