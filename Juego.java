public class Juego {
    public static void main(String[] args) {
        // Crear un mazo de cartas
        Mazo mazo = new Mazo();
        mazo.revolver(); // Barajar el mazo

        // Crear jugadores
        Jugador jugador1 = new Jugador("Jugador 1");
        Jugador jugador2 = new Jugador("Jugador 2");

        // Repartir cartas a los jugadores (asignar cartas)
        jugador1.asignarCartas(mazo.getMano());
        jugador2.asignarCartas(mazo.getMano());

        // Mostrar la información de cada jugador (ejemplo de obtenerInformacion)
        System.out.println(jugador1.obtenerInformacion());
        System.out.println(jugador2.obtenerInformacion());

        // Ejemplo de deshacerse de una carta
        System.out.println("Jugador 1 se deshace de la primera carta.");
        if (!jugador1.mano.isEmpty()) {
            jugador1.deshacerseDeCarta(jugador1.mano.get(0));
        }

        // Mostrar la información actualizada del jugador 1
        System.out.println(jugador1.obtenerInformacion());

        // Mostrar el estado actual del mazo
        System.out.println("Cartas restantes en el mazo:");
        mazo.mostrarBaraja();

        // Devolver una carta al mazo (ejemplo de agregarCarta)
        mazo.agregarCarta(new Carta(10, Palo.CORAZONES)); // Ejemplo de agregar carta
        System.out.println("Mazo después de agregar una carta 10 de Corazones:");
        System.out.println(" ");
        mazo.mostrarBaraja(); // Mostrar el mazo actualizado
    }
}