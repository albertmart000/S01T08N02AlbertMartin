package S01T08N02Ex04AlbertMartin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<String> numbersAndLettersStrings = new ArrayList<>();

        numbersAndLettersStrings.add("abcde123");
        numbersAndLettersStrings.add("567");
        numbersAndLettersStrings.add("890fgh");
        numbersAndLettersStrings.add("aeiou");
        numbersAndLettersStrings.add("5x6y7z8");

        //Llista ordenada alfabèticament pel primer caràcter.
        System.out.println("Llista ordenada alfabèticament pel primer caràcter.");

        List<String> sortedList = new ArrayList<>();
        numbersAndLettersStrings.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toCollection(() -> sortedList))
                .forEach(s-> System.out.println(s));


        //Llista ordenada per les cadenes que contenen una "e".
        System.out.println("\nLlista ordenada per les cadenes que contenen una 'e' primer.");

        List<String> firstE = new ArrayList<>();
        numbersAndLettersStrings.stream()
                .sorted(Comparator.comparing(s -> s.contains("e"))                )
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(() -> firstE))
                .forEach(s-> System.out.println(s));



        //Llista a on totes les 'a' s'han canviat per '4'.
        System.out.println("\nLlista a on totes les 'a' s'han canviat per'4'.");

        List<String> aTo4 = new ArrayList<>();
        numbersAndLettersStrings.stream()
                .filter(s-> s.contains("a"))
                .map(s -> s.replace('a', '4'))
                .collect(Collectors.toCollection(() -> aTo4))
                .forEach(s-> System.out.println(s));


        //Llista que mostra només els elements que són numèrics.
        System.out.println("\nLlista que mostra només els elements que són numèrics.");

        List<String> numerical = new ArrayList<>();

        numbersAndLettersStrings.stream()
                .filter (s-> !s.contains("a") && !s.contains("b") && !s.contains("c") &&
                        !s.contains("d") && !s.contains("e") && !s.contains("f") &&
                        !s.contains("g") && !s.contains("h") && !s.contains("i") &&
                        !s.contains("j") && !s.contains("k") && !s.contains("l") &&
                        !s.contains("m") && !s.contains("n") && !s.contains("ñ") &&
                        !s.contains("o") && !s.contains("p") && !s.contains("q") &&
                        !s.contains("r") && !s.contains("s") && !s.contains("t") &&
                        !s.contains("u") && !s.contains("v") && !s.contains("w") &&
                        !s.contains("x") && !s.contains("y") && !s.contains("z"))
                .collect(Collectors.toCollection(() -> numerical))
                .forEach(s-> System.out.println(s));
    }

}
