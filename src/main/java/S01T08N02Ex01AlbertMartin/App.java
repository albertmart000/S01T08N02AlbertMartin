package S01T08N02Ex01AlbertMartin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ana");
        names.add("Eva");
        names.add("José");
        names.add("Carlos");
        names.add("Amy");

        List<String> filteredNames = new ArrayList<>();

        //Retornem una llista amb els strings que comencen per la lletre "A" i tenen
        //exactament 3 lletres

        names.stream()
                .filter(name -> name.charAt(0) == 'A' && name.length()==3)
                .collect(Collectors.toCollection(() -> filteredNames))
                .forEach(name -> System.out.println(name));
    }
}