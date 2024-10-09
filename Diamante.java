public class Diamante {
    private Cuadrado[] cuadrados;

    public Diamante() {
        cuadrados = new Cuadrado[3];

        // Posiciones de los cuadrados para formar un diamante
        cuadrados[0] = new Cuadrado(new Posicion(100, 0));   // Cuadrado superior
        cuadrados[1] = new Cuadrado(new Posicion(50, 50));   // Cuadrado inferior izquierdo
        cuadrados[2] = new Cuadrado(new Posicion(150, 50));  // Cuadrado inferior derecho
        
        // Color rojo para simular el diamante
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