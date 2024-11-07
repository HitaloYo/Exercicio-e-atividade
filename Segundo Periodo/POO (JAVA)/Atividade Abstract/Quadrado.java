public class Quadrado extends Retangulo {
    
    public Quadrado (double lado1, double lado2, String cor){
        super(lado1, lado2, cor);
    }

    public String toString(){
        String dados = "A Base do Quadrado é: " + this.lado1;
        dados += "\nA altura do Quadrado é: " + this.lado2;
        dados += "\nA area do Quadrado é: " + area() ;
        return dados;
    }
    
}
