import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Conhecer e importar classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        
        // Solicita o nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita o número da Agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita o número da Conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        // Solicita o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Obter pela scanner os valores digitados no terminal
        
        // Exibir a mensagem conta criada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}
