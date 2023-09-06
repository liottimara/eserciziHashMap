package com.acn.treeset.esercizi;

import java.util.TreeSet;

public class Es05 {

	public static void main(String[] args) {
		
		//5. Scrivere un programma Java per ottenere il primo e l'ultimo elemento di un insieme di Tree Set.

		TreeSet <Integer> numeri= new TreeSet<>();
		numeri.add(1);
		numeri.add(2);
		numeri.add(3);
		numeri.add(4);

		System.out.println(numeri.first());
		System.out.println(numeri.last());
	}

}
