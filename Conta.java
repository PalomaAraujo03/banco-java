public class Conta {
    
String titular;
double saldo;

public Conta(String titular) {
    this.titular = titular;
    this.saldo = 0;
}

public void depositar(double valor) {
    saldo += valor;
}

public void sacar(double valor) {
    if (valor <= saldo) {
        saldo -= valor;
    } else {
        System.out.println(" Saldo Insuficiente! ");
    }
}

public double verSaldo() {
    return saldo;
}
}