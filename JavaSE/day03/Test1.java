//输出101-200内的质数
public class Test1{
	public static void main(String[] args){
		 System.out.println("101-200内的质数有：");
		for(int i=101;i<200;i+=2){
			boolean f=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					f=false;
					break;
				}
			}
			if(f) System.out.print(i+"\t");
		}
	}
}