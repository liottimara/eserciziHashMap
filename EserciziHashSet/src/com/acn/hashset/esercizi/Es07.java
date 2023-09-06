package com.acn.hashset.esercizi;

import java.util.HashSet;

public class Es07 {

	public static void main(String[] args) {
		
		//7. Scrivere un programma Java per convertire un HashSet in un array.

		HashSet <Integer> numeri= new HashSet <>();

		numeri.add(1);
		numeri.add(2);
		numeri.add(3);

		System.out.println(numeri);

		Object [] arrayNumeri= numeri.toArray();

		for (Object numero: arrayNumeri) {
			System.out.println(numero);
		}
	}
}
