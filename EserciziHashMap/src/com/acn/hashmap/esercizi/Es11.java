package com.acn.hashmap.esercizi;

import java.util.HashMap;

public class Es11 {

	public static void main(String[] args) {
	//11. Scrivere un programma Java per ottenere una vista impostata delle chiavi contenute in questa mappa.

		HashMap <Integer, String> map= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");
		
		System.out.println(map.keySet());
	}

}
