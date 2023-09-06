package com.acn.treemap.esercizi;

import java.util.TreeMap;

public class Es06 {

	public static void main(String[] args) {
		
		//6.  Scrivere un programma Java per eliminare tutti gli elementi da una determinata Tree Map.

		TreeMap <Integer, String> map= new TreeMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Rosa");
		
		map.clear();
		
		System.out.println(map);
	}

}
