public class Test{
	public static void main(String[] args){
		USB_WIFI mi=new MiWifi();
		System.out.println("USB_WIFIµÄÆ·ÅÆÊÇ£º"+((MiWifi)mi).brand);
		mi.read();
		mi.write();
		mi.open();
		mi.close();
		mi.usb2wifi();
		
	}
}