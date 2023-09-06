package com.acn.treemap.esercizi;

import java.util.TreeMap;

public class Es02 {

	public static void main(String[] args) {
		
		//2.  Scrivere un programma Java per copiare il contenuto di una Tree Map in un'altra Tree Map.

		TreeMap <Integer, String> map= new TreeMap<>();
		
		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Rosa");
		
		TreeMap <Integer, String> map1= new TreeMap<>(map);

		System.out.println(map);
		System.out.println(map1);
	}
}
