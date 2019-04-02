class Extreme extends Conta {

    Extreme(int id) {
        super(id);
    }

    Extreme(int id, double saldo) {
        super(id, saldo);
    }

    void creditar(double valor) {
        this.saldo += valor;
    }

    void debitar(double valor) {
        this.saldo -= valor;
    }

    void toString()
}
