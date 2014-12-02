public class StrTest{
	public static void main(String[] args){
		String str="sdalkfslkd";
		//取子串
		String str1=str.substring(0,5);//substring(a,b)方法取值包含头不包含尾，str1.length=b-a. 
		System.out.println(str1);
		//字符串的拼接
		String str2="Expletive";
		String str3="deleted";
		String str4=str2+str3;
		System.out.println(str4);
		// 获取字符串的长度
		System.out.println(str.length());
		//indexOf(String s)用于返回参数字符串s再指定字符串中首次出现的位置
		int size=str.indexOf("fs");
		//lastIndexOf(String str)用于返回参数字符串s再指定字符串中最后一次出现的位置。
		int size1=str.lastIndexOf("lk");
		System.out.println(size);
		System.out.println(size1);
		String str0="Hello word";
		char mychar=str0.charAt(6);
		System.out.println("字符串str中索引位置是5的字符为："+mychar);
	}
}