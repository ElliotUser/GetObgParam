package exc03.PassingArguments.byReference;

public class PassObRe {
    public static void main(String[] args) {
        Test ob = new Test(10,20);

        System.out.println("ob.a и ob.b до вызова метода "+ ob.a + " " + ob.b );

        ob.meth(ob);

        System.out.println("ob.a и ob.b после вызова метода "+ ob.a + " " + ob.b );
    }
}
