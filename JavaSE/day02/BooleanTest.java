public class BooleanTest{
	public static void main(String[] args){
		boolean flag;
		flag=true;
		//【true】 【false】
		//boolean flag=0  //error
		if(flag){
			System.out.println("真");
		}else{
			System.out.println("假");	
		}
		String str=true+""+"\teasy";//使用boolean和字符串进行连接运算。boolean会自动转换成字符串
		System.out.println("str="+str);
	}
}