//StringBuffer���������һ���ַ����пɱ���ַ�����
//��һ��StringBuffer�������Ժ����ͨ��StringBuffer�ṩ��
//append()��insert()��reverse()��setCharAt()��setLength()
//�ȷ����ı��ַ������������
public class StringBufferTest{
	public	static void main(String[] args){
		StringBuffer sb=new StringBuffer();
		String sb1="avajw";
		//׷���ַ���
		sb.append("java");//sb="java";
		//����
		sb.insert(0,"hello ");//"hello java"
		System.out.println(sb);
		//�滻
		sb.replace(5,6,"w");//"hellowjava"
		//��ת��
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());//length()�������ַ������ȣ�
		System.out.println(sb.capacity());//capacity������������С��
		//�����ַ��γ���
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.toString().equals(sb1));
		
	}
}