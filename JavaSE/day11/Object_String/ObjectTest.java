public class ObjectTest{
	public int hashCode(){//重写Object类的hashCode方法
		return 60;
	}
	public String toString(){//重写Object类的toString方法
		return "So easy";
	}
	public static void main(String[] args){
		ObjectTest t=new ObjectTest();
		ObjectTest t1=new ObjectTest();
		// Object类中的equals方法用于检测一个对象是否等于另一个对象，
		//具体是比较两个对象是否具有相同的引用。
		if(t.equals(t1))
		System.out.println("t等于t1");
		else
		System.out.println("t不等于t1");
		//getClass()返回当前对象所在的类
		System.out.println(t.getClass());	
		//hashCode(); 返回该对象的哈希码值 返回的数值为int型
		System.out.println(t1.hashCode());
		//toString() 返回该对象的字符串表示
		//该字符串由类名和此对象哈希码的无符号十六进制表示组成
		System.out.println(t1.toString());
		
	}
}