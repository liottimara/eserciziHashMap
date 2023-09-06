package com.acn.hashset.esercizi;

import java.util.HashSet;
import java.util.Iterator;

public class Es02 {
	public static void main(String[] args) {
		
		//2. Scrivere un programma Java per scorrere tutti gli elementi HashSet.
		HashSet <String> colori= new HashSet<>();

		colori.add("Rosso");
		colori.add("Blu");
		colori.add("Arancione");

		Iterator<String> it = colori.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
