package com.acn.treemap.esercizi;

import java.util.TreeMap;

public class Es10 {

	public static void main(String[] args) {
		
		// 10. Scrivere un programma Java per ottenere una visualizzazione in ordine inverso delle chiavi contenute
		//in una determinata mappa.


		TreeMap <Integer, String> map= new TreeMap<>();

		int chiave1= 80;
		int chiave2= 55;
		int chiave3=10;
		
		String valore1 ="Mara";
		String valore2="Lara";
		String valore3= "Emily";
		

		map.put(chiave1, valore1);
		map.put(chiave2, valore2);
		map.put(chiave3, valore3);

		
		System.out.println(map.descendingKeySet());
	}

}
