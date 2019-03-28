abstract class Figura {
   
    private float xc, yc;
 
    Figura(float xc, float yc) {
        this.xc = xc;
        this.yc = yc;
    }
 
    abstract void desenhar();
 
    abstract void mover(float dx, float dy);
 
    abstract double calcularArea();
}
