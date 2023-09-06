package com.acn.hashset.esercizi;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Es08 {
	public static void main(String[] args) {

		//8. Scrivere un programma Java per convertire un HashSet in un Tree Set.

		Set<Integer> numeri1 = new HashSet<>();
		numeri1.add(1);
		numeri1.add(5);
		numeri1.add(9);
		numeri1.add(3);

		System.out.println("HashSet: "+ numeri1);

		Set<Integer> numeri2= new TreeSet<>(numeri1);
		
		System.out.println("TreeSet: "+ numeri2);
	}
}
