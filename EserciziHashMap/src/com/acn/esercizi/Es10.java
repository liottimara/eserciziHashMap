package com.acn.esercizi;

import java.util.HashMap;
import java.util.Scanner;

public class Es10 {

	public static void main(String[] args) {
		
		//10. Scrivere un programma Java per ottenere il valore di una chiave specificata in una mappa.

		Scanner sc= new Scanner (System.in);
		HashMap <Integer, String> map= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");

		System.out.println("Inserisci la chiave");
		int chiave= sc.nextInt();
		
		if(map.containsKey(chiave))
		System.out.println(map.get(chiave));
		else
			System.out.println("Chiave inesistente");
		
		sc.close();
	}

}
