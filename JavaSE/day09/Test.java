public class Test{
	public static void main(String[] args){
		Mobile apple=new Mobile(1234,"����2.0");
		//wifi
		apple.open();
		apple.close();
		//�ӿ���  ֱ�ӷ��� ����
		System.out.println("wifi:"+Wifi.ssid+"���룺"+Wifi.pass);
		
		apple.call();
		apple.sms();
		apple.info();
		
		apple.read();
		apple.write();
		System.out.println("USB��׼��"+USB.version);
	}
}