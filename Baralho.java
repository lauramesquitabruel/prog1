import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import Carta;

public class Baralho{
    List pilhaCartas = new ArrayList();

    public Baralho(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<52; i++){
            System.out.print("Naipe: ");
            String n = sc.next();
            System.out.print("Valor: ");
            char v = sc.next();
            Carta c = Carta(n, v);
            pilhaCartas.add(i, c);
        }
    }

    public Baralho embaralhar(){
       return Collections.shuffle(pilhaCartas);
    }

    public Carta pescar() throws Exception {
        if(pilhaCartas.isEmpty() == True ){
            throw new Exception("Baralho vazio, não é possível pescar mais cartas");
        }
        Carta carta_retirada = pilhaCartas[0];
        return carta_retirada;
    }
}