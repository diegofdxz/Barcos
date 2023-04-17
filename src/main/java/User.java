/*
• Programe un constructor que reciba como parámetro los barcos de inicio del usuario (al
menos un barco). El método debe verificar el tipo y valor del parámetro y lanzar la excepción
correspondiente cuando no se cumplan los requisitos.
• Programe los métodos setters y getters para la clase en función de lo que necesite. Si no
necesita algún o ningún getter y/o setter, argumente por qué en un comentario del módulo.
• Programe el método attack(self, Point shot_point, User user). Este método se utiliza para
realizar un disparo al usuario user en el punto shot_point. El método devolverá True si
cualquiera de los barcos que no han sido hundidos ha sido acertado y falso en caso
contrario. Se debe hacer el control de excepciones para este método.
• Programe el método get_shot(self, shot_point) de la clase Usuario. Este método se utiliza para
recibir un disparo en el punto shot_point.
• Programe el método is_alive(self) de la clase Usuario. Este método get se utiliza para obtener
el atributo is_alive. Este atributo sirve para saber si el usuario aún está vivo.
• Programe el método die(self) de la clase Usuario. Este método set se utiliza para establecer el
atributo __alive en False. De esta forma, es posible matar al usuario.
• Pruebe los objetos de la clase Usuario con los test cases que se le han pasado.
 */

import java.util.ArrayList;

public class User {

    Ship[] ships1;
    boolean is_alive;
    void init(Ship[] ships) {
        this.ships1 = ships;
        this.is_alive = true;
    }
    ArrayList<Ship> ships = new ArrayList<Ship>();

    void attack(Point shot_point, User user) {
        /*
        Programe el método attack(self, Point shot_point, User user). Este método se utiliza para
realizar un disparo al usuario user en el punto shot_point. El método devolverá True si
cualquiera de los barcos que no han sido hundidos ha sido acertado y falso en caso
contrario. Se debe hacer el control de excepciones para este método
         */
        try {
            if (Ship.get_shot(shot_point) == true) {
                System.out.println("El disparo ha sido acertado");
            } else {
                System.out.println("El disparo no ha sido acertado");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    void is_alive(){
        /*
        Programe el método is_alive(self) de la clase Usuario. Este método get se utiliza para obtener
el atributo is_alive. Este atributo sirve para saber si el usuario aún está vivo
         */
        if (this.is_alive == true) {
            System.out.println("El usuario está vivo");
        } else {
            System.out.println("El usuario está muerto");
        }
    }

    void die() {
        this.is_alive = false;
    }

    void get_shot(Point shot_point) {

        try {
            if (Ship.get_shot(shot_point) == true) {
                System.out.println("El disparo ha sido acertado");
            } else {
                System.out.println("El disparo no ha sido acertado");
            }
        }catch (Exception e) {
            System.out.println("Error: " + e);
        }



    }
    public static void menu(){
        System.out.println(" Bienvenido al juego de batalla naval");

        System.out.println(" Jugador 1: Introduzca las coordenadas de los barcos");
        System.out.println(" 1. Portaaviones: (5 casillas) ");
        Portaaviones portaaviones1 = new Portaaviones();
        portaaviones1.colocarPortaaviones();


        System.out.println(" 2. Fragata: (3 casillas) ");
        Fragata fragata1 = new Fragata();
        fragata1.colocarFragata();
        System.out.println(" 3. Canoa: (1 casillas) ");
        Canoa canoa1 = new Canoa();
        canoa1.colocarCanoa();
        System.out.println(" Jugador 2: Introduzca las coordenadas de los barcos");
        System.out.println(" 1. Portaaviones: (5 casillas) ");
        Portaaviones portaaviones2 = new Portaaviones();
        portaaviones2.colocarPortaaviones();
        System.out.println(" 2. Fragata: (3 casillas) ");
        Fragata fragata2 = new Fragata();
        fragata2.colocarFragata();
        System.out.println(" 3. Canoa: (1 casillas) ");
        Canoa canoa2 = new Canoa();
        canoa2.colocarCanoa();
        System.out.println(" Jugador 1: Introduzca las coordenadas de los disparos");
        System.out.println("Coordenadas x: ");
        System.out.println("Coordenadas y: ");
        System.out.println(" Jugador 2: Introduzca las coordenadas de los disparos");
        System.out.println("Coordenadas x: ");
        System.out.println("Coordenadas y: ");


}
}