import java.util.*;
public class Army{
	Weapon x;		//����һ��Weapon���͵ı���
	Weapon[] w;		//����һ��Weapon���͵�����w
	//����һ�����췽�� ����һ��int���͵Ĳ�������ʼ��w[]����
	public Army(int num){
		w=new Weapon[num];
	}
	//����һ������ ����һ��Weapon���͵Ĳ��� ����ֵ������x��
	public void addWeapon(Weapon wa){
		x=wa;
		Arrays.fill(w,wa); //ʹ��ͬһ��ֵ������������
	}
	
	public void attackAll(){	
		for(int i=0;i<w.length;i++){
			x.attack();
		}
	
	}
	public void moveAll(){
		for(int i=0;i<w.length;i++){
			x.move();
		}
	}
}