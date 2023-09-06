package com.acn.treemap.esercizi;

import java.util.TreeMap;

public class Es09 {

	public static void main(String[] args) {

		//9.  Scrivere un programma Java per ottenere la prima chiave (la più bassa) e l'ultima (la più alta) attualmente presenti in una mappa.

		TreeMap <Integer, String> map= new TreeMap<>();

		int chiave1= 80;
		int chiave2= 55;
		int chiave3=10;

		String valore1 ="Mara";
		String valore2="Lara";
		String valore3= "Emily";


		map.put(chiave1, valore1);
		map.put(chiave2, valore2);
		map.put(chiave3, valore3);
		

		System.out.println(map.lastKey());
		System.out.println(map.firstKey());
		
		//***********METODO2************
		/*
		int maxKey=chiave1;
		int minKey=chiave1;

		for (int key : map.keySet()) {
			if (key>maxKey)
				maxKey=key;
		}

		for (int key : map.keySet()) {
			if (key<minKey)
				minKey=key;
		}


		for(int chiave: map.keySet()) {
			if (chiave==maxKey || chiave == minKey) {
				System.out.println(chiave);
			}
		}

		 */

		/**************** METODO 3****************************

		 * HashMap<Integer, String> mappa = new HashMap<>();



       // Aggiungi elementi alla mappa



        mappa.put(5, "Valore 5");

        mappa.put(2, "Valore 2");

        mappa.put(8, "Valore 8");    

        mappa.put(1, "Valore 1");





        // Ottieni la prima chiave (la più bassa)

        Integer primaChiave = null;

        for (Integer chiave : mappa.keySet()) {

            primaChiave = chiave;

            break; // Esci dal ciclo dopo aver ottenuto la prima chiave

           }

        // Ottieni l'ultima chiave (la più alta)

        Integer ultimaChiave = null;

        for (Integer chiave : mappa.keySet()) {

            ultimaChiave = chiave;

                }



          // Stampa la prima e l'ultima chiave



        if (primaChiave != null) {

            System.out.println("Prima chiave: " + primaChiave);

         } else {

             System.out.println("La mappa è vuota.");

                }



         if (ultimaChiave != null) {

             System.out.println("Ultima chiave: " + ultimaChiave);

          } else {

             System.out.println("La mappa è vuota.");

          }

		 */
	}
}
