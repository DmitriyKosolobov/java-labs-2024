package org.example;

public class QueueExample {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("str1");
        queue.add("str2");
        queue.add("str3");

        Queue.Iterator it = queue.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
