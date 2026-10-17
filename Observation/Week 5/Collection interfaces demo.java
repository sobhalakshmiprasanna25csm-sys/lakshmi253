
import java.util.*;

public class CollectionInterfacesDemo {
    public static void main(String[] args) {

        // 1. COLLECTION AND LIST INTERFACE
        List<String> list = new ArrayList<>();

        list.add("Mango");                  // Add element
        list.add("Apple");
        list.add("Mango");                  // List allows duplicates
        list.add(1, "Banana");              // Insert at index

        System.out.println("List: " + list);
        System.out.println("get(1): " + list.get(1));

        list.set(1, "Orange");              // Replace element
        System.out.println("set(1, Orange): " + list);

        System.out.println("indexOf(Mango): " + list.indexOf("Mango"));
        System.out.println("lastIndexOf(Mango): " + list.lastIndexOf("Mango"));
        System.out.println("subList(0, 2): " + list.subList(0, 2));

        list.sort(Comparator.naturalOrder()); // Sort ascending
        System.out.println("Sorted list: " + list);

        Collection<String> extra = new ArrayList<>();
        extra.add("Grapes");
        extra.add("Apple");

        list.addAll(extra);                 // Add all elements
        System.out.println("contains(Apple): " + list.contains("Apple"));
        System.out.println("containsAll(extra): " + list.containsAll(extra));
        System.out.println("size: " + list.size());
        System.out.println("isEmpty: " + list.isEmpty());

        // Iterator traverses the collection
        Iterator<String> it = list.iterator();
        System.out.print("Iterator: ");

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        list.remove("Grapes");              // Remove one element
        list.removeAll(extra);              // Remove matching elements
        System.out.println("After remove/removeAll: " + list);


        // 2. SET, SORTEDSET AND NAVIGABLESET
        // TreeSet implements NavigableSet and SortedSet
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);                    // Duplicate ignored

        System.out.println("\nTreeSet: " + numbers);
        System.out.println("first/last: "
                + numbers.first() + "/" + numbers.last());

        System.out.println("headSet(30): " + numbers.headSet(30));
        System.out.println("tailSet(30): " + numbers.tailSet(30));
        System.out.println("subSet(20, 40): " + numbers.subSet(20, 40));

        System.out.println("comparator (natural order): "
                + numbers.comparator());

        System.out.println("lower/floor/ceiling/higher(30): "
                + numbers.lower(30) + "/"
                + numbers.floor(30) + "/"
                + numbers.ceiling(30) + "/"
                + numbers.higher(30));

        System.out.println("descendingSet: " + numbers.descendingSet());
        System.out.println("pollFirst: " + numbers.pollFirst());
        System.out.println("pollLast: " + numbers.pollLast());

        System.out.println("Set contains 20: " + numbers.contains(20));
        System.out.println("Set size: " + numbers.size());

        numbers.clear();                    // Remove all elements
        System.out.println("Set empty after clear: " + numbers.isEmpty());


        // 3. QUEUE INTERFACE
        Queue<String> queue = new ArrayDeque<>();

        queue.add("A");                     // Insert element
        queue.offer("B");
        queue.offer("C");

        System.out.println("\nQueue: " + queue);
        System.out.println("element/peek: "
                + queue.element() + "/" + queue.peek());

        System.out.println("remove/poll: "
                + queue.remove() + "/" + queue.poll());


        // 4. DEQUE INTERFACE
        // Deque allows insertion and removal at both ends
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Middle");
        deque.addFirst("Front");
        deque.addLast("Back");

        deque.offerFirst("NewFront");
        deque.offerLast("NewBack");

        System.out.println("Deque: " + deque);
        System.out.println("peekFirst/peekLast: "
                + deque.peekFirst() + "/" + deque.peekLast());

        System.out.println("pollFirst/pollLast: "
                + deque.pollFirst() + "/" + deque.pollLast());

        System.out.println("Deque after polls: " + deque);


        // 5. MAP, SORTEDMAP AND NAVIGABLEMAP
        // TreeMap implements NavigableMap and SortedMap
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(4, "Four");

        System.out.println("\nTreeMap: " + map);
        System.out.println("get(2): " + map.get(2));

        System.out.println("containsKey(3): " + map.containsKey(3));
        System.out.println("containsValue(Two): " + map.containsValue("Two"));

        System.out.println("keySet: " + map.keySet());
        System.out.println("values: " + map.values());
        System.out.println("entrySet: " + map.entrySet());

        System.out.println("size/isEmpty: "
                + map.size() + "/" + map.isEmpty());

        System.out.println("firstKey/lastKey: "
                + map.firstKey() + "/" + map.lastKey());

        System.out.println("headMap(3): " + map.headMap(3));
        System.out.println("tailMap(2): " + map.tailMap(2));
        System.out.println("subMap(2, 4): " + map.subMap(2, 4));

        System.out.println("comparator: " + map.comparator());

        System.out.println("lower/floor/ceiling/higherKey(2): "
                + map.lowerKey(2) + "/"
                + map.floorKey(2) + "/"
                + map.ceilingKey(2) + "/"
                + map.higherKey(2));

        System.out.println("firstEntry/lastEntry: "
                + map.firstEntry() + "/" + map.lastEntry());

        System.out.println("descendingMap: " + map.descendingMap());

        System.out.println("pollFirstEntry: " + map.pollFirstEntry());
        System.out.println("pollLastEntry: " + map.pollLastEntry());

        map.remove(3);                      // Remove key 3
        System.out.println("After remove(3): " + map);

        map.clear();                        // Remove all mappings
        System.out.println("Map empty after clear: " + map.isEmpty());


        // 6. LISTITERATOR INTERFACE
        // ListIterator supports forward and backward traversal
        List<String> words =
                new ArrayList<>(Arrays.asList("One", "Two", "Three"));

        ListIterator<String> li = words.listIterator();

        System.out.print("\nListIterator forward: ");
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }

        System.out.print("\nListIterator backward: ");
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }
        System.out.println();

        li = words.listIterator();

        li.next();
        li.add("Added");                    // Insert element

        li.next();
        li.set("Changed");                  // Replace last returned element

        System.out.println("After ListIterator add/set: " + words);

        System.out.println("nextIndex/previousIndex: "
                + li.nextIndex() + "/" + li.previousIndex());

        li = words.listIterator();
        li.next();
        li.remove();                        // Remove last returned element

        System.out.println("After ListIterator remove: " + words);


        // 7. ITERATOR INTERFACE
        Iterator<String> iterator = words.iterator();

        System.out.print("forEachRemaining: ");
        iterator.forEachRemaining(
                s -> System.out.print(s + " ")
        );
        System.out.println();


        // 8. OTHER COLLECTION METHODS
        Collection<String> sample =
                new ArrayList<>(Arrays.asList("X", "Y", "Z"));

        System.out.println("sample contains Y: " + sample.contains("Y"));

        sample.remove("Y");
        System.out.println("sample after remove: " + sample);

        sample.clear();
        System.out.println("sample after clear: " + sample);
    }
}
