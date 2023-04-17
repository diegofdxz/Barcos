import java.util.Scanner;

public class Canoa extends Ship {
    public Canoa(Point startPoint, CardinalPoints direction) {
        super(startPoint, direction, 1, 0);
    }
    public void colocarCanoa(){

        System.out.println("Introduzca la coordenada X del punto de inicio");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Introduzca la coordenada Y del punto de inicio");
        int y = sc.nextInt();
        Point startPoint = new Point(x, y);
        System.out.println("Introduzca la dirección del barco");
        System.out.println("1. Norte");
        System.out.println("2. Este");
        System.out.println("3. Sur");
        System.out.println("4. Oeste");



        Point.colocarBarco(startPoint, direction, 1);

    }
}
