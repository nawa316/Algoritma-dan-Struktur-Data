package adt_implementation;

public class Main {

	public static void main(String[] args) {
		
		MyLinkedList<String> myList = new MyLinkedList<>();
		myList.printAll();
		myList.add("Ameera");
		myList.printAll();
		myList.add("Rafi");
		myList.printAll();
		myList.add("Aqila");
		myList.printAll();
		myList.addAfter("Rafi", "Gerald");
		myList.printAll();
		myList.addAfter("Aqila", "Gerald");
		myList.printAll();
		myList.addAfter("Gerald", "Najwa");
		myList.printAll();
		System.out.println(myList.pop());
		myList.printAll();
		myList.remove();
		myList.printAll();
		myList.remove("Gerald");
		myList.printAll();
		
	}
}
