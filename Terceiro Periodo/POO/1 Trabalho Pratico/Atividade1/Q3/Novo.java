package Atividade1.Q3;

public class Novo extends Imovel {
    private double adicional;
//CONSTRUTOR   
    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
        
    }
//GETTER AND SETTER
    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        if (adicional > 0) {
            this.adicional = adicional;
            
        } else{
            throw new IllegalArgumentException("O valor adicional deve ser maior que Zero");
        }
    }
//METODOS
    @Override
    public String toString() {
        double valorTotal = getPreco() + getAdicional();
        return "Endereço: " + getEndereco() + "\nO valor total do novo imovel é: " + valorTotal;
    }
}
