package com.acn.hashset.esercizi;

import java.util.HashSet;

public class Es11 {

	public static void main(String[] args) {
		
		// 11. Scrivi un programma Java per confrontare due insiemi e conservare gli elementi che sono uguali su 
		// entrambi gli insiemi.

		HashSet <Integer> numeri1= new HashSet <>();
		HashSet <Integer> numeri2 = new HashSet <>();

		numeri1.add(8);
		numeri1.add(7);
		numeri1.add(5);

		numeri2.add(8);
		numeri2.add(7);
		numeri2.add(9);

		System.out.println("Stampa prima del confronto");
		System.out.println(numeri1);
		System.out.println(numeri2);

		numeri2.retainAll(numeri1);

		System.out.println("Stampa dopo il confronto");
		System.out.println(numeri2);

	}
}
