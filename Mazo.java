import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> misCartas; // Lista que almacena todas las cartas del mazo
    public ArrayList<Carta> mano; // Lista que almacena la mano de cartas de un jugador

    // Constructor que crea un mazo con todas las cartas (2 al As para cada palo)
    public Mazo() {
        misCartas = new ArrayList<>();
        Palo[] tipos = Palo.values();
        for (Palo i : tipos) {
            for (int numero = 2; numero <= 14; numero++) {
                misCartas.add(new Carta(numero, i));
            }
        }
    }

    // Método que reparte una mano de 7 cartas y las elimina del mazo
    public ArrayList<Carta> getMano() {
        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < 7 && !misCartas.isEmpty(); i++) {
            mano.add(misCartas.remove(0));
        }
        return mano;
    }

    // Muestra la mano actual de cartas
    public void mostrarMano() {
        for (Carta i : mano) {
            System.out.println(i.getValor());
        }
    }

    // Método para agregar una carta al mazo
    public void agregarCarta(Carta otraCarta) {
        misCartas.add(otraCarta);
    }

    // Método para eliminar una carta del mazo
    public void eliminarCarta(Carta otraCarta) {
        misCartas.remove(otraCarta);
    }

    // Método para mostrar todas las cartas restantes en el mazo
    public void mostrarBaraja() {
        for (Carta i : misCartas) {
            System.out.println(i.getValor());
        }
    }

    // Método para ordenar el mazo por valor y palo
    public void reestablecer() {
        Collections.sort(misCartas);
    }

    // Método para mezclar las cartas del mazo de manera aleatoria
    public void revolver() {
        Collections.shuffle(misCartas);
    }
}