
import Node;

public class MyLinkedList<E> {
	
	Node<E> header;
	
	public void add(E value) {
		header = new Node<E>(value, header);		
	}
	
	public void addAfter(E after, E value) {
		Node<E> here = header;
		while (here != null) {
			if (here.value==after) {
				Node<E> newNode = new Node<E>(value, here.next);
				here.next = newNode;
				return;
			} else {
				here = here.next;
			}
		}
	}

	public void addLast(E value) {
		Node<E> here = header;
		while (here != null) {
				here = here.next;
			}
		Node<E> newNode = new Node<E>(value, null);
		here = newNode;
		}
	}
	
	public E peek() {
		if (isEmpty()) {
			return null;
		} else {
			return (E)header.value;
		}
	}
	
	public void printFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			System.out.println(header.value);
		}
	}
	
	public E pop() {
		
		E returnValue = null;
		
		if (!isEmpty()) {
			returnValue = (E)header.value;
			header = header.next;
		}
		return returnValue;
	}
	
	public void remove() {
		if (!isEmpty()) {
			header = header.next;
		}
	}
	
	// not "final"
	public void remove(E toRemove) {	
		Node<E> here = header;	
		while (here != null) {
			if (here.next.value == toRemove) {
				here.next = here.next.next;
			} else {
				here = here.next;
			}
		}
	}
	
	public void printAll() {
		printValue(header);
		System.out.println();
	}
	
	private void printValue(Node<E> here) {
		while (here != null) {
			System.out.print(here.value + " ");
			here = here.next;
		}
	}
	
	public boolean isEmpty() {
		return header==null;
	}
}
	
