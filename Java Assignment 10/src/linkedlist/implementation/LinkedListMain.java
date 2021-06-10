package linkedlist.implementation;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Slist<String> s1 = new Slist<String>();
		System.out.println(s1);
		SListIterator<String> iter = s1.iterator();
		iter.insert("A");
		iter.insert("B");
		iter.insert("C");
		iter.insert("D");
		iter.insert("E");
		System.out.println(s1);
		SListIterator<String> iter2 = s1.iterator();
		iter2.remove();
		System.out.println(s1);
	}

}
