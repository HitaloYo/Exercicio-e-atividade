package Atividade1.Q2;

public class CamaroteSuperior extends Vip{
//CONSTRUTOR
    public CamaroteSuperior(double valor, double adicional) {
        super(valor, adicional);
    }
//METODOS
    @Override
    public String exibeValor() {     
        return "O valor do Camarote superior é: " + (getValor() + getAdicional());
    }
    public String exibeLocal(){
        return "Localização: " + getLocal();       
    }

}
