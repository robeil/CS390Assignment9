package CS390Assignment9;

import java.util.Arrays;

public class ArrayQueueImpl {

    //private int[] arr= new int[10];
    private int[] arr= new int[10];
    private int front = -1;
    private int rear = 0;

    //retrieving the first data
    public int peek() {
        //validation if the arr is empty or not
        if(isEmpty()){
            System.out.println("The is nothing to peek HERE.");
            return -1;
        } else {
            return arr[front];
        }
    }
    //inserting new element at the end
    public void enqueue(int obj){
        //validating if the array is full or not
        if(rear == arr.length){
            resize();
            System.out.println("The size is full and I am doubling the size");
        }
        if((isEmpty())) {
        //if the array is empty increment only once
            front++;
        }
           // rear++;
            arr[rear++] = obj;
    }
    public int dequeue() {
        //validating if the arr is empty or not
        if(isEmpty()){
            return -1;
        }
        int num = arr[front];
        front++;
        return num;
       // return arr[front++];
    }
    public boolean isEmpty(){
        //checking if the array is empty
        return (front == -1 || front == rear);
    }
    public int size(){
    //calculating the size of the array
        return (rear - front);
    }
    private void resize(){
      //resizing the array
            int newLength = arr.length * 2;
            arr = Arrays.copyOf(arr, newLength);
    }
    public void printAll(){

        System.out.print("{ ");
        for(int i = front; i < rear; i++){
            System.out.print( arr[i] + ", ");
        }
        System.out.print("}");
    }
    public static void main(String[] args) {

        ArrayQueueImpl q = new ArrayQueueImpl();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        System.out.println("Size : "+ q.size());
        System.out.println("Before operation ");
        q.printAll();
        System.out.println("\nPeeking before deleting " +q.peek());
        System.out.println("Removing " +q.dequeue());
        System.out.println("Peeking After deleting " +q.dequeue());
        System.out.println("Size : "+ q.size());
        System.out.println("After the operation ");
        q.printAll();
        System.out.println("\nIs isEmpty "+q.isEmpty());
    }
}
