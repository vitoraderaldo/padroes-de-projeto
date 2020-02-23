package ducks;

public class Main{
	public static void main(String args[]) {		
		MallardDuck mallardDuck = new MallardDuck();		
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.performFly();
		mallardDuck.performQuack();		
	}
}
