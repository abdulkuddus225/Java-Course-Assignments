package linkedlist.implementation;

public class Slist<T> {
	
		private Link<T> head = new Link<T>(null);
		SListIterator<T> iterator() { 
			return new SListIterator<T>(head); 
			}
		public String toString() { 
			if(head.next == null) return "SList:";
			SListIterator<T> it = this.iterator();
			StringBuilder s = new StringBuilder(); 
			while(it.hasNext()) {
				s.append(it.next() + (it.hasNext() ? ", " : ""));
			}
			return s.toString();
		}	
		
}
