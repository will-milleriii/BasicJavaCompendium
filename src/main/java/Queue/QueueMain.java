package Queue;

public class QueueMain {

    public static void main(String[] args){
        Queue myQueue = new Queue(5);

        myQueue.insert(100);
        myQueue.insert(1000);
        myQueue.insert(14);
        myQueue.insert(12);
        myQueue.insert(44);
        myQueue.insert(54); // see insert method for why 54 overwrites 100

        myQueue.view();
    }

}
