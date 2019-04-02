class Extreme extends Conta {

    Extreme(int id) {
        super(id, "extreme");
    }

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
