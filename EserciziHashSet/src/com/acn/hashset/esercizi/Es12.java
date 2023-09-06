package com.acn.hashset.esercizi;

import java.util.HashSet;

public class Es12 {

	public static void main(String[] args) {
		
		//12. Scrivere un programma Java per rimuovere tutti gli elementi da HashSet.
		
		HashSet <Integer> numeri= new HashSet <>();
		numeri.add(1);
		numeri.add(7);
		numeri.add(3);
		numeri.add(9);
		
		System.out.println(numeri);
		
		numeri.clear();
		
		System.out.println(numeri);

	}

}
