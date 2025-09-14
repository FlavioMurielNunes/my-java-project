import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        //TODO:Conhecer e importar a classe Scanner

        //Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        //Declaração de variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        //Exibir as mensagens para o nosso usuário e obter os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o seu saldo!");
        saldo = scanner.nextDouble();
        
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$ " + saldo + " já está disponível para saque.");
        
        //Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}