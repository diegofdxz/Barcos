/*
El juego hundir la flota, conocido en el mundo anglosajón por su nombre en inglés battleship, es un
juego tradicional de estrategia y algo de suerte, que involucra a dos participantes.
En este ejercicio, vamos a hacer una versión programada en Java para que dos jugadores puedan
jugar a este juego.
La aplicación va a comenzar permitiendo que cada jugador posicione sus barcos en un único
tablero. Cada jugador va a ocupar, según sus preferencias, una misma cantidad de casillas,
horizontal y/o verticalmente, en base a las casillas sobre las cuales están representadas sus naves.
Cada jugador va a posicionar como máximo 3 barcos. Así, por ejemplo, cinco casillas consecutivas
conforman un portaaviones; tres, una fragata; y una casilla aislada, una canoa.
No es necesario implementar el docString correspondiente a las funciones y métodos desarrollados,
aunque se recomienda hacer el diagrama de flujo de los métodos en papel de forma previa a su
resolución.
En base a estas especificaciones se solicita que:
a) Programe la clase enumearada CardinalPoints, que contendrá los puntos cardinales: NORTH, EAST,
SOUTH y WEST, por este orden.
b) Programe la clase Ship.
• Incluya los atributos de esta clase atributos y establezca la visibilidad adecuada (público,
privado, protegido). Se aconseja utilizar un punto de partida, el tamaño y el enumerado
llamado CardinalPoint para poner la dirección en la que se situa el barco a partir de un punto
de partida O utilizar un punto inicial y un punto final y comprobar en el constructor que ambos
puntos forman una recta. Se necesitarán más atributos para llevar la cuenta de los toques del
barco.
• Programe un constructor que reciba los datos necesarios para crear un barco.
• Programe los métodos setters y getters para la clase en función de lo que necesite.
• Programe el método is_sunk(self) de la clase Ship. Método para saber si el barco ya está
hundido.
• Programe el método get_shot(self, shot_point). Implementación recibir disparo. El disparo
afectará al barco si se encuentra entre el punto de partida y el punto final. No se tendrá en
cuenta si el disparo ha sido previamente hecho en el mismo punto o no. No es necesario
hacer las comprobaciones para ver si el disparo está fuera del tablero de juego.
• Pruebe los objetos de la clase Usuario con los test cases.
Para ayudar en el desarrollo de este ejercicio, se le hace entrega de un UML parcialmente completo
de la posible implementación de este juego, así como de la clase Point, la cual representa un punto.
Se facilitan también los archivos vacios dónde deberían estar implementadas las clases que se piden
y que tienen que ser completadas por el alumno. En dichas clases, están ya añadidos los casos de
tests de cada una de ellas.
c) Programe una clase User.
• Incluya los atributos de esta clase y establezca la visibilidad adecuada (público, privado,
protegido). El juego hundir la flota, conocido en el mundo anglosajón por su nombre en inglés battleship, es un
juego tradicional de estrategia y algo de suerte, que involucra a dos participantes.
En este ejercicio, vamos a hacer una versión programada en Java para que dos jugadores puedan
jugar a este juego.
La aplicación va a comenzar permitiendo que cada jugador posicione sus barcos en un único
tablero. Cada jugador va a ocupar, según sus preferencias, una misma cantidad de casillas,
horizontal y/o verticalmente, en base a las casillas sobre las cuales están representadas sus naves.
Cada jugador va a posicionar como máximo 3 barcos. Así, por ejemplo, cinco casillas consecutivas
conforman un portaaviones; tres, una fragata; y una casilla aislada, una canoa.
No es necesario implementar el docString correspondiente a las funciones y métodos desarrollados,
aunque se recomienda hacer el diagrama de flujo de los métodos en papel de forma previa a su
resolución.
En base a estas especificaciones se solicita que:
a) Programe la clase enumearada CardinalPoints, que contendrá los puntos cardinales: NORTH, EAST,
SOUTH y WEST, por este orden.
b) Programe la clase Ship.
• Incluya los atributos de esta clase atributos y establezca la visibilidad adecuada (público,
privado, protegido). Se aconseja utilizar un punto de partida, el tamaño y el enumerado
llamado CardinalPoint para poner la dirección en la que se situa el barco a partir de un punto
de partida O utilizar un punto inicial y un punto final y comprobar en el constructor que ambos
puntos forman una recta. Se necesitarán más atributos para llevar la cuenta de los toques del
barco.
• Programe un constructor que reciba los datos necesarios para crear un barco.
• Programe los métodos setters y getters para la clase en función de lo que necesite.
• Programe el método is_sunk(self) de la clase Ship. Método para saber si el barco ya está
hundido.
• Programe el método get_shot(self, shot_point). Implementación recibir disparo. El disparo
afectará al barco si se encuentra entre el punto de partida y el punto final. No se tendrá en
cuenta si el disparo ha sido previamente hecho en el mismo punto o no. No es necesario
hacer las comprobaciones para ver si el disparo está fuera del tablero de juego.
• Pruebe los objetos de la clase Usuario con los test cases.
Para ayudar en el desarrollo de este ejercicio, se le hace entrega de un UML parcialmente completo
de la posible implementación de este juego, así como de la clase Point, la cual representa un punto.
Se facilitan también los archivos vacios dónde deberían estar implementadas las clases que se piden
y que tienen que ser completadas por el alumno. En dichas clases, están ya añadidos los casos de
tests de cada una de ellas.
c) Programe una clase User.
• Incluya los atributos de esta clase y establezca la visibilidad adecuada (público, privado,
protegido).
 */
public class Main {
    public static void main(String[] args) {
       User.menu();
    }

}
