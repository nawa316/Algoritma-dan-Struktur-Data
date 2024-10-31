public class MyQueue<E> extends MyLinkedList<E> {

    Node<E> tail;

    public boolean offer(E item){
        Node<E> NewNode = new Node<E>(item, null );
        boolean returnValue = false;
        if (isEmpty()){
            header = NewNode;
            tail = NewNode;
            returnValue = true;
        } else {
            tail.next = NewNode;
            tail = NewNode;
            returnValue = true;
        }
        return returnValue;
    }

    public E peek(){
        if (!isEmpty()){
            return header.value;
        } else {
            return null;
        }
    }
}
