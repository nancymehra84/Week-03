package hash_maps_and_hash_functions.custom_hash_map;

import java.util.LinkedList;

class CustomHashMap<K, V> {
    // Node class to represent each entry in the hash map
    private static class Node<K, V> {
        K key;
        V value;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node<K, V>>[] table;
    private int size;

    // Constructor to initialize the hash map with a given size
    public CustomHashMap(int capacity) {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
    }

    // Hash function to map a key to an index
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Insert a key-value pair into the hash map
    public void put(K key, V value) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = table[index];

        // Check if the key already exists, and update the value if so
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        // If the key doesn't exist, add a new node to the list
        bucket.add(new Node<>(key, value));
        size++;
    }

    // Retrieve the value associated with a key
    public V get(K key) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = table[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null; // Key not found
    }

    // Remove a key-value pair from the hash map
    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = table[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                size--;
                return;
            }
        }
    }

    // Check if a key exists in the hash map
    public boolean containsKey(K key) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = table[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return true;
            }
        }

        return false;
    }

    // Get the number of elements in the hash map
    public int size() {
        return size;
    }

    // Check if the hash map is empty
    public boolean isEmpty() {
        return size == 0;
    }
}


