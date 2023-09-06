package com.acn.hashset.esercizi;

import java.util.HashSet;

public class Es03 {

	public static void main(String[] args) {
		
		//3. Scrivere un programma Java per ottenere il numero di elementi in un HashSet.

		HashSet <Integer> numeri= new HashSet <>();
		numeri.add(1);
		numeri.add(5);
		numeri.add(10);
		numeri.add(47);
		
		System.out.println(numeri.size());

	}

}
