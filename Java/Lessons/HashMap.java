package OOP;

import java.util.HashMap;

public class Main {

    static HashMap<Integer, String> b = new HashMap<>();

    public static void main(String[] args) {
        //input
        b.put(100, "reddcode");
        b.put(101, "whitedcode");
        b.put(102, "blackdcode");
        b.put(103, "g-dcode");
        b.put(104, "shadowdcode");
        System.out.println(b);
        ///keyset
        for (int key : b.keySet()) {
            System.out.println(key + " - " + b.get(key));
        }
        //value
        for (String v : b.values()) {
            System.out.println(v);
        }
        //check
        if (b.containsKey(104)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        if (b.containsValue("whitedcode")) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        //update
        b.put(101, "I am handsome");
        System.out.println(b);
        //size
        int s = b.size();
        System.out.println(s);
        //delete or remove
        b.remove(102);
        System.out.println(b);
        //full delete or remove
        b.clear();
        System.out.println(b);

        System.out.println("////////////////////////////////////////////////////");

        HashMap<String, Product> product = new HashMap<>();
        product.put("PNC - 100", new Product("Milk", "Milky", 10, 20.25));
        System.out.println(product.get("PNC - 100"));
        product.put("PNC - 101", new Product("Choco","Yummy", 10, 30.35));
        System.out.println(product.get("PNC = 101"));
    }
}

class Product {

    private int SKU;
    private String name, discription;
    private int qty;
    private double price;

    Product(String name, String discription, int qty, double price) {
        this.name = name;
        this.discription = discription;
        this.qty = qty;
        this.price = price;
    }

    String getName() {
        return name;
    }

    String getDiscription() {
        return discription;
    }

    int getQty() {
        return qty;
    }

    double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name        : " + name
                + "\nDiscription : " + discription
                + "\nQuantity    : " + qty
                + "\nPrice       : " + price;
    }
}
