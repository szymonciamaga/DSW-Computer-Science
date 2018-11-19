package programming.task_12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Agnieszka", "Nowakowska", "628232334", "637261827", 23));
        people.add(new Person("Tomasz", "Nowakowski", "23232323", "3212213", 19));
        people.add(new Person("Adam", "Rębacz", "3212312","2323123",43));
        people.add(new Person("Mariusz", "Oczkowski", "2231213", "3232324432", 39));
        people.add(new Person("Anita", "Kaczmarczyk", "2332423423", "3212312312", 21));
        people.add(new Person("Justyna", "Hyjek", "2323323234", "4236465754", 19));

        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getFirstName().charAt(0) == 'A') {
                people.remove(i);
            }
        }

        for (Person person : people) {
            System.out.println(person);
        }
    }
}