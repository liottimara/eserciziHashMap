package com.acn.treemap.esercizi;

import java.util.Scanner;
import java.util.TreeMap;

public class Es04 {

	public static void main(String[] args) {
		//4.  Scrivere un programma Java per cercare un valore in una Tree Map.
		
		TreeMap <Integer, String> map= new TreeMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Rosa");
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Quale valore vuoi cercare?");
		String valore= sc.nextLine();
		boolean cerca= map.containsValue(valore);
		if (cerca)
			System.out.println("Il valore è presente");
		else
			System.out.println("Il valore non esiste");
		
		sc.close();

	}

}
