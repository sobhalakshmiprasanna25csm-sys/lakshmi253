
import java.util.*;

public class CollectionFrameworkDemo {
    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(1, 15);

        System.out.println("ArrayList: " + list);
        System.out.println("ArrayList get(0): " + list.get(0));
        list.set(0, 5);
        System.out.println("ArrayList after set: " + list);
        System.out.println("ArrayList contains 20: " + list.contains(20));
        System.out.println("ArrayList size: " + list.size());
        System.out.println("ArrayList indexOf(10): " + list.indexOf(10));
        list.remove(Integer.valueOf(10));
        System.out.println("ArrayList after remove: " + list);

        // 2. LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("B");
        linkedList.addFirst("A");
        linkedList.addLast("C");

        System.out.println("\nLinkedList: " + linkedList);
        System.out.println("LinkedList getFirst(): " + linkedList.getFirst());
        System.out.println("LinkedList getLast(): " + linkedList.getLast());
        System.out.println("LinkedList poll(): " + linkedList.poll());
        System.out.println("LinkedList after poll: " + linkedList);

        // 3. Vector
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.addElement("Python");

        System.out.println("\nVector: " + vector);
        System.out.println("Vector size: " + vector.size());
        System.out.println("Vector capacity: " + vector.capacity());

        // 4. Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack: " + stack);
        System.out.println("Stack peek(): " + stack.peek());
        System.out.println("Stack pop(): " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // 5. HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);

        System.out.println("\nHashSet: " + hashSet);
        System.out.println("HashSet contains 20: " + hashSet.contains(20));
        System.out.println("HashSet size: " + hashSet.size());

        // 6. LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Blue");
        linkedHashSet.add("Red");

        System.out.println("\nLinkedHashSet: " + linkedHashSet);

        // 7. TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10);

        System.out.println("\nTreeSet: " + treeSet);
        System.out.println("TreeSet first(): " + treeSet.first());
        System.out.println("TreeSet higher(20): " + treeSet.higher(20));

        // 8. PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        System.out.println("\nPriorityQueue peek(): " + priorityQueue.peek());
        System.out.println("PriorityQueue poll(): " + priorityQueue.poll());
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        // 9. ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("B");
        deque.addFirst("A");
        deque.addLast("C");

        System.out.println("\nArrayDeque: " + deque);
        System.out.println("ArrayDeque peekFirst(): " + deque.peekFirst());
        System.out.println("ArrayDeque pollLast(): " + deque.pollLast());
        System.out.println("ArrayDeque after pollLast: " + deque);

        // 10. HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "C++");

        System.out.println("\nHashMap: " + hashMap);
        System.out.println("HashMap get(2): " + hashMap.get(2));
        System.out.println("HashMap containsKey(1): " + hashMap.containsKey(1));
        System.out.println("HashMap keys: " + hashMap.keySet());

        // 11. LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(3, "Three");

        System.out.println("\nLinkedHashMap: " + linkedHashMap);

        // 12. TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        System.out.println("\nTreeMap: " + treeMap);
        System.out.println("TreeMap firstKey(): " + treeMap.firstKey());
        System.out.println("TreeMap higherKey(1): " + treeMap.higherKey(1));

        // 13. Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Apple");
        hashtable.put(2, "Mango");

        System.out.println("\nHashtable: " + hashtable);
        System.out.println("Hashtable get(1): " + hashtable.get(1));
        System.out.println("Hashtable size: " + hashtable.size());

        System.out.println("\nAll collection classes demonstrated successfully.");
    }
}
