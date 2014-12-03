//输出100内前5个可以被3整除的数
public class Test{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<100;i++){
			if(i%3==0){
				sum++;
				System.out.println("第"+sum+"个可以被3整除的输为"+i);
				if(sum==5) break;
			}else{
				continue;
			}
		}
	}
}