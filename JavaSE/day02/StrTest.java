public class StrTest{
	public static void main(String[] args){
		String str="sdalkfslkd";
		//��ȡ�Ӵ�
		String str1=str.substring(0,5);//substring(a,b)����ȡֵ����ͷ������β��str1.length=b-a. 
		System.out.println(str1);
		
		//�ַ�����ƴ��
		String str2="Expletive";
		String str3="deleted";
		String str4=str2+str3;
		System.out.println(str4);
		
		// ��ȡ�ַ����ĳ���
		System.out.println(str.length());
		
		//indexOf(String s)���ڷ��ز����ַ���s��ָ���ַ������״γ��ֵ�λ��
		int size=str.indexOf("fs");
		
		//lastIndexOf(String str)���ڷ��ز����ַ���s��ָ���ַ��������һ�γ��ֵ�λ�á�
		int size1=str.lastIndexOf("lk");
		System.out.println(size);
		System.out.println(size1);
		String str0="Hello word";
		
		//str.charAt(int index) ���ڻ�ȡָ������λ�õ��ַ�
		char mychar=str0.charAt(6);
		System.out.println("�ַ���str������λ����5���ַ�Ϊ��"+mychar);
		
		//ȥ���ո� str.trim();���ڷ����ַ����ĸ���������ǰ���ո��β���ո�
		String str5="   Java  class   ";
		System.out.println(str5.length());
		System.out.println(str5.trim().length());
		
		//���ַ�����ָ���ַ����ַ����滻���µ��ַ����ַ���
		System.out.println(str5.replace("c","C"));
		//�ж��ַ����Ŀ�ʼ�ͽ�β str.startWith(String prefix)/str.endWith(String suffix)
	}
}