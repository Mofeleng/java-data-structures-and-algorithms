package data_structures;

import java.util.Hashtable;

public class HashTb {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10); //default init cap = 11
        //adding values
        table.put(100, "Sung Jin Woo");
        table.put(123, "Saitama");
        table.put(321, "Le loch");
        table.put(555, "Tanjiro Kamado");

        for (Integer key: table.keySet()) {
            // Index | key | Value
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }


    }
}
