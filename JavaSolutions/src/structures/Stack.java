package structures;

public class Stack<T> {
	
	private T[] elements;
	private int size;
	
	@SuppressWarnings("unchecked")
	public Stack(int capacity) {
		this.elements = (T[]) new Object[capacity];
		this.size = 0;
	}
	
	/*
	 *Increases the array's capacity automatically when is full;
	 */
	@SuppressWarnings("unchecked")
	private void increaseCapacity() {
		if(this.size == this.elements.length) {
			T[] newElements = (T[]) new Object[this.elements.length];
			for(int i=0; i<this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}
	
	/*
	 * Verifies if the array is empty
	 */
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	/*
	 * Adds a elemento to the top of the array;
	 */
	public boolean push(T element) {
		this.increaseCapacity();
		
		if(this.size <this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;
	}
	
	/*
	 * Returns the last item added and removes it from the array
	 */
	public T pop() {
		if(this.isEmpty()) {
			return null;
		}
		T element = this.elements[size-1];
		size--;
		return element;
	}
}
