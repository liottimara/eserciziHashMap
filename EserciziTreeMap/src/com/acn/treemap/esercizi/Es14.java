package com.acn.treemap.esercizi;

import java.util.Scanner;
import java.util.TreeMap;

public class Es14 {

	public static void main(String[] args) {
		
		// 14. Scrivere un programma Java per ottenere la porzione di questa mappa le cui chiavi sono 
		// inferiori (o uguali, se inclusivo è vero) a una determinata chiave.


		Scanner sc= new Scanner (System.in);

		TreeMap <Integer, String> map= new TreeMap <>();
		int chiave1 = 1;
		int chiave2 = 2;
		int chiave3 = 3;
		int chiave4 = 4;

		String valore1 = "Rosso";
		String valore2 = "Blu";
		String valore3 = "Rosa";
		String valore4 = "Verde";

		map.put(chiave1, valore1);
		map.put(chiave2, valore2);
		map.put(chiave3, valore3);
		map.put(chiave4, valore4);

		System.out.println("Scegli una chiave");
		Integer chiaveData= sc.nextInt();
		
		System.out.println(map.headMap(chiaveData, true));

		//METODO 2
		/*
		for (int chiave: map.keySet()) {
			if (chiave<=chiaveData)
				System.out.println(chiave + " - "+ map.get(chiave));
		}
		*/
	sc.close();
	}
}
