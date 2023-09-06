package com.acn.treemap.esercizi;

import java.util.TreeMap;

public class Es07 {

	public static void main(String[] args) {

		//7. Scrivere un programma Java per ordinare le chiavi nella Tree Map utilizzando il comparatore.

		TreeMap <Integer, String> map= new TreeMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(35, "Rosa");
		map.put(12, "Verde");
		map.put(3, "Arancione");

		System.out.println(map.comparator());

	}

}
