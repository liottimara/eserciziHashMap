package com.acn.esercizi;

import java.util.HashMap;

public class Es08 {

	public static void main(String[] args) {
		
// 8. Scrivere un programma Java per verificare se una mappa contiene una mappatura per il valore specificato.
	
		HashMap <Integer, String> map= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");

		String valore= "Rosso";
		if (map.containsValue(valore)) {
			System.out.println("Contiene il valore " + valore);
		}
		else 
			System.out.println("Non contiene il valore specificato");
		
		
		
	}

}
