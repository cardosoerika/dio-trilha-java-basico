    import java.util.Scanner;

    // Classe de exceção personalizada para parâmetros inválidos
    class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }

    public class Contador {
        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois); 
                // Chamando o método para realizar a contagem
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: " + e.getMessage()); 
                // Exibindo mensagem de erro em caso de exceção
            }
        }

        // Método para realizar a contagem
        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) {
                // Lançando exceção se o primeiro parâmetro for maior que o segundo
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int contagem = parametroDois - parametroUm + 1; 
            // Calculando a quantidade de números a serem impressos
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i); 
                // Imprimindo os números incrementados
            }
        }
    }
