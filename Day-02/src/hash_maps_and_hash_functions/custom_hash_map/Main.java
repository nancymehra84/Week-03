package hash_maps_and_hash_functions.custom_hash_map;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>(10);

        // Insertion
        map.put("pen", 3);
        map.put("pencil", 5);
        map.put("rubber", 2);

        // Retrieve values
        System.out.println("pen: " + map.get("pen")); // Output: 3
        System.out.println("pencil: " + map.get("pencil")); // Output: 5
        System.out.println("rubber: " + map.get("rubber")); // Output: 2

        // Check if a key exists
        System.out.println("Contains 'pencil': " + map.containsKey("pencil")); // Output: true
        System.out.println("Contains 'sharpner': " + map.containsKey("sharpner")); // Output: false

        // Remove a key
        map.remove("pencil");
        System.out.println("Contains 'pencil' after removal: " + map.containsKey("pencil")); // Output: false

        // Size and isEmpty check
        System.out.println("Size: " + map.size()); // Output: 2
        System.out.println("Is map empty? " + map.isEmpty()); // Output: false
    }
}

