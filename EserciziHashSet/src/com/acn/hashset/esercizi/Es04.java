package com.acn.hashset.esercizi;

import java.util.HashSet;

public class Es04 {
public static void main(String[] args) {
	
	//4. Scrivere un programma Java per svuotare un HashSet.

	HashSet <Integer> numeri = new HashSet<>();
	numeri.add(5);
	numeri.add(8);
	
	numeri.clear();
	
	System.out.println(numeri);
}
}
