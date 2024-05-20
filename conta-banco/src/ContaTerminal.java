import java.util.Locale;
import java.util.Scanner;
// para usar a classe scanner é necessário fazer sua importação

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuario
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o numero da Agência.");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o numero da conta.");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu primeiro nome.");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, isira o valor desejado para deposito.");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem da conta criada

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque." );
    }
}
