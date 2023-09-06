package com.acn.hashmap.esercizi;

import java.util.HashMap;

public class Es03 {

	public static void main(String[] args) {
		//3. Scrivere un programma Java per copiare tutte le mappature dalla mappa specificata a un'altra mappa.
		
		HashMap <Integer, String> map= new HashMap<>();
		HashMap <Integer, String> mapCopy= new HashMap<>();
		
		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");
		
		mapCopy.putAll(map);

		System.out.println(map);
		System.out.println(mapCopy);

	}

}
