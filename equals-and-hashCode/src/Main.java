import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Car Object have the same values but different references

        // Override of equals and hasCode Methode to compare value and amount
        Car a = new Car(1, 2);
        Car b = new Car(1,2);
        boolean x = a.equals(b);
        System.out.println(x);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        HashSet<Car> hashSet = new HashSet<>();
        hashSet.add(a);
        hashSet.add(b);
        System.out.println(hashSet.size());
        HashMap<Car, String> hashMap1 = new HashMap<>();
        hashMap1.put(a, "123");
        hashMap1.put(b, "456");
        System.out.println(hashMap1.size());

        // Use of default equals and hasCode Methode from Object. Compare of reference
        Car2 c = new Car2(1, 2);
        Car2 d = new Car2(1,2);
        boolean e = c.equals(d);
        System.out.println(e);
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        HashSet<Car2> hashSet1 = new HashSet<>();
        hashSet1.add(c);
        hashSet1.add(d);
        System.out.println(hashSet1.size());
        HashMap<Car2, String> hashMap = new HashMap<>();
        hashMap.put(c, "123");
        hashMap.put(d, "456");
        System.out.println(hashMap.size());
    }
}