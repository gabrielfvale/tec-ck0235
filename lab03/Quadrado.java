class Quadrado extends Figura {
 
    private double lado;
 
    Quadrado(double lado, float xc, float yc) {
        super(xc, yc);
        this.lado = lado;
    }
 
    @Override
    void desenhar() {
 
    }
 
    @Override
    void mover(float x, float y) {
 
    }
 
    @Override
    double calcularArea() {
        return Math.pow(this.lado, 2);
    }
 
}
