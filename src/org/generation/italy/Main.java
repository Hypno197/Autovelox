package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int limiteVelocità, differenza, velocitàRilevata; // stabiliamo 3 parametri per la rilevazione
		boolean confermaScelta, cambiaLimite; // cambia limite
		Random r = new Random();

		do { // inserimento limite e ritorno del primo ciclo per cambiare il limite
			System.out.println("Inserire il limite di velocità");
			limiteVelocità = sc.nextInt();
			sc.nextLine();

			do { // inserimento velocità e ritorno del secondo ciclo per cambiare solo la
					// velocità da rilevare
				System.out.println("Il limite di velocità attuale è " + limiteVelocità + "Km/h");
	
				//System.out.println("Inserire velocità da calcolare: ");
				//velocitàRilevata = sc.nextInt();
				//sc.nextLine();
		
				velocitàRilevata=r.nextInt(250)+1;
				differenza = velocitàRilevata - limiteVelocità;
				System.out.println("La velocità rilevata è di: "+velocitàRilevata+"Km/h");
				
				if (velocitàRilevata <= 100) {
					if (velocitàRilevata > limiteVelocità + 5) { // casistica velocità minore di 100kmh
						if (differenza > 5 && differenza < 10) {
							System.out.println("La sanzione è tra 42 e 386€");
						} else if (differenza >= 10 && differenza <= 40) {
							System.out.println("La sanzione è tra 173 e 694");
						} else if (differenza > 40 && differenza <= 60) {
							System.out.println("La sanzione è tra 543 e 2170€");
						} else if (differenza > 60) {
							System.out.println("La sanzione è tra 845 e 3382€");
						}
						System.out.println("Hai superato il limite di " + differenza + "Km/h");
					} else // condizione falsa
						System.out.println("Hai rispettato i limiti, bravo!");

				} else if (velocitàRilevata > limiteVelocità / 100 * 105) { // casistica velocità maggiore di 100kmh
					if (differenza > 5 && differenza < 10) {
						System.out.println("La sanzione è tra 42 e 386€");
					} else if (differenza >= 10 && differenza <= 40) {
						System.out.println("La sanzione è tra 173 e 694");
					} else if (differenza > 40 && differenza <= 60) {
						System.out.println("La sanzione è tra 543 e 2170€");
					} else if (differenza > 60) {
						System.out.println("La sanzione è tra 845 e 3382€");
					} else if (velocitàRilevata > limiteVelocità + 5) {
					}
					System.out.println("Hai superato il limite di " + differenza + "Km/h");

				} else // condizione falsa
					System.out.println("Hai rispettato i limiti, bravo!");

				{
					System.out.println("Calcolare di nuovo?(True/false)"); // valori booleani per navigazione
																			// vero/falso, vero a questa indicazione ci
																			// riporta al calcolo
					confermaScelta = sc.nextBoolean();
					System.out.println("Cambiare limite?(True/false)"); // questa indicazione ci riporta all'inserimento
																		// del limite
					cambiaLimite = sc.nextBoolean();
				}
			} while (confermaScelta == true);

		} while (cambiaLimite == true);
		sc.close();
		System.out.println("Arrivederci e grazie.");
	}

}