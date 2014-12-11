public class  MiWifi implements USB_WIFI{
	//特点
	String brand="MI";
	//义务
	//usb
	public void read(){
		System.out.println("米wifi:usb read");
	}
	public void write(){
		System.out.println("米wifi:usb write");
	}
	//wifi
	public void open(){
		System.out.println("米wifi:wifi open");
	}
	public void close(){
		System.out.println("米wifi:wifi close");
	}
	//USB_WIFI
	public void usb2wifi(){
		System.out.println("米wifi:usb转wifi");
	}
}