package warriors;

public abstract class Warrior {
	
	private WeaponBehavior weaponBehavior;
	
	public void setWeaponBehavior(WeaponBehavior wb){
		weaponBehavior = wb;
	}
	
	public void performWeapon(){
		weaponBehavior.useWeapon();
	}
	
	public abstract void fight();

}
