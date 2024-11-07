import java.util.ArrayList;
import java.util.List;

public class Banco {
//CRIAÇÃO DE LISTA
private List <Conta> listaContas = new ArrayList<>();
//METODO
    public void armazenaContas(String titular, int numero, int agencia, double saldo, String tipoDeConta){
        Conta conta;
        if(tipoDeConta.equalsIgnoreCase("corrente")){
            conta = new ContaCorrente(titular, numero, agencia, saldo);
        } else if(tipoDeConta.equalsIgnoreCase("poupanca")){
            conta = new ContaPoupanca(titular, numero, agencia, saldo);
        } else{
            throw new IllegalArgumentException("Tipo de conta desconhecida" + tipoDeConta);
        }
        listaContas.add(conta);
    }

    public void removeConta(String titular){
        listaContas.removeIf(conta -> conta.getTitular().equalsIgnoreCase(titular));
    }

    public boolean buscaConta(String titular){
        for(Conta conta : listaContas){
            if(conta.getTitular().equalsIgnoreCase(titular)){
                conta.imprimeDados();
                return true;
            }
        }
        System.out.println(titular + " Não possui conta corrente ou poupança");
        return false;
    }
    public void imprimeContas(){
        listaContas.stream().forEach(Conta::imprimeDados);
    }
}
