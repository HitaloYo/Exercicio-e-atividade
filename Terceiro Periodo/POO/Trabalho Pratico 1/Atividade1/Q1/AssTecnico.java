package Atividade1.Q1;

public class AssTecnico extends Assistente {
//CONSTRUTOR
    public AssTecnico(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }
 //METODOs  
    @Override
    public String toString() {
        double salarioComBonus = getSalarioBase() * 0.3;
        double salarioComBonusAux = getSalarioBase() * 0.05;
        return "Nome: " + super.getNome() + " Matricula: " + super.getMatricula() + " Salario: " + ((getSalarioBase() + salarioComBonus) + salarioComBonusAux);
    }
     
}