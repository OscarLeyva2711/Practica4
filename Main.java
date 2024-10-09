public class Main {
    public static void main(String[] args) {
        Carta cartaCorazon = new Carta(5, Palo.CORAZONES);
        Carta cartaTrebol = new Carta(3, Palo.TREBOLES);
        Posicion posicion1 = new Posicion(50, 50);
        Posicion posicion2 = new Posicion(200, 50);

        Visualizador.carta(cartaCorazon, posicion1);
        Visualizador.carta(cartaTrebol, posicion2);
    }
}