class Plus extends Conta {

    Plus(int id) {
        // Polimorfismo de inclusão
        super(id, "plus");
    }
    // Polimorfismo de sobrecarga
    Plus(int id, double saldo) {
        super(id, saldo, "plus");
    }

    void creditar(double valor) {

    }

    void debitar(double valor) {
 
    }
}
