import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {

            System.out.println("\n1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver saldo");
            System.out.println("5 - Transferir");
            System.out.println("0 - Sair");

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                banco.criarConta(nome);
            } 
            else if (op == 2) {
                System.out.print("Conta: ");
                Conta c = banco.buscarConta(sc.nextLine());

                System.out.print("Valor: ");
                double valor = sc.nextDouble();

                if (c != null) {
                    c.depositar(valor);
                } else {
                    System.out.println("Conta não encontrada");
                }
            } 
            else if (op == 3) {
                System.out.print("Conta: ");
                Conta c = banco.buscarConta(sc.nextLine());

                System.out.print("Valor: ");
                double valor = sc.nextDouble();

                if (c != null) {
                    c.sacar(valor);
                } else {
                    System.out.println("Conta não encontrada");
                }
            } 
            else if (op == 4) {
                System.out.print("Conta: ");
                Conta c = banco.buscarConta(sc.nextLine());

                if (c != null) {
                    System.out.println("Saldo: " + c.verSaldo());
                } else {
                    System.out.println("Conta não encontrada");
                }
            } 
            else if (op == 5) {
                System.out.print("Origem: ");
                String origem = sc.nextLine();

                System.out.print("Destino: ");
                String destino = sc.nextLine();

                System.out.print("Valor: ");
                double valor = sc.nextDouble();

                banco.transferir(origem, destino, valor);
            } 
            else {
                break;
            }
        }
    }
}
