public class BreakTest{
	public static void main(String[] args){
		int stop=4;
		for(int i=1;i<=10;i++){
			if(i==stop){
				//break;      //��i����stopʱ���˳�����ѭ��
				continue;		//��i����stopʱ���˳�����ѭ��
			}else{
				System.out.println("i="+i);
			}
		}
	}
}