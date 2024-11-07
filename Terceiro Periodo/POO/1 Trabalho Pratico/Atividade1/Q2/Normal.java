package Atividade1.Q2;

public class Normal extends Ingresso {
//CONSTRUTOR    
    public Normal(double valor) {
        super(valor);
    }
//METODOS
    @Override
    public String exibeValor() {
        return "O valor do total do ingresso normal é: " + getValor();
    }
}
