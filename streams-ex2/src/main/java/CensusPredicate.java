package main.java;

import java.util.function.Predicate;

public class CensusPredicate {

    public static Predicate<Person> isNotAdult() {
        return p -> p.getAge() < 18;
    }

    public static Predicate<Person> isAdultAndMaleAndReservist() {
        return p -> p.getAge() > 18 && p.getAge() < 48 && p.getSex().equals(Sex.MAN);
    }

    public static Predicate<Person> isWorkableAndEducation(Education education) {
        return person -> ( ( person.getAge() > 18 && person.getAge() < 65 && person.getSex().equals(Sex.MAN))
                || (person.getAge() > 18 && person.getAge() < 60 && person.getSex().equals(Sex.WOMAN)) )
                && person.getEducation().equals(education);
    }

}
