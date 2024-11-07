package Atividade1.Q2;

public class Ingresso {
    private double valor;
//CONSTRUTOR
    public Ingresso(double valor) {
        setValor(valor);
    };

//GETTER AND SETTER
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        }else{
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
    }
//METODOS
    public String exibeValor(){
        return "";
    }
    
}
