import java.util.*;

public class CollectionClassesDemo {
    public static void main(String[] args) {

        // 1. ArrayList - ordered list and allows duplicates
        ArrayList<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("B");
        list.add(1, "C");

        System.out.println("ArrayList: " + list);
        System.out.println("get(1): " + list.get(1));

        list.set(1, "D"); // Replace element
        System.out.println("After set: " + list);
        System.out.println("indexOf B: " + list.indexOf("B"));
        System.out.println("Size: " + list.size());


        // 2. LinkedList - supports list and queue operations
        LinkedList<String> linked = new LinkedList<>();
        linked.add("B");
        linked.addFirst("A");
        linked.addLast("C");

        System.out.println("\nLinkedList: " + linked);
        System.out.println("getFirst(): " + linked.getFirst());
        System.out.println("getLast(): " + linked.getLast());
        System.out.println("poll(): " + linked.poll());
        System.out.println("After poll: " + linked);


        // 3. Vector - synchronized resizable array
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.addElement("B");
        vector.add("C");

        System.out.println("\nVector: " + vector);
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());


        // 4. Stack - LIFO
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("\nStack: " + stack);
        System.out.println("peek(): " + stack.peek());
        System.out.println("pop(): " + stack.pop());
        System.out.println("After pop: " + stack);


        // 5. HashSet - unique elements
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // Duplicate ignored

        System.out.println("\nHashSet: " + set);
        System.out.println("Contains A: " + set.contains("A"));
        System.out.println("Size: " +
