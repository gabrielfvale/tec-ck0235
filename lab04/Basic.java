class Basic extends Conta {

    Basic(int id) {
        // Polimorfismo de inclusão
        super(id, "basic");
    }
    // Polimorfismo de sobrecarga
    Basic(int id, double saldo) {
        super(id, saldo, "basic");
    }

    void creditar(double valor) {
        this.saldo += valor;
    }

    void debitar(double valor) {
        this.saldo -= valor;
    }
}
