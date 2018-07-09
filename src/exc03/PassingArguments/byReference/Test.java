package exc03.PassingArguments.byReference;

public class Test {
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    public void meth(Test ob){
        ob.a /= 2;
        ob.b *= 2;
    }

}
