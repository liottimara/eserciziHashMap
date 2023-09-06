package com.acn.treeset.esercizi;

import java.util.HashSet;
import java.util.TreeSet;

public class Es06 {

	public static void main(String[] args) {
		
		//6. Scrivere un programma Java per clonare un elenco di insiemi di Tree Set in un altro insieme di Tree Set.
		TreeSet <Integer> numeri1= new TreeSet<>();
		
		numeri1.add(1);
		numeri1.add(2);
		numeri1.add(3);
		
		TreeSet <Integer> numeri2= new TreeSet<>();
		
		Object clone= numeri1.clone();
		numeri2=(TreeSet <Integer>) clone;
		
		System.out.println(numeri1);
		System.out.println(numeri2);

	}

}
