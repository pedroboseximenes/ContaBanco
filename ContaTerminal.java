import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta contaUsuario = new Conta();

        System.out.println("Digite o número da agência: ");
        contaUsuario.setNumero(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Digite a agência: ");
        contaUsuario.setAgencia(scanner.nextLine());

        System.out.println("Digite o nome do cliente: ");
        contaUsuario.setNomeCliente(scanner.nextLine());

        System.out.println("Digite o valor do saldo: ");
        contaUsuario.setSaldo(scanner.nextBigDecimal());


        System.out.println("\n Processando......\n");

        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.",
                contaUsuario.getNomeCliente(),
                contaUsuario.getAgencia(),
                contaUsuario.getNumero(),
                contaUsuario.getSaldo().toString()
        );

        System.out.println(mensagem);
    }
}
