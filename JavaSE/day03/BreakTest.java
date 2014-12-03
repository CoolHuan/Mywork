public class BreakTest{
	public static void main(String[] args){
		int stop=4;
		for(int i=1;i<=10;i++){
			if(i==stop){
				//break;      //当i等于stop时，退出整个循环
				continue;		//当i等于stop时，退出本次循环
			}else{
				System.out.println("i="+i);
			}
		}
	}
}