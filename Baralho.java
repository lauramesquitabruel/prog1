import java.util.ArrayList;
import java.util.Collections;

public class Baralho{
    ArrayList<Carta> pilhaCartas = new ArrayList<Carta>();

    public Baralho(){
        pilhaCartas.add(new Carta("Esapada", "A"));
        pilhaCartas.add(new Carta("Esapada", "1"));
        pilhaCartas.add(new Carta("Esapada", "2"));
        pilhaCartas.add(new Carta("Esapada", "3"));
        pilhaCartas.add(new Carta("Esapada", "4"));
        pilhaCartas.add(new Carta("Esapada", "5"));
        pilhaCartas.add(new Carta("Esapada", "6"));
        pilhaCartas.add(new Carta("Esapada", "7"));
        pilhaCartas.add(new Carta("Esapada", "8"));
        pilhaCartas.add(new Carta("Esapada", "9"));
        pilhaCartas.add(new Carta("Esapada", "10"));
        pilhaCartas.add(new Carta("Esapada", "J"));
        pilhaCartas.add(new Carta("Esapada", "Q"));
        pilhaCartas.add(new Carta("Esapada", "K"));
        pilhaCartas.add(new Carta("Paus", "A"));
        pilhaCartas.add(new Carta("Paus", "2"));
        pilhaCartas.add(new Carta("Paus", "3"));
        pilhaCartas.add(new Carta("Paus", "4"));
        pilhaCartas.add(new Carta("Paus", "5"));
        pilhaCartas.add(new Carta("Paus", "6"));
        pilhaCartas.add(new Carta("Paus", "7"));
        pilhaCartas.add(new Carta("Paus", "8"));
        pilhaCartas.add(new Carta("Paus", "9"));
        pilhaCartas.add(new Carta("Paus", "10"));
        pilhaCartas.add(new Carta("Paus", "J"));
        pilhaCartas.add(new Carta("Paus", "Q"));
        pilhaCartas.add(new Carta("Paus", "K"));
        pilhaCartas.add(new Carta("Ouros", "A"));
        pilhaCartas.add(new Carta("Ouros", "2"));
        pilhaCartas.add(new Carta("Ouros", "3"));
        pilhaCartas.add(new Carta("Ouros", "4"));
        pilhaCartas.add(new Carta("Ouros", "5"));
        pilhaCartas.add(new Carta("Ouros", "6"));
        pilhaCartas.add(new Carta("Ouros", "7"));
        pilhaCartas.add(new Carta("Ouros", "8"));
        pilhaCartas.add(new Carta("Ouros", "9"));
        pilhaCartas.add(new Carta("Ouros", "10"));
        pilhaCartas.add(new Carta("Ouros", "J"));
        pilhaCartas.add(new Carta("Ouros", "Q"));
        pilhaCartas.add(new Carta("Ouros", "K"));
        pilhaCartas.add(new Carta("Copas", "A"));
        pilhaCartas.add(new Carta("Copas", "2"));
        pilhaCartas.add(new Carta("Copas", "3"));
        pilhaCartas.add(new Carta("Copas", "4"));
        pilhaCartas.add(new Carta("Copas", "5"));
        pilhaCartas.add(new Carta("Copas", "6"));
        pilhaCartas.add(new Carta("Copas", "7"));
        pilhaCartas.add(new Carta("Copas", "8"));
        pilhaCartas.add(new Carta("Copas", "9"));
        pilhaCartas.add(new Carta("Copas", "10"));
        pilhaCartas.add(new Carta("Copas", "J"));
        pilhaCartas.add(new Carta("Copas", "Q"));
        pilhaCartas.add(new Carta("Copas", "K"));
    }

    public void embaralhar(){
        Collections.shuffle(pilhaCartas);
    }


    public Carta pescar() throws Exception {
        boolean r = pilhaCartas.isEmpty();
        if(r == true){
            throw new Exception("Baralho vazio, não é possível pescar mais cartas");
        } else {
            Carta carta_retirada = pilhaCartas.get(0);
            pilhaCartas.remove(carta_retirada);
            return carta_retirada; 
        }
    
    }
}