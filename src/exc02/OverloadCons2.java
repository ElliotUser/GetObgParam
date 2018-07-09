package exc02;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box box = new Box(20,50,30);
        Box cube = new Box(40);
        Box myclone = new Box(box);

        double volue;

        volue = box.value();
        System.out.println("Объем box равен: "+volue);

        volue = cube.value();
        System.out.println("Объем cube равен: "+volue);

        volue = myclone.value();
        System.out.println("Объем myclone равен: "+volue);
    }
}
