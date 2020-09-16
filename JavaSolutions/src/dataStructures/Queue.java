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
	
	public void insert(T element, int position) {
		
		if(position <0 || position > size) {
			throw new IllegalArgumentException("Invalid position");
		}
		
		this.increaseCapacity();
		
		for(int i = size-1; i>=position; i--) {
			this.elements[i+1] = this.elements[i];			
		}
		this.elements[position] = element;
		this.size++;
	}
	
	public T remove() {
		final int POS = 0;
		
		if(this.isEmpty()) {
			return null;
		}
		
		for(int i=POS; i<this.size;i++) {
			elements[i] = elements[i+1];
		}
		size--;
		
		T elementToRemove = this.elements[POS];
		return elementToRemove;
	}
	
	
}
