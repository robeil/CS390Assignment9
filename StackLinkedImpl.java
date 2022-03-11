package CS390Assignment9;

import java.util.EmptyStackException;

public class StackLinkedImpl<E>{

    Node<E> head = null;
    int size = 0;

    private class Node<E>{

        private E data;
        private Node next;

        private Node(E item){
            this.data = item;
            this.next = null;
        }
        public Node(Node nodeRef, E item){
            this.next = nodeRef;
            this.data = item;
        }
    }

 public StackLinkedImpl(){
        this.head = null;
        size = 0;
 }

    public E push(E ob) {
        Node newNode = new Node(head,ob);
        head = newNode;
        size++;
        return ob;

    }

    public E pop() {
    if(isEmpty()){
        throw new EmptyStackException();
    } else {
        E result = head.data;
        head = head.next;
        size--;
        return result;
    }
    }


    public E peek() {
        if(isEmpty()) {
            return null;
        } else {
            return head.data;
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int size() {
        int count = 0;
        Node current = head;
        //lopping till the end
        while(current != null){
            count++;
            current = current.next;
        }

        return count;
    }
    //To String method
    public String printAll(){
        Node current = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        while(current != null){
           E value = (E) current.data;
           sb.append(value + ", ");
            current = current.next;
        }
       sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        StackLinkedImpl s = new StackLinkedImpl();
        s.push("Robeil");
        s.push("Keleab");
        s.push("Haben");
        s.push("Hannah");
        System.out.println(s.printAll());
        System.out.println("Size " +s.size());
        System.out.println("Peeking  " +s.peek());
        System.out.println("Popping "+s.pop());
        System.out.println(s.printAll());

    }
}
