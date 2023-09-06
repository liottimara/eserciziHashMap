package com.acn.treeset.esercizi;

import java.util.Set;
import java.util.TreeSet;

public class Es03 {

	public static void main(String[] args) {
		
		//3. Scrivere un programma Java per aggiungere tutti gli elementi di un insieme di Tree Set 
		//specificato a un altro insieme di Tree Set.
		
		Set <Integer> numeri= new TreeSet<>();
		Set <Integer> numeri2= new TreeSet<>();
		
		numeri.add(1);
		numeri.add(5);
		numeri.add(10);
		numeri.add(3);
		
		numeri2.addAll(numeri);
		
		System.out.println(numeri2);
	}

}
