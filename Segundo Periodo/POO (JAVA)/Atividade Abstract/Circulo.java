
public class Circulo extends Figura{
    private double raio;
    //Construtor
    Circulo(double raio, String cor){
        this.raio = raio;
        this.cor = cor;
    }
    //Metodo Setter
    void setRaio(double raio){
        this.raio = raio;
    }
    //Metodo Getter
    double getRaio(){
        return this.raio;
    }
    double getDiametro(){
        return this.raio * 2;
    }
    //Metodos
    double area(){
        return 3.14 * (this.raio * this.raio);
    }
    public String toString(){
        String dados = "O raio do Circulo é: " + this.raio;
        dados += "\nO diametro é: " + this.getDiametro();
        dados += "\nA area é: " + this.area(); 
        return dados;
        
    }
}
