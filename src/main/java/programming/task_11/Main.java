package programming.task_11;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Main {
    private static final int MAX = 10;

    public static void main(String[] args) {
        Random random = new Random();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int i = 0;
        while (i <= 10) {
            int number = random(random);
            if (map.containsKey(number)) {
                Integer value = map.get(number);
                value++;
                map.put(number, value);
            } else {
                map.put(number, 1);
            }
            i++;
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Number of occurrences: " + entry.getValue());
        }
    }

    private static int random(Random random) {
        int number = random.nextInt(MAX);
        while (number == 0) {
            number = random.nextInt(MAX);
        }
        return number;
    }
}