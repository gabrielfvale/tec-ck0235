package decorator;

import composite.ExpressionComponent;

public class SineDecorator extends Decorator {

  private ExpressionComponent e;
  private double value;

  SineDecorator(ExpressionComponent e) {
    super(e);
  }

  public void operation() {
    e.operation();
    this.value = Math.sin(e.getValue());
  }
  public double getValue() {
    return this.value;
  }
}
