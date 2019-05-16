package decorator;

import composite.ExpressionComponent;

public class Decorator implements ExpressionComponent {

  private ExpressionComponent exComponent;

  public Decorator(ExpressionComponent e) {
    this.exComponent = e;
  }

  public void operation() {exComponent.operation();}
  public void add(ExpressionComponent e) {exComponent.add(e);}
  public void remove(ExpressionComponent e) { exComponent.remove(e);}
  public ExpressionComponent getChild(int index) {return exComponent.getChild(index);}
  public double getValue(){return exComponent.getValue();}
}
