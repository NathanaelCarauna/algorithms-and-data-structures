package TestsPackage;

import dataStructures.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> fila = new Queue<Integer>(5);
		System.out.println(fila.toString());
		
		fila.insert(3);
		System.out.println(fila.toString());
		fila.insert(15);
		System.out.println(fila.toString());
		fila.insert(12);
		System.out.println(fila.toString());
		fila.insert(6);
		System.out.println(fila.toString());
		fila.insert(9);		
		System.out.println(fila.toString());
		
		fila.remove();
		System.out.println(fila.toString());
		fila.remove();
		System.out.println(fila.toString());
		fila.remove();
		System.out.println(fila.toString());
		fila.remove();
		System.out.println(fila.toString());
		
	}

}
