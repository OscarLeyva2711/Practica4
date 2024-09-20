import java.util.ArrayList;

public class Jugador {
    public String nombre; // Atributo accesible desde otras clases
    public ArrayList<Carta> mano; // Almacena las cartas del jugador

    // Constructor para inicializar el nombre del jugador y su mano
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    // Método para asignar cartas al jugador
    public void asignarCartas(ArrayList<Carta> cartas) {
        mano.addAll(cartas); // Agrega las cartas a la mano del jugador
    }

    // Método para que el jugador se deshaga de una carta
    public void deshacerseDeCarta(Carta carta) {
        mano.remove(carta); // Elimina la carta de la mano
    }

    // Método para obtener la información del jugador y sus cartas
    public String obtenerInformacion() {
        StringBuilder info = new StringBuilder("Jugador: " + nombre + "\nCartas:\n");
        for (Carta carta : mano) {
            info.append(carta.getValor()).append("\n");
        }
        return info.toString();
    }
}