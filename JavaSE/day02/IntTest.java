public class IntTest{
	public static void main(String[] args){
		//整型常量默认自动转化int类型
		int num=888;
		//大整形常量不会自动转化long类型
		//long long1=88888888888888888;error
		long long1=88888888888888888L;
		long long2=88888888888888888l;	//	建议是大写L
		System.out.println(long1);
		
		//八进制表示整型：以0开头
		int var=013;
		System.out.println("var:"+var);
		//十六进制表示整型：以0x，0X开头
		int hexNum=0xFF;
		int hexNum1=0X1F;
		System.out.println("hexNum:"+hexNum+"\n hexNum1:"+hexNum1);
		//二进制表示：以0b,0B开头e
		byte byteNum=(byte)0b1111111;
		int intNum=0b1111111;
		System.out.println("intNum:"+intNum+"\n byteNum:"+byteNum);
	
	}
}