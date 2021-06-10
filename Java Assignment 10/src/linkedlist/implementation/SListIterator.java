package linkedlist.implementation;

public class SListIterator<T> {

	Link<T> current;
	SListIterator(Link<T> link){
		current = link;
	}
	
	public boolean hasNext() {
		return current.next != null;
	}
	
	public Link<T> next(){
		current = current.next;
		return current;
	}
	
	public void insert(T t) {
		current.next = new Link<T>(t, current.next);
		current = current.next;
		
	}
	
	
	public void remove() {
		if(current.next != null) {
			current.next = current.next.next;
		}
	}
	
}
