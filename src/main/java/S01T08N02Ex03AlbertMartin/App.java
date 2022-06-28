package EX03;

public class App {
    public static void main(String[] args) {

         Calculator add = (a, b) -> a + b;
         Calculator subtract = (a, b) -> a - b;
         Calculator multiply = (a, b) -> a * b;
         Calculator divide  = (a, b) -> b !=0 ? a / b : 0;

         int a = 2;
         int b = 3;

        System.out.println(add.calculate(a,b));


    }





}
