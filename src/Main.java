import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<String, String> OrderList = new HashMap<>();
        OrderList.put("Ethan", "Chips and Gravy");
        OrderList.put("Hughes", "Spaghetti Bolognaise");

        // Loop through the OrderList map and print key-value pairs
        for (Map.Entry<String, String> entry : OrderList.entrySet()) {
            String name = entry.getKey();
            String order = entry.getValue();
            System.out.println(name + " ordered: " + order);
        }
    }
}
