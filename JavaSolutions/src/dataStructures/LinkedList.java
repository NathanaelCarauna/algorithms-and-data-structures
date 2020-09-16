package dataStructures;

public class LinkedList<T>{
	
	private class Node<T>{
		private T content;
		private Node nextItem;
		
		public T getContent() {
			return this.content;
		}
		
		public void setContent(T content) {
			this.content = content;
		}
		
		public Node getNextItem() {
			return this.nextItem;
		}
		
		public void setNextItem(Node nextItem) {
			this.nextItem = nextItem;
		}
	}
	
	private int size;
	private Node first;
	
	public LinkedList() {
		this.size = 0;
		this.first = null;
	}
	
	public void add(T item) {
		if(this.size == 0) {
			Node node = new Node();
			node.setContent(item);
			node.setNextItem(null);
			this.first = node;
		}else {
			Node currentNode = this.first;
			while(currentNode.getNextItem()!=null) {
				currentNode = currentNode.getNextItem();
			}
			Node newNode = new Node();
			newNode.setContent(item);
			newNode.setNextItem(null);
			currentNode.setNextItem(newNode);
		}
		this.size++;
	}
	
	public T remove(int position) throws Exception {
		if(position<0 || position>= this.size()) {
			throw new IllegalArgumentException("Invalid position");
		}
		Node previousNode = new Node();
		Node currentNode = this.first;
		Node nextNode = currentNode.getNextItem();
		
		int nodeCount = 0;
		
		while(currentNode.getNextItem()!= null) {
			if(!this.isEmpty()) {
				if(nodeCount == position) {
					previousNode.setNextItem(nextNode);
					break;
				}
			}else {
				throw new Exception("The Linked list is empty");
			}
			previousNode = currentNode;
			currentNode = currentNode.getNextItem();
			nextNode = currentNode.getNextItem();
			nodeCount++;
		}
		this.size--;
		return(T)currentNode.getContent();
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		Node currentNode = this.first;
		while(currentNode.getNextItem()!=null) {
			s.append(currentNode.getContent());
			s.append(", ");
			currentNode = currentNode.getNextItem();
		}	
		
		if (this.size>0){
			s.append(currentNode.getContent());
		}
		
		s.append("]");
		
		
		return s.toString();
	}
}
