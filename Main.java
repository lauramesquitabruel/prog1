import java.util.ArrayList;
import Baralho;
import Carta;

public class Main{
    int x = 0;
    Baralho baralho = Baralho();
    ArrayList<Carta>maoJogador = new ArrayList<Carta>();
    
    for(x = 0; x<7; x++){
        Carta carta_nova = pescar();
        maoJogador.add(carta_nova);
        System.out.print(carta_nova);
    }
}
