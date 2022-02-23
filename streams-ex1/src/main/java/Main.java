package main.java;

import java.util.*;

public class Main {

    public static void main(String... args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> temp = new ArrayList<>();
        for (Integer num : intList) {
            if (num > 0 && num % 2 == 0) {
                temp.add(num);
            }
        }
        intList = temp;
        Collections.sort(intList);
        intList.forEach(System.out::println);
    }
}
