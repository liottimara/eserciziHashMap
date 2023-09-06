package com.acn.treeset.esercizi;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Es02 {

	public static void main(String[] args) {
		
		//2. Scrivere un programma Java per scorrere tutti gli elementi in un insieme di Tree Set.

		Set <String> colori= new TreeSet<>();

		colori.add("Rosso");
		colori.add("Blu");
		colori.add("Verde");
		
		Iterator <String> it= colori.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}
