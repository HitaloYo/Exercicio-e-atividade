package Atividade1.Q1 ;

public class Assistente extends Funcionarios {
    
//CONSTRUTOR
    public Assistente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);      
    }

//METODO DE EXIBIÇÃO DE DADOS    
    @Override
    public String toString() {
        double salarioComBonus =getSalarioBase() * 1.3;
        return "Nome: " + super.getNome() + " Matricula: " + super.getMatricula() + " Salario: " + salarioComBonus;
    }
    
}
