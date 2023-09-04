package com.acn.esercizi;

import java.util.HashMap;

public class Es01 {
	public static void main(String[] args) {

		//1. Scrivere un programma Java per associare il valore specificato alla chiave specificata in una HashMap.

		HashMap <Integer, String> map= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");

		System.out.println(map);

	}
}
