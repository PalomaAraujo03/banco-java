import java.util.ArrayList;

public class Banco {

    ArrayList<Conta> contas = new ArrayList<>();

    public void criarConta(String nome) {
    Conta nova = new Conta(nome);
    contas.add(nova);
}

public Conta buscarConta(String nome) {
    for (Conta c : contas) {
        if (c.titular.equalsIgnoreCase(nome)) {
            return c;
        }
    }
    return null;
}

public void transferir(String origem, String destino, double valor) {

    Conta c1 = buscarConta(origem);
    Conta c2 = buscarConta(destino);

    if (c1 != null && c2 != null && c1.saldo >= valor) {
        c1.sacar(valor);
        c2.depositar(valor);
    } else {
        System.out.println("Erro na transferência");
    }
}

}
