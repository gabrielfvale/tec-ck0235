package composite;

import java.util.*;

public class Expression implements ExpressionComponent {

  private ExpressionComponent operand1;
  private ExpressionComponent operand2;
  private String operator;
  private double value;

  ArrayList<ExpressionComponent> components = new ArrayList<ExpressionComponent>();

  Expression(ExpressionComponent o1, String operator, ExpressionComponent o2) {
    this.operand1 = o1;
    this.operand2 = o2;
    this.operator = operator;
  }

  public void operation() {
    this.add(operand1);
    this.add(operand2);
    for (ExpressionComponent component : components) {
      component.operation();
    }
    if(this.operator.equals("*")) {
      this.value = operand1.getValue() * operand2.getValue();
    } else if(this.operator.equals("/")) {
      this.value = operand1.getValue() / operand2.getValue();
    } else {
      throw new UnsupportedOperationException();
    }
  }

  public void add(ExpressionComponent e) {
    components.add(e);
  }

  public void remove(ExpressionComponent e) {
    components.remove(e);
  }
  
  public ExpressionComponent getChild(int index) {
    return components.get(index);
  }

  public double getValue() {
    this.operation();
    return this.value;
  }

}
