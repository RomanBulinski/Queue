public class Main {


    public static void main(String[] args) {

        CustomQueue customQueue = new CustomQueue();

        customQueue.enqueue("ha....");
        customQueue.enqueue("hallo");
        customQueue.enqueue("world");
        customQueue.enqueue("!!!");

        System.out.println( customQueue.dequeue() );
        System.out.println( customQueue.peek() );
        System.out.println( customQueue.isEmpty() );
        System.out.println( customQueue.queueSize());


    }
}
