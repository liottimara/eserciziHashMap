package com.acn.esercizi;

import java.util.HashMap;

public class Es03 {

	public static void main(String[] args) {
		//3. Scrivere un programma Java per copiare tutte le mappature dalla mappa specificata a un'altra mappa.
		
		HashMap <Integer, String> map= new HashMap<>();
		HashMap <Integer, String> mapCopy= new HashMap<>();
		
		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");
		mapCopy.put(6, "Arancione");
		
		Object map2= map.clone();
		mapCopy=(HashMap <Integer, String>) map2;

		System.out.println(map);
		System.out.println(mapCopy);
		System.out.println(map.hashCode());
		System.out.println(mapCopy.hashCode());

	}

}
