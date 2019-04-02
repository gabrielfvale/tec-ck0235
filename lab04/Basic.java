class Basic extends Conta {

    Basic(int id) {
        super(id, "basic");
    }

    Basic(int id, double saldo) {
        super(id, saldo, "basic");
    }

    void creditar(double valor) {
        this.saldo += valor;
    }

    void debitar(double valor) {
        this.saldo -= valor;
    }

    String toString() {
        
    }
}
