package com.acn.treeset.esercizi;

import java.util.TreeSet;

public class Es15 {

	public static void main(String[] args) {
		//15. Scrivere un programma Java per recuperare e rimuovere l'ultimo elemento di un insieme di Tree Set.
		TreeSet <Integer> numeri1= new TreeSet<>();

		numeri1.add(1);
		numeri1.add(2);
		numeri1.add(3);
		numeri1.add(6);
		numeri1.add(7);
		numeri1.add(10);
		
		System.out.println(numeri1);
		
		numeri1.pollLast();
		
		System.out.println(numeri1);

	}

}
