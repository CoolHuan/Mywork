//创建一个显卡接口继承PCI接口
public interface Card extends PCI{
	 String type="AMD0088";
	 int price=1800;
	 void  run();
	 void close();
	
}