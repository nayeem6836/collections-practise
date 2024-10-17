import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap of Integer and String
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs to the HashMap
        students.put(101, "John");
        students.put(102, "Jane");
        students.put(103, "David");
        students.put(104, "Emma");

        // Printing all key-value pairs
        System.out.println("Student List: " + students);

        // Accessing a value using key
        String studentName = students.get(102);
        System.out.println("Student with ID 102: " + studentName);

        // Iterating over the HashMap
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
