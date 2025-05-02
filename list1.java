import java.util.ArrayList;

public class list1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

     
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(10);

        System.out.println("List1: " + list1);

  
        System.out.println("Index of 10: " + list1.indexOf(10));
        System.out.println("Last index of 10: " + list1.lastIndexOf(10));

      
        if (list1.contains(25)) {
            System.out.println("25 is in the list");
        } else {
            System.out.println("25 is not in the list");
        }

        // Get elements from the list
        System.out.println("Element at index 3: " + list1.get(3));

        // Set elements
        list1.set(2, 99);
        System.out.println("Updated list: " + list1);


        list1.remove(2);
        System.out.println("List after removing element at index 2: " + list1);

      
        list1.remove(Integer.valueOf(40));
        System.out.println("List after removing 40: " + list1);

        
        list1.clear();

 
        System.out.println("*** isEmpty() ***");
        if (list1.isEmpty()) {
            System.out.println("List1 is empty");
        } else {
            System.out.println("List1 is not empty");
        }
    }
}