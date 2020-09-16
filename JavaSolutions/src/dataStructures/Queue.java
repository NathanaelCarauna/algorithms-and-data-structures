package dataStructures;

public class Queue<T> {

	private T[] elements;
	private int size;
	
	@SuppressWarnings("unchecked")
	public Queue(int capacity) {
		this.elements = (T[]) new Object[capacity];
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	@SuppressWarnings("unchecked")
	private void increaseCapacity() {
		if(this.size == this.elements.length) {
			T[] newElements = (T[]) new Object[this.elements.length];
			for(int i = 0; i< this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}
	
	public void insert(T element) {
		this.increaseCapacity();
		this.elements[this.size] = element;
		this.size++;
	}
	
	public T remove() {
		final int POS = 0;
		
		if(this.isEmpty()) {
			return null;
		}
		
		for(int i=POS; i<this.size-1;i++) {
			elements[i] = elements[i+1];
		}
		size--;
		
		T elementToRemove = this.elements[POS];
		return elementToRemove;
	}
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.size-1; i++){
			s.append(this.elements[i]);
			s.append(", ");
		}
		
		if (this.size>0){
			s.append(this.elements[this.size-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
}
