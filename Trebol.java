public class Trebol {
    private Cuadrado[] cuadrados;

    public Trebol() {
        cuadrados = new Cuadrado[3];

        // Posiciones de los cuadrados para formar un trébol
        cuadrados[0] = new Cuadrado(new Posicion(50, 50));  // Cuadrado izquierdo
        cuadrados[1] = new Cuadrado(new Posicion(150, 50)); // Cuadrado derecho
        cuadrados[2] = new Cuadrado(new Posicion(100, 150)); // Cuadrado inferior
    }

    public void dibujar() {
        // Hacer visibles los cuadrados para dibujarlos
        for (Cuadrado cuadrado : cuadrados) {
            cuadrado.makeVisible();
        }
    }
}