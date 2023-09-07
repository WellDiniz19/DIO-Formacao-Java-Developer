import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String Agencia;
        int numeroConta;
        String nomeCliente;
        double saldoConta;

        System.out.println("Bem-vindo ao DIO Bank \n");
        System.out.println("Por favor, digite o número da sua Agência!");
        Agencia = sc.next();
        System.out.println("Obrigado, agora digite o número da conta!");
        numeroConta = sc.nextInt();
        System.out.println("Por favor, digite seu nome!");
        nomeCliente = sc.next();
        System.out.println("Por favor, digite seu saldo!");
        saldoConta = sc.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + Agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldoConta
                + " já está disponível para saque.");

        sc.close();
    }
}
