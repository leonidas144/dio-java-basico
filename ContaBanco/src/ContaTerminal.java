import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 1500;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, bem-vindo ao nosso banco. Por gentileza, preencha os dados solicitado.");

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Digite o numero de sua agência: ");
        agencia = sc.next();

        System.out.println("Digite o número de sua conta: ");
        numero = sc.nextInt();
        
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + 
                            agencia +", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque");
    }
}