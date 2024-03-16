package org.example;

public class Queue {
    public static class Node{
        private Node nextNode;
        private final String string;
        public Node(String string){
            this.string = string;
        }

        @Override
        public String toString(){
            return string;
        }
    }

    private Node head;
    private Node tail;

    public void add(String string){
        Node el = new Node(string);
        if(head == null) {
            head = el;
        }
        else {
            tail.nextNode = el;
        }
        tail = el;
    }

    public Node remove(){
        if(head == null){
            return null;
        }
        else {
            Node el = head;
            head = head.nextNode;
            el.nextNode = null;
            if(head == null){
                tail = null;
            }
            return el;
        }
    }


    public class Iterator {
        private Node node;

        public Iterator() {
            this.node = head;
        }

        public Node next() {
            Node el = node;
            if(hasNext()){
                node = node.nextNode;
            }
            return el;
        }

        public boolean hasNext() {
            return node != null;
        }
    }

    public Iterator iterator() {
        return new Iterator();
    }
}
