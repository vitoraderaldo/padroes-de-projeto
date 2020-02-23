package ducks;

public abstract class Duck{

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck(){
	}

	public abstract void display();
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior cb) {
		quackBehavior = cb;
	}
	
	public void swim(){
		System.out.println("Swimming");
	}
	public void performFly(){
		flyBehavior.fly();
	}
	public void performQuack(){
		quackBehavior.quack();
	}
}