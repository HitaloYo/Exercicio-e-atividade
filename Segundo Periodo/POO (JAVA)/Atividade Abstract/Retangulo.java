public class Retangulo extends Figura {
    //Atributos
    protected double lado1;
    protected double lado2;

    //Construtor
    Retangulo(double lado1, double lado2, String cor){
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.cor = cor;
    }

    //Metodos Setters
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    //Metodos Getters
    public double getLado1(){
        return this.lado1;
    }
    public double getLado2(){
        return this.lado2;
    }
    //Metodos Funções
    public double area(){
        return this.lado1 * this.lado2;
    }
    public String toString(){
        String dados = "A Base do retangulo é: " + this.lado1;
        dados += "\nA altura do retangulo é: " + this.lado2;
        dados += "\nA area do retangulo é: " + area() ;
        return dados;
    }
}
