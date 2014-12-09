public class Test{
	public static void main(String[] args){
		Mobile apple=new Mobile(1234,"锤子2.0");
		//wifi
		apple.open();
		apple.close();
		//接口名  直接访问 常量
		System.out.println("wifi:"+Wifi.ssid+"密码："+Wifi.pass);
		
		apple.call();
		apple.sms();
		apple.info();
		
		apple.read();
		apple.write();
		System.out.println("USB标准："+USB.version);
	}
}