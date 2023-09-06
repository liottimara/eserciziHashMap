package com.acn.treemap.esercizi;

import java.util.Scanner;
import java.util.TreeMap;

public class Es03 {

	public static void main(String[] args) {

		// 3.  Scrivere un programma Java per cercare una chiave in una Tree Map.

		TreeMap <Integer, String> map= new TreeMap<>();

		map.put(1, "Rosso");
		map.put(2, "Blu");
		map.put(3, "Rosa");

		Scanner sc= new Scanner (System.in);

		System.out.println("Quale chiave vuoi cercare?");
		int chiave= sc.nextInt();
		boolean cerca= map.containsKey(chiave);
		if (cerca)
			System.out.println("La chiave è presente");
		else
			System.out.println("La chiave non esiste");

		sc.close();
	}

}
