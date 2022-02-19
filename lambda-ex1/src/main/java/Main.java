package main.java;

public class Main {

    public static void main(String... args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        try {
             /*
             * В методе возникает ошибка деления на 0. Решить эту проблему можно, только не создавая такую проблему, потому, что деление на 0 не допустимо.
             * Поэтому будем выкидывать исключение в основную программу, использующую класс Calculator, пусть она решает, как ей поступить
             */
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
