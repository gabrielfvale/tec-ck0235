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

    abstract void creditar(double valor);

    abstract void debitar(double valor);

    String toString() {
        System.out.println("Conta " + tipo.toUpperCase() + "\n ID: " + this.id + "\n Saldo: " + this.saldo);
    }
}
