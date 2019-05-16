package observer;

import java.util.*;

import composite.Expression;

public class ExpressionSubject implements Subject {

  private Expression e;
  private ArrayList<Observer> observers;
  private double subjectState;

  public ExpressionSubject(Expression e) {
    this.e = e;
    this.observers = new ArrayList<Observer>();
    this.subjectState = e.getValue();
  }

  public void Attach(Observer o) {
    observers.add(o);
  }
  public void Detach(Observer o) {
    observers.remove(o);
  }
  public void Notify() {
    for (Observer observer : observers) {
      observer.update();
    }
  }
  public double getState() {
    this.subjectState = e.getValue();
    return this.subjectState;
  }
}
