package core_java;
import java.util.*;
public class Java51_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(1); set1.add(2); set1.add(3);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(3); set2.add(4); set2.add(5);

        // Union
        LinkedHashSet<Integer> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Difference (set1 - set2)
        LinkedHashSet<Integer> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);
    }
}

