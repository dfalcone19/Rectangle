import java.util.Scanner;

public class Aye{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle r1 = new Rectangle();

        System.out.println("enter length");
        r1.setLength(scan.nextInt());

        System.out.println("enter width");
        r1.setWidth(scan.nextInt());

        System.out.println("length = " + r1.getLength());
        System.out.println("width = " + r1.getWidth());
        System.out.println("area = " + r1.getArea());
        System.out.println("perimeter = " + r1.getPerimeter());
    }
}