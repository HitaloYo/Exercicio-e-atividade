package Atividade1.Q1;

public class AssAdministrativo extends Assistente{
    private String turno;

//CONSTRUTOR
    public AssAdministrativo(String nome, String matricula,String turno, double salario_base) {
        super(nome, matricula, salario_base);
        this.turno = turno.toLowerCase();
    }

//GETTER AND SETTER   
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno.toLowerCase();
    }


//METODOS
   @Override
   public String toString() {
       double salarioComBonus = getSalarioBase() * 0.3 ;
       double salarioComBonusAux = 0;
       
       if ("noite".equals(turno)) {
            salarioComBonusAux = getSalarioBase() * 0.15;           
        }
    
       return "Nome: " + super.getNome() + " Matricula: " + super.getMatricula() + " Salario: " + ((getSalarioBase()+salarioComBonusAux) + salarioComBonus);
   }

    

}
