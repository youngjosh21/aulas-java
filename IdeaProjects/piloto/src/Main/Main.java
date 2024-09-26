// do seu aluno favorito, Josh
// a senhora não é conservada, é linda ;) (carinha piscando)

package Main;
import contaEspecial;
import conta.Conta;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static <contaEspecial> void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        contaEspecial  contaEp;


        System.out.println("Informe o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.println("Informe se tem depósito inicial(y/n): ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y'){
            System.out.print("Informe o valor do depósito: ");
            double depInicial = sc.nextDouble();
            conta = new Conta(numero,titular,depInicial);
        }else {
            conta = new Conta(numero,titular);
        }
        System.out.println(conta);
        System.out.print("Informe o valor do depósito: ");
        double depositoValor = sc.nextDouble();
        conta.deposito(depositoValor);

        System.out.print("informe valor do saque: ");
        double saqueValor = sc.nextDouble();
        conta.saque(saqueValor);
        System.out.println(conta);

        System.out.println("Conta especial");
        // conta especial

        System.out.print("Informe o numero da conta: ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Informe o titular da conta: ");
        titular = sc.nextLine();

        System.out.print("Informe o limite de Emprestimo: R$");
        double limite = sc.nextDouble();

        System.out.print("Informe se tem o deposito inicial(s/n)");
        resposta = sc.next().charAt(0);

        if (resposta == 's'){
            System.out.print("Informe o valor do deposito: R$");
            depositoValor = sc.nextDouble();
            contaEp = new <contaEspecial>(numero, titular, depositoValor, limite);
        } else {
            contaEp = new <contaEspecial>(numero, titular, limite);
        }

        System.out.println(contaEp);

        System.out.print("Informe o valor do deposito: R$");
        depositoValor = sc.nextDouble();
        contaEp.deposito(depositoValor);
        System.out.println(contaEp);

        System.out.print("Informe o valor do saque: R$");
        saqueValor = sc.nextDouble();
        contaEp.saque(saqueValor);
        System.out.println(contaEp);

        System.out.print("Informe o valor para emprestimo: R$");
        double emprestimo = sc.nextDouble();
        emprestimo += 10.0;

        contaEp.limite(emprestimo);
        System.out.println(contaEp);

    }
}