package org.collection;

import java.util.Set;
import java.util.TreeSet;


public class HashSetExample {

    public static void main(String[] args) {

        Set<String> hash_Set = new java.util.HashSet<>();
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        System.out.println(hash_Set);

        Set<String> hash_tree = new TreeSet(hash_Set);

        System.out.println(hash_tree);


    }
}
