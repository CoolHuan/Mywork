public class Test{
	public static void main(String[] args){
		Army  usa=new Army(3);
		Tank t=new Tank();
		Flighter t1=new Flighter();	
		WarShip t2= new WarShip();	
		WarShip t3= new WarShip();	
		usa.addWeapon(t);
		usa.addWeapon(t1);
		usa.addWeapon(t2);	
		usa.addWeapon(t3);	
		usa.attackAll();
		usa.moveAll();
	}
		
}