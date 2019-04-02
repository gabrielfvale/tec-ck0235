abstract class Conta {

    private int id;
    private String tipo;
    private double saldo = 0;

    Conta(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    Conta(int id, double saldo, String tipo) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
    }
    // Polimorfismo de coerção
    abstract void creditar(double valor);

    abstract void debitar(double valor);

    int getID() {
        return this.id;
    }

    double consultarSaldo() {
        return this.saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    String toString() {
        return "Conta " + tipo.toUpperCase() + "\n ID: " + this.id + "\n Saldo: " + this.saldo;
    }
}
