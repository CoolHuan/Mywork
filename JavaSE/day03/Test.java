//���100��ǰ5�����Ա�3��������
public class Test{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<100;i++){
			if(i%3==0){
				sum++;
				System.out.println("��"+sum+"�����Ա�3��������Ϊ"+i);
				if(sum==5) break;
			}else{
				continue;
			}
		}
	}
}