package warriors;

public class King extends Warrior {
	
	public King() {
		this.setWeaponBehavior(new SwordBehavior());
	}
	
	public void fight() {
		System.out.println("Fighting like a king");
	}

}
