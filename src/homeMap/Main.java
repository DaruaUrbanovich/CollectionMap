package homeMap;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Teddy", "bear");
        Product product2 = new Product("Masha", "doll");
        Product product3 = new Product("BMW", "car");


        Map<String, String> toys = new HashMap<>();
        toys.put(product1.name, product1.objectToy);
        toys.put(product2.name, product2.objectToy);
        toys.put(product3.name, product3.objectToy);
        for (Map.Entry<String, String> entry : toys.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        for (String k : toys.keySet()) {
            System.out.println("Toy name - " + k);
        }

        for (String v : toys.values()) {
            System.out.println("Toy object - " + v);
        }
    }


}
