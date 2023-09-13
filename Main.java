import java.util.Arrays;
import java.util.Scanner;
import Baralho;
import Carta;

public class Main{
    Baralho baralho;
    List maoJogador = new ArrayList();

    Baralho();
    embaralhar();
    for(int x = 0; x<7; x++){
        Carta carta_nova = pescar();
        maoJogador.add(x, carta_nova);
    }
}
