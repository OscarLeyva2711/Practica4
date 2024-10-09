public class Visualizador {
    public static void carta(Carta c, Posicion p) {
        // Dibujar un fondo para la carta
        Cuadrado fondo = new Cuadrado(p);
        fondo.changeColor("white");
        fondo.changeSize(200);  // Aumenta el tamaño si es necesario
        fondo.makeVisible();

        // Dibujar la figura correspondiente al palo de la carta
        switch (c.getTipo()) {
            case CORAZONES:
                Corazon corazon = new Corazon();
                corazon.dibujar();
                break;
            case DIAMANTES:
                Circulo diamante = new Circulo(p);
                diamante.changeColor("blue");
                diamante.makeVisible();
                break;
            case PICAS:
                Circulo pica = new Circulo(p);
                pica.changeColor("black");
                pica.makeVisible();
                break;
            case TREBOLES:
                Trebol trebol = new Trebol();
                trebol.dibujar();
                break;
        }

        // Dibujar los círculos que representan el valor de la carta
        for (int i = 0; i < c.getValorEntero(); i++) {
            // Los círculos se dibujarán a la derecha de la carta, ajustando su posición
            Posicion nuevaPosicion = new Posicion(p.x + 220, p.y + (i * 50)); 
            Circulo circulo = new Circulo(nuevaPosicion);
            circulo.changeColor("black");
            circulo.makeVisible();
        }
    }
}