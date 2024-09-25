public class Carta implements Comparable<Carta> {
    private int valor; // Valor numérico de la carta (2 al As)
    private Palo tipo; // Palo de la carta (CORAZONES, DIAMANTES, etc.)

    // Constructor que inicializa la carta con un valor y un palo
    public Carta(int valor, Palo tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    // Método que devuelve una cadena con el valor y el palo de la carta
    public String getValor() {
        switch(valor){
            case 11:
                return "J de " + tipo;
                
            case 12:
                return "Q de "+ tipo;
                case 13:
                return "K de "+ tipo;
                case 14: 
                return "A de "+ tipo;


        default:
        return "Valor: " + valor + " de " + tipo;
        
        }
    }

    // Método que retorna el palo de la carta
    public Palo getTipo() {
        return tipo;
    }
public int getValorEntero(){
    return this.valor;
}
    // Método que compara esta carta con otra, primero por el palo y luego por el valor
    @Override
    public int compareTo(Carta otraCarta) {
        // Compara los palos primero
        int comparacionPalo = this.tipo.ordinal() - otraCarta.tipo.ordinal();
        if (comparacionPalo != 0) {
            return comparacionPalo;
        }
        // Si los palos son iguales, compara los valores de las cartas
        return this.valor - otraCarta.valor;
    }
}