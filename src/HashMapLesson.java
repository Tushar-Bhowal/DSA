import java.util.HashMap;
import java.util.Map;

public class HashMapLesson {
    public static void main(String[] args) {
        // ========== CREATION ==========
        HashMap<String, Integer> scores = new HashMap<>();
        // <String, Integer> = <KeyType, ValueType>

        System.out.println("Empty map: " + scores);
        System.out.println("Size: " + scores.size());

        // ========== ADDING / UPDATING ==========
        scores.put("Alice", 95); // Add new entry
        scores.put("Bob", 87);
        scores.put("Charlie", 92);
        System.out.println("\nAfter adding: " + scores);

        scores.put("Alice", 98); // UPDATE Alice's score
        System.out.println("After updating Alice: " + scores);

        int aliceScore = scores.get("Alice"); // 98
        System.out.println("\nAlice's score: " + aliceScore);

        // DANGER: If key doesn't exist → returns null → ERROR!
        // Integer davidScore = scores.get("David"); // null

        // ========== GET OR DEFAULT (VERY IMPORTANT!) ==========
        int davidScore = scores.getOrDefault("David", 0); // 0 (default)
        System.out.println("David's score: " + davidScore);

        // ========== CHECKING KEYS/VALUES ==========
        boolean hasAlice = scores.containsKey("Alice"); // true
        boolean hasDavid = scores.containsKey("David"); // false
        boolean has95 = scores.containsValue(95); // false (it's 98 now)

        System.out.println("\nHas Alice? " + hasAlice);
        System.out.println("Has David? " + hasDavid);
        System.out.println("Has value 95? " + has95);

        // ========== REMOVING ==========
        scores.remove("Bob"); // Remove Bob's entry
        System.out.println("\nAfter removing Bob: " + scores);
        // {Alice=98, Charlie=92}

        // ========== ITERATION (3 WAYS) ==========

        System.out.println("\n--- WAY 1: Iterate over keys ---");
        for (String name : scores.keySet()) {
            System.out.println(name + " scored " + scores.get(name));
        }

        System.out.println("\n--- WAY 3: Iterate over values only ---");
        for (int score : scores.values()) {
            System.out.println("Score: " + score);
        }

        System.out.println("\n--- WAY 2: Iterate over entries (BEST) ---");
        for (HashMap.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + " scored " + score);
        }

        // ========== SIZE & CLEAR ==========
        int size = scores.size(); // 2
        boolean empty = scores.isEmpty(); // false
        System.out.println("\nSize: " + size);
        System.out.println("Is empty? " + empty);
    }
}
