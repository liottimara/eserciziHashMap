package com.acn.treeset.esercizi;

import java.util.TreeSet;

public class Es08 {

	public static void main(String[] args) {
		
		//8. Scrivere un programma Java per confrontare due insiemi di Tree Set.

		TreeSet <Integer> numeri1= new TreeSet<>();
		TreeSet <Integer> numeri2= new TreeSet<>();

		numeri1.add(1);
		numeri1.add(2);
		numeri1.add(3);

		numeri2.add(1);
		numeri2.add(2);
		numeri2.add(3);

		boolean equals= numeri1.equals(numeri2);

		if(equals)
			System.out.println("Sono uguali");
		else
			System.out.println("Sono diversi");

	}

}
