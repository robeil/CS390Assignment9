package CS390Assignment9;

import java.util.Arrays;

public class ArrayQueueImpl {

    private int[] arr= new int[10];
    private int front = -1;
    private int rear = 0;

    //retrieving the first data
    public int peek() {
        //validation if the arr is empty or not
        if(isEmpty()){
            System.out.println("The array is empty");
        }
        int num = arr[++front];
        front--;
        return num;

    }
    //inserting new element at the end
    public void enqueue(int obj){
        if(rear == arr.length){
            resize();
            System.out.println("The is empty and I am doubling the size");
        } else {
            arr[rear++] = obj;
        }
    //implement
    }
    public int dequeue() {
        int isRemoved = 0;
        //validating if the arr is empty or not
        if(isEmpty()){
            System.out.println("The array is empty");
        }else {
            isRemoved = arr[++front];
        }
    //implement
        return isRemoved;
    }
    public boolean isEmpty(){
    //implement
        return (front == arr.length-1);
    }
    public int size(){
    //implement
        return arr.length;
    }
    private void resize(){
    //implement
        int newLength = arr.length * 2;
        arr = Arrays.copyOf(arr,newLength);
    }

    public static void main(String[] args) {

        ArrayQueueImpl q = new ArrayQueueImpl();

     q.enqueue(1);
     q.enqueue(2);
     q.enqueue(3);
//        q.enqueue(4);
//        q.enqueue(5);
//        q.enqueue(6);
//        q.enqueue(7);
//        q.enqueue(8);
//        q.enqueue(9);
//        q.enqueue(10);
//        q.enqueue(11);
        System.out.println(q.peek());

        System.out.println("------------------------");
        System.out.print("{ ");
    for(int i = 0; i < q.size(); i++){
    System.out.print(q.dequeue() + " ");
    }
        System.out.print(" }");

//       System.out.print("= " +q.dequeue() + "");
//        System.out.print("= " +q.dequeue() + "");
//        System.out.print("= " +q.dequeue() + "");
//        System.out.print("= " +q.dequeue() + "");
//        System.out.print("= " +q.dequeue() + "");
//        System.out.print("= " +q.dequeue() + "");
//        System.out.print("= " +q.dequeue() + "");
//        System.out.print("= " +q.dequeue() + "");
//        System.out.print("= " +q.dequeue() + "");
    }
}
