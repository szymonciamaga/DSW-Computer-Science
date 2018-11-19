package programming.task_9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //A
        System.out.println("A\n");
        String[] tab = {"Adrian", "Anita", "Tomek", "Krzysiek", "Przemek", "Justyna", "Marcin", "Szymon", "Agnieszka", "Iza"};
        List<String> stringList = new ArrayList<>();

        Collections.addAll(stringList, tab);

        //B
        System.out.println("B\n");
        for (int i = 0; i < 3; i++) {
            System.out.println(stringList.get(i));
        }

        for (int i = stringList.size()-1; i > 6; i--) {
            System.out.println(stringList.get(i));
        }

        //C
        System.out.println("C\n");
        stringList.set(4, "Fabian");
        showList(stringList);

        //D
        System.out.println("D\n");

        for (int i = 0; i < 3; i++) {
            stringList.remove(stringList.size()-1);
        }

        for (int i = 0; i < 3; i++) {
            stringList.remove(i);
        }

        showList(stringList);

        System.out.println("\nE");
        //E

        List<String> stringList1 = new ArrayList<>();
        String[] tab2 = {"Arianna", "Jenifer", "Taylor", "Michael", "Trevor", "Frankin"};
        Collections.addAll(stringList, tab2);
        stringList.addAll(stringList1);

        System.out.println("\nSortowanie alfabetycznie\n");
        Collections.sort(stringList);
        showList(stringList);

        System.out.println("\nSortowanie odwrotne\n");
        stringList.sort((o1, o2) -> o1.compareTo(o2) * -1);
        showList(stringList);
    }

    private static void showList(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println((i+1) + ") " + stringList.get(i));
        }
    }
}