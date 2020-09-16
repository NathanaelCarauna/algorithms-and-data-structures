package TestsPackage;

import dataStructures.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<Integer>(5);
		
		
		System.out.println(pilha.toString());
		pilha.push(1);
		System.out.println(pilha.toString());
		pilha.push(2);
		System.out.println(pilha.toString());
		pilha.push(3);
		System.out.println(pilha.toString());
		pilha.push(4);
		System.out.println(pilha.toString());
		pilha.push(5);
		System.out.println(pilha.toString());
		
		pilha.pop();
		System.out.println(pilha.toString());
		pilha.pop();
		System.out.println(pilha.toString());
		pilha.pop();
		System.out.println(pilha.toString());
		pilha.pop();
		System.out.println(pilha.toString());
		pilha.pop();
		System.out.println(pilha.toString());
	}
}
