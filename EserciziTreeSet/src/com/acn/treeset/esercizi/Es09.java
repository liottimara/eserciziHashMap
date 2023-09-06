package com.acn.treeset.esercizi;

import java.util.TreeSet;

public class Es09 {

	public static void main(String[] args) {
		
		//9. Scrivere un programma Java per trovare i numeri inferiori a 7 in un insieme di Tree Set.
		
		TreeSet <Integer> numeri1= new TreeSet<>();

		numeri1.add(1);
		numeri1.add(2);
		numeri1.add(3);
		numeri1.add(6);
		numeri1.add(7);
		numeri1.add(10);

		for(int numero: numeri1) {
			if(numero<7)
				System.out.println(numero);
		}
		
	}

}
