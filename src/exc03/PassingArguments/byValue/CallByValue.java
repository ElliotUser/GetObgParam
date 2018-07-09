package exc03.PassingArguments.byValue;

public class CallByValue {
    public static void main(String[] args) {
        Test test = new Test();

        int a = 15, b = 20;

        System.out.println( "a и b до вызова метода " + a + " "+b);

        test.meth(a,b);

        System.out.println( "a и b после вызова метода " + a + " "+b);


    }
}
