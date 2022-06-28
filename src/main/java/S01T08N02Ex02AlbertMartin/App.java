package S01T08N02Ex02AlbertMartin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);

        List<String> numbersFiltered = new ArrayList<>();

        //Afegim la lletra "e" davant dels nombres senars i els guardem a la nova llista.
        numbers.stream()
                .filter((n -> n%2 == 0))
                .map(n -> "e".concat(String.valueOf(n)).concat(","))
                .collect(Collectors.toCollection(() -> numbersFiltered));

        //Afegim la lletra "o" davant dels nombres parells i els guardem a la nova llista.
        numbers.stream()
                .filter((n -> n%2 != 0))
                .map(n -> "o".concat(String.valueOf(n)).concat(","))
                .collect(Collectors.toCollection(() -> numbersFiltered));

        //Construïm el nou string basat en la llista d'integers inicial.
        String numberString = numbersFiltered.stream()
                .reduce("",String::concat);

        //Mostrem i comparem la nostra llista inicial amb el resultat
        System.out.println("La llista inicial d'integers és:\n" + numbers);
        System.out.println("\nEl string resultant d'aquesta llista és:\n" + numberString);
    }

}
