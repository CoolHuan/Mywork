//接口的多继承，接口只能继承接口。
//新增特有常量，抽象方法；
//接口+继承接口+完成实现类+实例化
public interface USB_WIFI extends USB,Wifi{
	//特有的方法
	void usb2wifi();
}