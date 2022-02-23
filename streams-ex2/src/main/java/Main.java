package main.java;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String... args) {

        long underage;
        List<String> reservists = new ArrayList<>();
        List<Person> workableWithHigher = new ArrayList<>();

        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }

        underage = persons.stream().filter(CensusPredicate.isNotAdult()).count();

        reservists = persons
                .stream()
                .filter(CensusPredicate.isAdultAndMaleAndReservist())
                .map(Person::getFamily)
                .collect(Collectors.toList());

        workableWithHigher = persons
                .stream()
                .filter(CensusPredicate.isWorkableAndEducation(Education.HIGHER))
                .sorted(Comparator.comparing(Person::getFamily))
                .collect(Collectors.toList());
    }
}
