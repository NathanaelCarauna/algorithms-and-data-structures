package TestsPackage;

import dataStructures.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) throws Exception {
		LinkedList<Integer> listaLigada = new LinkedList<Integer>();
		
		listaLigada.add(5);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		listaLigada.add(6);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		listaLigada.add(15);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		listaLigada.add(18);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		listaLigada.add(11);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		listaLigada.add(17);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		
		System.out.println();
		
		
		listaLigada.remove(5);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		listaLigada.remove(4);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		listaLigada.remove(3);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		listaLigada.remove(2);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		listaLigada.remove(1);
		System.out.println(listaLigada.toString());
		System.out.println("tamanho: " + listaLigada.size());
		
		
	}
}
