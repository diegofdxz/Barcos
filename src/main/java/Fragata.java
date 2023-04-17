import java.util.Scanner;

public class Fragata extends Ship {
    public Fragata(Point startPoint, CardinalPoints direction) {
        super(startPoint, direction, 3, 0);
    }
    public void colocarFragata(){
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
        int dir = sc.nextInt();
        switch (dir) {
            case 1:
                direction = Ship.CardinalPoints.NORTH;
                break;
            case 2:
                direction = Ship.CardinalPoints.EAST;
                break;
            case 3:
                direction = Ship.CardinalPoints.SOUTH;
                break;
            case 4:
                direction = Ship.CardinalPoints.WEST;
                break;
            default:
                System.out.println("No se ha introducido una dirección válida");
                break;
        }

        Point.colocarBarco(startPoint, direction, 3);
        //colocar "ficha que falta entre los dos puntos
        Point.colocarBarco(startPoint, direction, 2);


    }

}

