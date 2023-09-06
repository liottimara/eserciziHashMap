package com.acn.hashmap.esercizi;

import java.util.HashMap;

public class Es05 {

	public static void main(String[] args) {

		//5. Scrivere un programma Java per verificare se una mappa contiene mappature di valori-chiave (vuote) o meno.

		HashMap <Integer, String> map= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");

		boolean isEmpty= map.isEmpty();
		if(isEmpty)
			System.out.println("La mappa è vuota");
		else
			System.out.println("La mappa contiene mappature di valori-chiave");



	}

}
