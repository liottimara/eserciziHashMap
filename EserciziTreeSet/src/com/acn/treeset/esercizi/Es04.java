package com.acn.treeset.esercizi;

import java.util.Iterator;
import java.util.TreeSet;

public class Es04 {

	public static void main(String[] args) {
		
		//4. Scrivere un programma Java per creare una vista in ordine inverso degli elementi contenuti 
		// in un dato insieme di Tree Set.
		
		TreeSet <Integer> numeri= new TreeSet<>();
		numeri.add(1);
		numeri.add(2);
		numeri.add(3);
		numeri.add(4);
		
		
		Iterator <Integer> it = numeri.descendingIterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		//OPPURE 
		/*
		System.out.println("Ordine crescente: ");
		Iterator <Integer> it = numeri.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("Ordine decrescente: ");
		for(int i=numeri.size()-1; i>=0; i--) {
			System.out.println(numeri.toArray()[i]);
		}
		*/
	}

}
