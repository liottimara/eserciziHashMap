package com.acn.treemap.esercizi;

import java.util.NavigableSet;
import java.util.TreeMap;

public class Es19 {

	public static void main(String[] args) {
		
		//19. Scrivere un programma Java per rimuovere e ottenere una mappatura di valori-chiave associata 
		// alla chiave minima in una mappa.

		TreeMap <Integer, String> map= new TreeMap <>();
		int chiave1 = 1;
		int chiave2 = 2;
		int chiave3 = 3;
		int chiave4 = 4;

		String valore1 = "Rosso";
		String valore2 = "Blu";
		String valore3 = "Rosa";
		String valore4 = "Verde";

		map.put(chiave1, valore1);
		map.put(chiave2, valore2);
		map.put(chiave3, valore3);
		map.put(chiave4, valore4);
		
		NavigableSet <Integer> navigableSet = map.navigableKeySet();
		
		System.out.println("Chiave minima: ");
		System.out.println(navigableSet.pollFirst());
		
		System.out.println("TreeMap dopo la rimozione:");
		System.out.println(map);
	}

}
