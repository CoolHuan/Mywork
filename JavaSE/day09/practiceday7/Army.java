import java.util.*;
public class Army{
	int index=0;
	//Weapon x;		//����һ��Weapon���͵ı���
	Weapon[] w;		//����һ��Weapon���͵�����w
	//����һ�����췽�� ����һ��int���͵Ĳ�������ʼ��w[]����
	public Army(int num){
		w=new Weapon[num];
	}
	//����һ������ ����һ��Weapon���͵Ĳ��� ����ֵ������x��
	public void addWeapon(Weapon wa){
			if(index<w.length){
				w[index]=wa;
				System.out.println("�Ѽ�������"+wa);
				index++;
			}else{
				System.out.println("����������");
			}
		
	}
	
	public void attackAll(){	
		for(int i=0;i<w.length;i++){
			w[i].attack();
		}
	
	}
	public void moveAll(){
		for(int i=0;i<w.length;i++){
			w[i].move();
		}
	}
}