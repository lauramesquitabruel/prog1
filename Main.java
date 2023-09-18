import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws Exception{
        int x = 0;
        Baralho baralho = new Baralho();
    

        ArrayList<Carta>maoJogador = new ArrayList<Carta>();
    
        for(x = 0; x<7; x++){
            Carta carta_nova = baralho.pescar();
            maoJogador.add(carta_nova);
            System.out.println(carta_nova);
        }

    }
    
}
