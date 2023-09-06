package com.acn.treeset.esercizi;

import java.util.Set;
import java.util.TreeSet;

public class Es01 {

	public static void main(String[] args) {
		
		//1. Scrivere un programma Java per creare un nuovo Tree Set, aggiungere alcuni colori (stringhe)
		// e stampare l'insieme di Tree Set.
		
		Set <String> colori= new TreeSet<>();

		colori.add("Rosso");
		colori.add("Blu");
		colori.add("Verde");
		
		System.out.println(colori);

	}

}
