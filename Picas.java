public class Picas {
    private Cuadrado[] cuadrados;   

    public Picas() {
        cuadrados = new Cuadrado[3];

        // Posiciones de los cuadrados para formar una pica
        cuadrados[0] = new Cuadrado(new Posicion(100, 0));   // Cuadrado superior negro
        cuadrados[1] = new Cuadrado(new Posicion(50, 50));   // Cuadrado inferior izquierdo negro
        cuadrados[2] = new Cuadrado(new Posicion(150, 50));  // Cuadrado inferior derecho blanco
        
        // Cambiar colores
        cuadrados[0].changeColor("black");  // Superior negro
        cuadrados[1].changeColor("black");  // Inferior izquierdo negro
        cuadrados[2].changeColor("white");  // Inferior derecho blanco
    }

    public void dibujar() {
        // Hacer visibles los cuadrados para dibujarlos
        for (Cuadrado cuadrado : cuadrados) {
            cuadrado.makeVisible();
        }
    }
}