package com.acn.hashset.esercizi;

import java.util.HashSet;

public class Es05 {

	public static void main(String[] args) {
		
		//5. Scrivere un programma Java per verificare che un HashSet sia vuoto o meno.
		
		HashSet <Character> caratteri = new HashSet<>();

		caratteri.add('a');
		caratteri.add('b');
		caratteri.add('c');
		
		boolean isEmpty= caratteri.isEmpty();
		if (isEmpty)
			System.out.println("L'HashSet è vuoto");
		else
			System.out.println("Non è vuoto");

	}

}
