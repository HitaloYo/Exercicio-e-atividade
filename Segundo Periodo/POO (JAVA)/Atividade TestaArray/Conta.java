public class Conta{
    private String titular;
    private int numero;
    private int agencia;
    private double saldo;
    
//construtor
    public Conta(){
}
    //setters
    public void setTitular(String titular){
        this.titular = titular;
}
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    //metodos 
    public void saca(double valor){
      if (valor <= saldo){
          this.saldo -= valor;
      }  
    }
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    public double calculaRendimento(){
        return this.saldo * 0.1;
    }
    public String getDadosConta(){
        String dados = "Titular:  " + this.titular;
        dados += "\nNumero: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        return dados;
    }
}