package programming.task_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //A
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();
        List<Integer> difference = new ArrayList<>();
        random(hashSet, treeSet, random);
        //B
        List<Integer> common = b(hashSet, treeSet, difference);
        //C
        c(hashSet, treeSet, random, common);
        System.out.println("Difference: " + difference);
    }

    private static void random(HashSet<Integer> hashSet, TreeSet<Integer> treeSet, Random random) {
        for (int i = 0; i <= 10; i++) {
            hashSet.add(random.nextInt(11));
            treeSet.add(random.nextInt(11));
        }
    }

    private static List<Integer> b(HashSet<Integer> hashSet, TreeSet<Integer> treeSet, List<Integer> difference) {
        int quantity = 0;
        List<Integer> partOfTheCommon = new ArrayList<>();

        for (Integer set : hashSet) {
            if (treeSet.contains(set)) {
                partOfTheCommon.add(set);
                System.out.println(set);
                quantity++;
            } else {
                difference.add(set);
            }
        }

        System.out.println("\nRepeating numbers: " + quantity + "\n");
        return partOfTheCommon;
    }

    private static void c(HashSet<Integer> hashSet, TreeSet<Integer> treeSet, Random random, List<Integer> commons) {

        hashSet.addAll(treeSet);
        System.out.println("Sum");
        for (Integer integer : hashSet) {
            System.out.println(integer);
        }

        random(hashSet, treeSet, random);

        System.out.println("Part of the common");
        for (Integer common : commons) {
            System.out.println(common);
        }
    }
}