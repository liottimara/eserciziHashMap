package com.acn.treeset.esercizi;

import java.util.Scanner;
import java.util.TreeSet;

public class Es16 {
	public static void main(String[] args) {
		//16. Scrivere un programma Java per rimuovere un dato elemento da un insieme di Tree Set.
		TreeSet <Integer> numeri1= new TreeSet<>();

		numeri1.add(1);
		numeri1.add(2);
		numeri1.add(3);
		numeri1.add(6);
		numeri1.add(7);
		numeri1.add(10);

		Scanner sc= new Scanner (System.in);

		System.out.println("Quale elemento vuoi eliminare");
		int x= sc.nextInt();

		if(numeri1.contains(x)) {
			numeri1.remove(x);
			System.out.println(numeri1);
		}
		else
			System.out.println("L'elemento non esiste");
	}
}
