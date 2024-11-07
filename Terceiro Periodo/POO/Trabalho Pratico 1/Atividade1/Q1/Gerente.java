package Atividade1.Q1;

//CONSTRUTOR
public class Gerente extends Funcionarios{
    public Gerente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
        
    }
//METODO DE EXIBIÇÃO DE DADOS
    @Override
    public String toString() {
        double salarioComBonus = super.getSalarioBase() * 0.5;
        return "Nome: " + super.getNome() + " Matricula: " + super.getMatricula() + " Salario: " +(super.getSalarioBase() + salarioComBonus);
    }

}
