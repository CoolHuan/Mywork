import java.io.*;
public class FileInputStreamTest{
	public static void main(String[] args)throws IOException{
		//�����ֽ�������
		FileInputStream fis=new FileInputStream(
		"FileInputStreamTest.java");
		//����һ������Ϊ1024��"��Ͳ"
		byte[] bbuf=new byte[1024];
		//���ڱ���ʵ�ʶ�ȡ���ֽ���
		int hasRead=0;
		//ʹ��ѭ�����ظ�"ȡˮ"����
		while((hasRead=fis.read(bbuf))>0){
			//ȥ��"��Ͳ"�е�ˮ��(�ֽ�)�����ֽ�����ת�����ַ�������
			System.out.println(new String(bbuf,0,hasRead));
		}
		//�ر��ļ�������������finally�������ȫ
			fis.close();
	}
}