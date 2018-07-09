package exc04.returnObj;

public class ReturnOb {
    public static void main(String[] args) {

        Test obj1 = new Test(2);
        Test obj2;

        obj2 = obj1.icrByTen();
        System.out.println("obj1.a: "+obj1.a);
        System.out.println("obj2.a: "+obj2.a);

        obj2 = obj2.icrByTen();
        System.out.println("obj2.a после второго увеличения значения: "+obj2.a);


    }
}
