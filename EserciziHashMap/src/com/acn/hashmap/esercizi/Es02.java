package com.acn.hashmap.esercizi;

import java.util.HashMap;

public class Es02 {

	public static void main(String[] args) {
		// 2. Scrivere un programma Java per contare il numero di mappature di valori-chiave 
		//(dimensioni) in una mappa.

		HashMap <Integer, String> map= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");
		
		System.out.println(map.size());
	}
}
