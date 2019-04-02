class Extreme extends Conta {

    Extreme(int id) {
        // Polimorfismo de inclusão
        super(id, "extreme");
    }
    // Polimorfismo de sobrecarga
    Extreme(int id, double saldo) {
        super(id, saldo, "extreme");
    }

    void creditar(double valor) {
        this.saldo += valor;
    }

    void debitar(double valor) {
        this.saldo -= valor;
    }

}
