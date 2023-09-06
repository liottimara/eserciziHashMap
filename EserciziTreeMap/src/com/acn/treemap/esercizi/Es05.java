package com.acn.treemap.esercizi;

import java.util.TreeMap;

public class Es05 {

	public static void main(String[] args) {
		
		// 5.  Scrivere un programma Java per ottenere tutte le chiavi dalla Tree Map data.
		
		TreeMap <Integer, String> map= new TreeMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Rosa");
		
		System.out.println(map.keySet());

	}

}
