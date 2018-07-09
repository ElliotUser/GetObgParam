package exc01;

public class Test {
    int a;
    int b;

    public Test(int i, int j) {
        a = i;
        b = j;
    }

    public boolean equalsOb(Test o){
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
