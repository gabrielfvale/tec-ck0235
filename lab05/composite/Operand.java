package composite;

public class Operand implements ExpressionComponent {
  
  private double value;

  public Operand(double value) {
    this.value = value;
  }

  public void operation() {}
  public void add(ExpressionComponent e) {}
  public void remove(ExpressionComponent e) {}
  public ExpressionComponent getChild(int index) { return null; }

  public double getValue() {
    return this.value;
  }
}
