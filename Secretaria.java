public class Secretaria extends Funcionario {
    private String ramal;

    public void setRamal( String ramal){
        this.ramal = ramal;
    }

    public String getNome(){
        return this.ramal;
    }
}
