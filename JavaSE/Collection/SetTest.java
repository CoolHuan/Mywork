//Set���ϵ�ͨ��֪ʶ ���������ͬԪ�ء��ڲ��õ�equals()������
import java.util.*;
public class SetTest{
	public static void main(String[] args){
		Set<String> books=new HashSet<>();
		//���һ���ַ���
		books.add(new String("���Java����"));
		//�ٴ����һ���ַ�������
		//��Ϊ�����ַ�������ͨ��equals�����Ƚ����
		//�������ʧ�ܣ�����false
		boolean result=books.add(new String("���Java����"));
		System.out.println(result+"--->"+books);
	}
}