public class Visualizador{
    public static void carta(Carta c, Posicion p){
        Square square = new Square(p);
        square.changeColor("red");
        square.makeVisible();
        for(int i=0;i<c.getValorEntero();i++){
         Posicion nuevaPosicion = new Posicion(p.x,p.y +(i*30));       
        Circle circle= new Circle(nuevaPosicion);
        circle.makeVisible();
        switch(c.getTipo()){
            case Palo.DIAMANTES:
                circle.changeColor("Blue");
                break;
                case Palo.CORAZONES:
                    circle.changeColor("red");
                    case Palo.PICAS:
                        circle.changeColor("black");
                        case Palo.TREBOLES:
                            circle.changeColor("green");
                default:
                    break;

        }
        }
        
    }

    
}