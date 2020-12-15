package Queue;

public class Queue {

    private int maxSize; // initializes the set number of slots
    private long[] queArray; //slots to maintain the data
    private int front; //this will be the index position for the element in the front
    private int rear; // index position for back of the line
    private int nItems; //counter to maintain the number of items in our queue

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; //index position for first slot of array
        rear = -1; //there is no item in the array yet to be considered the last item
        nItems = 0; //no elements in array yet
    }

    public void insert(long j){
        if (rear == maxSize - 1){
            rear = -1;
        }
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public long remove(){ //remove item from front of queue
        long temp = queArray[front];
        front++;
        if (front == maxSize){
            front = 0; //sets front back to index 0 so array can be utilized again
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.print("[ ");
        for (int i = 0; i < queArray.length; i++){
            System.out.print(queArray[i] + " ");
        }
        System.out.print(" ]");
    }
}
