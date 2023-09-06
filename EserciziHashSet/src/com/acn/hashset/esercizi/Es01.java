package com.acn.hashset.esercizi;

import java.util.HashSet;

public class Es01 {
	public static void main(String[] args) {
		
		//1.Scrivere un programma Java per aggiungere l'elemento specificato alla fine di un HashSet.

		HashSet <String> colori= new HashSet<>();

		colori.add("Rosso");
		colori.add("Blu");
		colori.add("Arancione");

		System.out.println(colori);
		
		colori.add("Verde");
		System.out.println(colori);
	}
}
