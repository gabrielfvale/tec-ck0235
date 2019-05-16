package decorator;

import composite.ExpressionComponent;

public class CosineDecorator extends Decorator {

  private ExpressionComponent e;
  private double value;

  CosineDecorator(ExpressionComponent e) {
    super(e);
  }

  public void operation() {
    e.operation();
    this.value = Math.cos(e.getValue());
  }
  public double getValue() {
    return this.value;
  }
}
