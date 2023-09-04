package com.acn.esercizi;

import java.util.HashMap;

public class Es07 {

	public static void main(String[] args) {
		//7. Scrivere un programma Java per verificare se una mappa contiene una mappatura per la chiave specificata.

		HashMap <Integer, String> map= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");

		int chiave= 1;
		if (map.containsKey(chiave)) {
			System.out.println("Contiene la chiave " + chiave);
			System.out.println(map.get(chiave));
		}
		else 
			System.out.println("Non contiene la chiave");
	}

}
