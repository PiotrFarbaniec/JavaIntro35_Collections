package collections1_task4;

import java.util.Set;
import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {

        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Krzysztof", "Bartoszewski", 1964, 179, 97));
        persons.add(new Person("Kamila", "Szymanowska", 1991, 165, 48));
        persons.add(new Person("Alicja", "Paderewska", 1987, 172, 52));
        persons.add(new Person("Damian", "Kowalewski", 1985, 184, 86));
        persons.add(new Person("Eugeniusz", "Niewiadomski", 1972, 181, 92));

        for (Object list1 : persons) {
            System.out.println(list1);
        }
        System.out.println("==========================================================");
        Set<Person> persons2 = new TreeSet<>((o1, o2) -> Integer.compare(o1.getGrowth(), o2.getGrowth()));
        persons2.add(new Person("Krzysztof", "Bartoszewski", 1964, 179, 97));
        persons2.add(new Person("Kamila", "Szymanowska", 1991, 169, 48));
        persons2.add(new Person("Alicja", "Paderewska", 1987, 172, 52));
        persons2.add(new Person("Damian", "Kowalewski", 1985, 184, 86));
        persons2.add(new Person("Eugeniusz", "Niewiadomski", 1972, 181, 92));

        for (Object list2 : persons2) {
            System.out.println(list2);
        }
        System.out.println("=============================================================");
        Set<Person> persons3 = new TreeSet<>((o1, o2) -> Integer.compare(o2.getWeight(), o1.getWeight()));
        persons3.add(new Person("Krzysztof", "Bartoszewski", 1964, 179, 97));
        persons3.add(new Person("Kamila", "Szymanowska", 1991, 169, 48));
        persons3.add(new Person("Alicja", "Paderewska", 1987, 172, 52));
        persons3.add(new Person("Damian", "Kowalewski", 1985, 184, 86));
        persons3.add(new Person("Eugeniusz", "Niewiadomski", 1972, 181, 92));

        for (Object list3 : persons3) {
            System.out.println(list3);
        }
    }
}