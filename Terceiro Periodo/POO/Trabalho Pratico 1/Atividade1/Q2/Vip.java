package Atividade1.Q2;

public class Vip extends Ingresso {
    private double adicional;

//CONSTRUTOR
    public Vip(double valor, double adicional) {
        super(valor);
        setAdicional(adicional);
    }

//GETTER AND SETTER
    public double getAdicional() {
        return adicional;
    }
    public void setAdicional(double adicional) {
        if (adicional > 0) {
            this.adicional = adicional;
        } else{
            throw new IllegalArgumentException("O valor adicional deve ser maior que zero.");
        }
    }
//METODOS 
    public String exibeValor(){
        double valorTotal = getValor() + getAdicional();
        return "O valor total do ingresso vip é: " + valorTotal;
    }

}
