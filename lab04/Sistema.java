import conta.*;

class Sistema {

    private Conta[] contas = new Conta[1];

    // Polimorfismo de sobrecarga
    void criarContaXPTOBasic(int id) {
        Conta basic = new Basic(id);
    }
    void criarContaXPTOBasic(int id, double saldo) {
        Conta basic = new Basic(id, saldo);
    }

    // Polimorfismo de sobrecarga
    void criarContaXPTOPlus(int id) {
        Conta plus = new Plus(id);
    }
    void criarContaXPTOPlus(int id, double saldo) {
        Conta plus = new Plus(id, saldo);
    }

    // Polimorfismo de sobrecarga
    void criarContaXPTOExtreme(int id) {
        Conta extreme = new Extreme(id);
    }
    void criarContaXPTOExtreme(int id, double saldo) {
        Conta extreme = new Extreme(id, saldo);
    }

    Conta contaPorID(int id) {
        for(int i = 0; i < this.contas.length; i++) {
            if(this.contas[i].getID() == id) return this.contas[i];
        }
        return null;
    }

    void creditar(int id, double valor) {
        contaPorID(id).creditar(valor);
    }

    void debitar(int id, double valor) {
        contaPorID(id).debitar(valor);
    }

    double consultarSaldo(int id) {
        return contaPorID(id).consultarSaldo();
    }
}
