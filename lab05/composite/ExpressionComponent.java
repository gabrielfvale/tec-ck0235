package composite;

public interface ExpressionComponent {

  public void operation();

  public void add(ExpressionComponent e);

  public void remove(ExpressionComponent e);

  public ExpressionComponent getChild(int index);

  public double getValue();

}
