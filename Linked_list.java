import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Adding Elements
        list.add(10); // Appends to the end
        list.add(1, 20); // Inserts at a position
        list.addFirst(5); // Adds to the beginning
        list.addLast(30); // Adds to the end

        System.out.println("List after additions: " + list);

        // Removing Elements
        list.remove(); // Removes the first element
        list.remove(1); // Removes element at position 1
        list.remove(Integer.valueOf(10)); // Removes specific element
        list.removeFirst(); // Removes first element
        list.removeLast(); // Removes last element

        System.out.println("List after removals: " + list);

        // Accessing Elements
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println("Element at index 1: " + list.get(1)); // Returns element at index
        System.out.println("First element: " + list.getFirst()); // Returns first element
        System.out.println("Last element: " + list.getLast()); // Returns last element
    }
}