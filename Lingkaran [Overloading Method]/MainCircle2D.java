import java.util.Scanner;
public class MainCircle2D {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Circle2D c1 = new Circle2D(2, 2, 5.5);
    System.out.printf("Luas c1 : %.2f \n", c1.getArea());
    System.out.printf("Keliling c1 : %.2f \n", c1.getPerimeter());
    System.out.println("Apakah (3,3) berada di c1? " + c1.contains(3,3));
    System.out.println("Apakah lingkaran yang baru berada di dalam c1? " + c1.contains(new Circle2D(4,5, 10.5)));
    System.out.println("Apakah lingkaran yang lain overlapping dengan c1? " + c1.overlaps(new Circle2D(3, 5, 2.3)));

    }
}