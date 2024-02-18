package collections1_task4;

import java.util.Objects;


public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int birthYear;
    private int growth;
    private int weight;

    public Person(String name, String surname, int birthYear, int growth, int weight) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.growth = growth;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getGrowth() {
        return growth;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ":  born: "
                + getBirthYear() + ", growth: " + getGrowth() + ", weight: " + getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person p)) return false;
        return birthYear == p.birthYear &&
                growth == p.growth &&
                weight == p.weight &&
                Objects.equals(name, p.name) &&
                Objects.equals(surname, p.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, growth, weight);
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(o.birthYear, this.birthYear);
    }
}