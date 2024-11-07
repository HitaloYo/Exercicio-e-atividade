public class Triangulo extends Figura {
    private double base;
    private double altura;

    //construtor
    public Triangulo(double base, double altura, String cor){
        this.base = base;
        this.altura = altura;
        this.cor = cor;
    }
    //Metodos Setters
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    //Metodos Getters
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    public double area(double base, double altura){
        return (base*altura)/2;
    }
    public String toString() {
        String dados = "A base do Triangulo é: " + this.base;
        dados += "\nA altura do triangulo é: " + this.altura;
        dados += "\nA area é: " + area(this.base, this.altura);
        return dados;
    }
}
