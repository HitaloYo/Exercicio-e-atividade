public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(String titular, int numero, int agencia, double saldo){
        super(titular,numero,agencia,saldo);
    }
    public String getTipo(){
        return "Poupança";
    }
}