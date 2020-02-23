package ducks;

public class MallardDuck extends Duck{

	public MallardDuck(){
		flyBehavior = (FlyBehavior) new FlyWithWings();
		quackBehavior = (QuackBehavior) new QuackLoud();
	}
	
	public void display(){		
	}
}