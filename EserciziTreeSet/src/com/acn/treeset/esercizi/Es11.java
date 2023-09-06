package com.acn.treeset.esercizi;

import java.util.Scanner;
import java.util.TreeSet;

public class Es11 {

	public static void main(String[] args) {
		
		//11. Scrivere un programma Java per ottenere l'elemento in un insieme di Tree Set che è minore 
		//o uguale all'elemento dato.
		
		TreeSet <Integer> numeri1= new TreeSet<>();

		numeri1.add(1);
		numeri1.add(2);
		numeri1.add(3);
		numeri1.add(6);
		numeri1.add(7);
		numeri1.add(10);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int x= sc.nextInt();
		
		System.out.println(numeri1.floor(x));
		
		//OPPURE
		/*
		for(int numero: numeri1) {
			if(numero<=x)
				System.out.println(numero);
		}
		*/
		sc.close();
	}

}
