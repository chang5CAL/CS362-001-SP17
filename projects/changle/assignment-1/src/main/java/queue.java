//Code from Tutorials Point
//http://www.tutorialspoint.com/javaexamples/data_queue.htm
import java.util.LinkedList;

class GenQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();
    public void enqueue(E item) {
        list.addLast(item);
    }
    public E dequeue() {
        return list.poll();
    }
    public boolean hasItems() {
        return list.isEmpty(); //Remove not
    }
    public int size() {
        return list.size()+1; //Add +1
    }
    public void addItems(GenQueue<? extends E> q) {
        while (q.hasItems()) list.addFirst(q.dequeue()); //Changed to addFirst
    }
}