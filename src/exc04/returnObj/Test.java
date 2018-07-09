package exc04.returnObj;

public class Test {
    int a;

    Test(int j){
        a = j;
    }

    public Test icrByTen(){
        Test temp = new Test(a+10);
        return temp;
    }
}
