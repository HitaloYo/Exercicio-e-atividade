public class Triangulo extends Figura {
    private double base;
    private double altura;

    //construtor
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
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
    public double calculaArea(){
        return (base*altura)/2;
    }
    
    
}
