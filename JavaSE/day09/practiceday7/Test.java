import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		System.out.println("�������������������");
		Army  usa=new Army(in.nextInt());
		System.out.println("��ѡ������(��������)��");
		System.out.println("1.Tank 2.Flighter 3.WarShip");
		int i=in.nextInt();
		if(i==1){
			Tank t=new Tank();
			usa.addWeapon(t);
			usa.attackAll();
			usa.moveAll();
		}else if(i==2){
			Flighter t=new Flighter();
			usa.addWeapon(t);
			usa.attackAll();
			usa.moveAll();
		}else if(i==3){
			WarShip t= new WarShip();
			usa.addWeapon(t);
			usa.attackAll();
			usa.moveAll();
		}
		
	}
		
}