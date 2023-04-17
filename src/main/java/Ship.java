public class Ship {
    /*
    Incluya los atributos de esta clase atributos y establezca la visibilidad adecuada (público,
privado, protegido). Se aconseja utilizar un punto de partida, el tamaño y el enumerado
llamado CardinalPoint para poner la dirección en la que se situa el barco a partir de un punto
de partida O utilizar un punto inicial y un punto final y comprobar en el constructor que ambos
puntos forman una recta. Se necesitarán más atributos para llevar la cuenta de los toques del
barco.
     */
    private Point startPoint;
    enum CardinalPoints {
        NORTH, EAST, SOUTH, WEST
    }
    public CardinalPoints direction;
    private int size;
    private int hits;

    public Ship(Point startPoint, CardinalPoints direction, int size, int hits) {
        this.startPoint = startPoint;
        this.direction = direction;
        this.size = size;
        this.hits = hits;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public CardinalPoints getDirection() {
        return direction;
    }

    public void setDirection(CardinalPoints direction) {
        this.direction = direction;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
    public void is_sunk() {
        /*
        Programe el método is_sunk(self) de la clase Ship. Método para saber si el barco ya está
hundido.
         */
        if (this.hits == this.size) {
            System.out.println("El barco ha sido hundido");
        } else {
            System.out.println("El barco no ha sido hundido");
        }
    }
    public  void get_shot(Point point) {
        if (point.getX() == this.startPoint.getX() && point.getY() == this.startPoint.getY()) {
            this.hits += 1;
        }

    }
}
