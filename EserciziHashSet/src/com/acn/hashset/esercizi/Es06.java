package com.acn.hashset.esercizi;

import java.util.HashMap;
import java.util.HashSet;

public class Es06 {

	public static void main(String[] args) {
		//6. Scrivere un programma Java per clonare un HashSet su un altro HashSet.

		HashSet <Integer> numeri1= new HashSet <>();
		
		
		numeri1.add(1);
		numeri1.add(3);
		numeri1.add(8);
		
		HashSet <Integer> numeri2= new HashSet<>(numeri1);
		
		//OPPURE
		
		/*
		 Object clone= numeri1.clone();
		 numeri2=(HashSet <Integer>) clone;
		 */
		
		System.out.println(numeri1);
		System.out.println(numeri2);
		

	}

}
