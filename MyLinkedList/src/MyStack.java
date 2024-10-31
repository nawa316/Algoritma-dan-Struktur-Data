public class MyStack<E> extends MyLinkedList<E> {

    public E peek() {
        if (isEmpty()) {
            return null;
        } else {
            return (E)header.value;
        }
    }
}
