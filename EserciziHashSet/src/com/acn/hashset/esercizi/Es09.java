package com.acn.hashset.esercizi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Es09 {

	public static void main(String[] args) {
		
		// 9. Scrivere un programma Java per convertire un HashSet in un List/ArrayList.
		
		HashSet <Integer> numeri1= new HashSet <>();
		
		numeri1.add(1);
		numeri1.add(5);
		numeri1.add(9);
		numeri1.add(-6);
		
		List <Integer> numeri2= new ArrayList <>(numeri1);
		
		System.out.println(numeri1);
		System.out.println(numeri2);

	}

}
