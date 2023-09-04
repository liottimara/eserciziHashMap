package com.acn.esercizi;

import java.util.HashMap;

public class Es04 {

	public static void main(String[] args) {
	
		// 4. Scrivere un programma Java per rimuovere tutte le mappature da una mappa.
		HashMap <Integer, String> map= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");
		
		map.clear();

		System.out.println(map);

	}

}
