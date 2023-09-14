import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baralho{
    ArrayList<Carta> pilhaCartas = new ArrayList<Carta>();

    public Baralho(){
        Scanner sc = new Scanner(System.in);
        Carta c;

        for(int i = 0; i<52; i++){
            System.out.print("Naipe: ");
            String n = sc.next();
            c.naipe = n;
            System.out.print("Valor: ");
            String v = sc.next();
            c.valor = v;
            pilhaCartas.add(c);
        }
    }

    public void embaralhar(){
        Collections.shuffle(pilhaCartas, null);
    }


    public ArrayList<Carta> pescar() throws Exception {
        boolean r = pilhaCartas.isEmpty();
        if(r == true){
            throw new Exception("Baralho vazio, não é possível pescar mais cartas");
        } else {
            return pilhaCartas[0];
        }
    
    }
}