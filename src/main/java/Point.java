public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }




    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Point point) {
        return this.x == point.getX() && this.y == point.getY();
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public void get_ship(Point point) {

    }
    public static void colocarBarco(Point point, Ship.CardinalPoints direction, int size){
        int auxX=0;
        int auxY=0;

        if(direction ==Ship.CardinalPoints.NORTH) {
            auxX = 0;
            auxY = 1;
        } else if (direction ==Ship.CardinalPoints.EAST) {
            auxX = 1;
            auxY = 0;
        } else if (direction ==Ship.CardinalPoints.SOUTH) {
            auxX = 0;
            auxY = 1;
        } else if (direction ==Ship.CardinalPoints.WEST) {
            auxX = -1;
            auxY = 0;
        }

        Point point2 = new Point(point.getX() +(size*auxX), point.getY() + (size*auxY));
    }

    public boolean posible(Point point1, Point point2) {

        //2 opciones: que el punto 1 y 2 tengan la misma x o la misma y
        if (point1.getX() == point2.getX()) {
            if (point1.getY() == point2.getY()) {
                System.out.println("No se puede crear un barco con 2 puntos iguales");
                return false;
            } else {
                return true;
            }

        }else if (point1.getY() == point2.getY()) {
            if (point1.getX() == point2.getX()) {
                System.out.println("No se puede crear un barco con 2 puntos iguales");
                return false;
            } else {
                return true;
            }

    }else {
            System.out.println("No se puede crear un barco con 2 puntos que no estén en la misma fila o columna");
        }
        return false;
    }


}
