package Atividade1.Q3;

public class Imovel {
    private String endereco;
    private double preco;

//CONSTRUTOR   
    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;   
    }
//GETTER AND SETTER
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else{
            throw new IllegalArgumentException("O preco do imovel deve ser maior que Zero");
        }
    }

}
