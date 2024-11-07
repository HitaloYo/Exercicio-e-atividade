package Atividade1.Q1;

public class Funcionarios {    
    private String nome;
    private String matricula;
    private double salarioBase;

//CONSTRUTOR
    public Funcionarios(String nome, String matricula, double salarioBase){
        this.nome = nome;
        this.matricula = matricula;
        setSalarioBase(salarioBase);
    }

//Getter and Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("O salário base deve ser maior que zero.");
        }
        this.salarioBase = salarioBase;
    }

//METODO DE EXIBIÇÃO DE DADOS
    @Override
    public String toString() {  
        return super.toString();
    }
}
