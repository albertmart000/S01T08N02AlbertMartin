package S01T08N02Ex03AlbertMartin;

public class App {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide  = (a, b) -> a / b;

        float a = 2;
        float b = 3;

        System.out.println(add.calculate(a,b));
        System.out.println(subtract.calculate(a,b));
        System.out.println(multiply.calculate(a,b));
        System.out.println(divide.calculate(a,b));

    }
}
