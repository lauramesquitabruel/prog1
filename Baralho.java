import java.util.ArrayList;
import java.util.Collections;

public class Baralho{
    ArrayList<Carta> pilhaCartas = new ArrayList<Carta>();

    public Baralho(){
        pilhaCartas.add(new Carta("Esapada", "1"));
        pilhaCartas.add(new Carta("Esapada", "1"));
        pilhaCartas.add(new Carta("Esapada", "1"));
        pilhaCartas.add(new Carta("Esapada", "1"));
        pilhaCartas.add(new Carta("Esapada", "1"));
        pilhaCartas.add(new Carta("Esapada", "1"));
        pilhaCartas.add(new Carta("Esapada", "1"));

    }

    public void embaralhar(){
        Collections.shuffle(pilhaCartas, null);
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