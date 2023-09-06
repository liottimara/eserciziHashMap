package com.acn.treemap.esercizi;

import java.util.Scanner;
import java.util.TreeMap;

public class Es22 {

	public static void main(String[] args) {
		
		//22. Scrivere un programma Java per ottenere la porzione di una mappa le cui chiavi vanno da una 
		// determinata chiave a un'altra chiave.
		

		Scanner sc = new Scanner (System.in);
		
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
		
		System.out.println("Scegli due chiavi: ");
		int chiaveData1= sc.nextInt();
		int chiaveData2= sc.nextInt();
		
		System.out.println(map.subMap(chiaveData1, false, chiaveData2, false));
		
		sc.close();
	}

}