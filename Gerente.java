public class Gerente extends Funcionario {
    private String usuario;
    private String senha; 

    public void setUsuario( String usuario ){
        this.usuario = usuario;
    }

    public String getUsuario(){
        return this.usuario;
    }

    public void setSenha( String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return this.senha;
    }

    public float bonificacao(){
        float s = getSalario();
        return (float) (s*1.2);
    }

}
