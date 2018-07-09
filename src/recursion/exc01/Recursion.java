package recursion.exc01;

public class Recursion {
    public static void main(String[] args) {

        Factorial fact = new Factorial();

        System.out.println("Факториал 3 равен: "+fact.fact(3));
        System.out.println("Факториал 5 равен: "+fact.fact(5));
        System.out.println("Факториал 10 равен: "+fact.fact(10));
    }
}
