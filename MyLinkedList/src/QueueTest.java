public class QueueTest {

    public static void main(String[] args) {
        MyQueue<String> mq = new MyQueue<String>();
        MyQueue<String> mqEmpty = new MyQueue<String>();
        mq.offer("awan");
        System.out.println(mq.peek());
        System.out.println(mqEmpty.peek());
    }
}
