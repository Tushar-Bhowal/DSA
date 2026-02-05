import java.util.*;

public class ArrayListLesson {
    public static void main(String[] args) {
        // ========== CREATION ==========
        ArrayList<Integer> numbers = new ArrayList<>();
        // <Integer> = Type of elements (can be String, Double, etc.)

        System.out.println("Empty list: " + numbers);
        System.out.println("Size: " + numbers.size());

        // ========== ADDING ELEMENTS ==========
        numbers.add(10); // Add at end
        numbers.add(20);
        numbers.add(30);
        System.out.println("\nAfter adding: " + numbers);
        numbers.add(1, 15); // Insert at index 1
        System.out.println("After inserting at index 1: " + numbers); 

          // ========== ACCESSING ELEMENTS ==========
        int first = numbers.get(0);      // Get element at index 0
        int second = numbers.get(1);
        System.out.println("\nFirst element: " + first);   
        System.out.println("Second element: " + second);   

         // ========== UPDATING ELEMENTS ==========
        numbers.set(2, 25);  // Change index 2 from 20 to 25
        System.out.println("\nAfter update: " + numbers); 

        // ========== REMOVING ELEMENTS ==========
        numbers.remove(1);   // Remove element at index 1
        System.out.println("\nAfter removing index 1: " + numbers);  
        
        numbers.remove(Integer.valueOf(25));  // Remove by value
        System.out.println("After removing value 25: " + numbers);  
        
        
        // ========== CHECKING ELEMENTS ==========
        boolean has10 = numbers.contains(10);   // true
        boolean has50 = numbers.contains(50);   // false
        System.out.println("\nContains 10? " + has10);
        System.out.println("Contains 50? " + has50);
        
        
        // ========== SIZE & EMPTY CHECK ==========
        int size = numbers.size();           // 2
        boolean empty = numbers.isEmpty();   // false
        System.out.println("\nSize: " + size);
        System.out.println("Is empty? " + empty);
        
    }
}
