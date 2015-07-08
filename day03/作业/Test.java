package homework;

public class Test {
	public static void main(String[] args){
		Army army=new Army(100);
		army.addWeapon(new Tank());
		army.addWeapon(new Flighter());
		army.addWeapon(new WarShip());
		army.attackALL();
		army.moveALL();
		
		
	}
}
