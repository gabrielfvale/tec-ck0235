package observer;

class PositiveObserver implements Observer{

  private ExpressionSubject subject;
  private double observerState;

  public PositiveObserver(ExpressionSubject s) {
    this.subject = s;
    this.observerState = s.getState();
    s.Attach(this);
  }

	public void print(){
		if (this.observerState > 0){
			System.out.println("Result: greater than zero.");	
		}
  }
  
  public void update() {
    this.observerState = subject.getState();
  }

}
