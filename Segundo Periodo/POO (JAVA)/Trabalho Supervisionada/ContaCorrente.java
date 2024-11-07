public class ContaCorrente extends Conta implements Tributavel{
//CONSTRUTOR
    public ContaCorrente(String titular, int numero, int agencia, double saldo){
        super(titular,numero,agencia,saldo);
    }
//METODOS
    @Override
    public double getimposto() {
        return getSaldo() * 0.01;
    }
    @Override
    public String getTipo(){
        return "Corrente";
    }

}