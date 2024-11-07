//ATRIBUTOS
public abstract class Conta{
    private String titular;
    private int numero;
    private int agencia;
    private double saldo;

    //CONSTRUTOR    
    public Conta(String titular, int numero, int agencia, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }
//METODOS
    public void saca(double valor) throws ValorInvalidoException{
        if(valor <= 0){
            throw new ValorInvalidoException("O valor do depósito deve ser positivo.");
        }
        this.saldo = valor - this.saldo;
    }
    public void deposita(double valor) throws SaldoInsuficienteException{
        if(saldo < valor){
            throw new SaldoInsuficienteException("Saldo Insuficiente para Deposito");
        }
        this.saldo = valor + this.saldo;
    }
    public void transfere(double valor, Conta conta) throws ValorInvalidoException, SaldoInsuficienteException{
        this.saca(valor);
        conta.deposita(valor);
    }
    public void imprimeDados() {
        System.out.println("");
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo );
        System.out.println("Tipo: " + getTipo() );
        System.out.println("");
    }
//SETTERS   
public void setTitular(String titular){
    this.titular = titular;
}
public void setNumero(int inteiro){
    this.numero = inteiro;
}
public void setAgencia(int linha){
    this.agencia = linha;
}
public void setSaldo(double duploflutuante){
    this.saldo = duploflutuante;
}
//GETTER
public String getTitular(){
    return this.titular;
}
public int getNumero(){
    return this.numero;
}
public int getAgencia(){
    return this.agencia;
}
public double getSaldo(){
    return this.saldo;
}
public String getTipo(){
    return "";
}
    
}