package Atividade1.Q3;

public class Velho extends Imovel {
    private double desconto;
//CONSTRUTOR
    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        setDesconto(desconto);
    }
//GETTER AND SETTER
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        if (desconto > 0) {
            this.desconto = desconto;
        } else { 
            throw new IllegalArgumentException("O valor do desconto deve ser maior que zero " + desconto);
        }
    }


//METODOS
    @Override
    public String toString() {    
        return "Endereço: "+ getEndereco() + "\nValor do imovel velho: " + (getPreco() - getDesconto());
    }
    
}
