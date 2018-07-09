package exc01;

public class PassOb {
    public static void main(String[] args) {
        Test test = new Test(100,20);
        Test test1 = new Test(100,20);
        Test test2 = new Test(-1, 1);

        System.out.println("obj1 == obj2:"+ test.equalsOb(test1));
        System.out.println("obj1 == obj3:"+ test.equalsOb(test2));


    }
}
