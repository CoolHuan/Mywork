import java.util.Scanner;
import java.io.File;
public class ScannerTest{
	public static void main(String[] args) throws Exception{
	/*	Scanner in=new Scanner(System.in);
		while(in.hasNextLong()){
			System.out.println("���������������"+in.nextLong());
		}*/
		Scanner in=new Scanner(new File("ScannerTest.java"));
		while(in.hasNextLine()){
			System.out.println(in.nextLine());
		}
	}
}