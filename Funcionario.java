public class Funcionario {
    private String nome;
    private float salario;

    public void setNome(String nome ){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSalario (float salario){
        this.salario = salario;
    }

    public float getSalario(){
        return this.salario; 
    }

    public float bonificacao(){
        return (float) (this.salario*1.1);
    }

}

   
