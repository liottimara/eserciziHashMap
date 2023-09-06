package com.acn.treemap.esercizi;

import java.util.TreeMap;

public class Es01 {

	public static void main(String[] args) {
		//1.  Scrivere un programma Java per associare il valore specificato alla chiave specificata in una Tree Map.

		TreeMap<Integer, String> map= new TreeMap <>();
		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Rosa");
		
		System.out.println(map);

	}

}
