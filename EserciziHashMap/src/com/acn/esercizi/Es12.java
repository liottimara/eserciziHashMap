package com.acn.esercizi;

import java.util.HashMap;

public class Es12 {

	public static void main(String[] args) {
		// 12. Scrivere un programma Java per ottenere una vista della raccolta dei valori contenuti in questa mappa.
		HashMap <Integer, String> map= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");
		
		System.out.println(map.values());
	}

}
