public class Corazon {
    private Cuadrado[] cuadrados;

    public Corazon() {
        cuadrados = new Cuadrado[3];

        // Posiciones de los cuadrados para formar un corazón
        cuadrados[0] = new Cuadrado(new Posicion(50, 100));  // Cuadrado izquierdo
        cuadrados[1] = new Cuadrado(new Posicion(150, 100)); // Cuadrado derecho
        cuadrados[2] = new Cuadrado(new Posicion(100, 200)); // Cuadrado inferior

        // Cambiar color de los cuadrados a rojo
        for (Cuadrado cuadrado : cuadrados) {
            cuadrado.changeColor("red");
        }
    }

    public void dibujar() {
        // Hacer visibles los cuadrados para dibujarlos
        for (Cuadrado cuadrado : cuadrados) {
            cuadrado.makeVisible();
        }
    }
}