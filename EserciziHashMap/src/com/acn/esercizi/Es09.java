package com.acn.esercizi;

import java.util.HashMap;

public class Es09 {

	public static void main(String[] args) {
		
		//9. Scrivere un programma Java per creare una vista impostata delle mappature contenute in una mappa.
		
		HashMap <Integer, String> map= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");
		
		System.out.println(map.entrySet());

	}

}
