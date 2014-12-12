//StringBuffer对象则代表一个字符序列可变的字符串。
//当一个StringBuffer被创建以后可以通过StringBuffer提供的
//append()、insert()、reverse()、setCharAt()、setLength()
//等方法改变字符串对象的序列
public class StringBufferTest{
	public	static void main(String[] args){
		StringBuffer sb=new StringBuffer();
		String sb1="avajw";
		//追加字符串
		sb.append("java");//sb="java";
		//插入
		sb.insert(0,"hello ");//"hello java"
		System.out.println(sb);
		//替换
		sb.replace(5,6,"w");//"hellowjava"
		//反转：
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());//length()方法（字符串长度）
		System.out.println(sb.capacity());//capacity方法（容器大小）
		//设置字符段长度
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.toString().equals(sb1));
		
	}
}