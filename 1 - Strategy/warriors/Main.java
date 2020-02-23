package warriors;

public class Main{
	public static void main(String args[]) {		
		King king = new King();
		king.performWeapon();
		king.setWeaponBehavior(new KnifeBehavior());
		king.performWeapon();
	}
}
