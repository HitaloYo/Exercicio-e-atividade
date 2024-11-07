public class TestaArrays {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10]; // Cria uma array de contas de tamanho 10

        // Laço para criar dez contas com saldos distintos e colocá-las na array
        for (int i = 0; i < contas.length; i++) {
            Conta novaConta = new Conta();
            novaConta.setTitular("Titular " + (i + 1));
            novaConta.setNumero(1000 + i);
            novaConta.setAgencia(2000 + i);
            novaConta.setSaldo((i + 1) * 100); // Saldo será multiplicado pelo índice do laço
            contas[i] = novaConta; // Adiciona a nova conta à array
        }

        // Imprime os dados das contas na array
        for (Conta conta : contas) {
            System.out.println(conta.getDadosConta() + "\n");
        }
    }
}