package com.acn.hashset.esercizi;

import java.util.HashSet;

public class Es10 {

	public static void main(String[] args) {
		// 10. Scrivere un programma Java per confrontare due HashSet.

		HashSet <Integer> numeri1= new HashSet <>();
		HashSet <Integer> numeri2= new HashSet <>();
		
		numeri1.add(1);
		numeri1.add(9);
		numeri1.add(19);
		
		numeri2.add(1);
		numeri2.add(9);
		numeri2.add(19);
		
		boolean equals= numeri1.equals(numeri2);
		
		if (equals)
			System.out.println("Sono uguali");
		else
			System.out.println("Sono diversi");

	}

}
