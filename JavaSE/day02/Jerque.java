public class Jerque{
	public static void main(String[] args){
	String str="";
	long startTime=System.currentTimeMillis();
	for(int i=0;i<100000;i++){
	str=str+i;
	}
	long endTime=System.currentTimeMillis();
	long time=endTime-startTime;
	System.out.println("String消耗时间为"+time);
	StringBuilder builder=new StringBuilder("");
	long startTime1=System.currentTimeMillis();
	for(int j=0;j<100000;j++){
		builder.append(j);
	}
	long endTime1=System.currentTimeMillis();
	long time1=endTime1-startTime1;
	System.out.println("StringBuilder消耗时间为"+time1);
	}
}