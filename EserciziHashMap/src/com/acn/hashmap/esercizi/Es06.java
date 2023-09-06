package com.acn.hashmap.esercizi;

import java.util.HashMap;

public class Es06 {

	public static void main(String[] args) {
		//6. Scrivi un programma Java per ottenere una copia superficiale di un'istanza HashMap.
	
		HashMap <Integer, String> map= new HashMap<>();
		HashMap <Integer, String> mapCopy= new HashMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Verde");

		Object mapObj= map.clone();
		mapCopy = (HashMap <Integer, String>) mapObj; 
		
		System.out.println(map);
		System.out.println(mapCopy);
	}

}
