public class PersonTest{
	public static void main(String[] args){
		Person A=Person.getInstance();
		A.name="小明";
		System.out.println("A的名字"+A.name);
		Person B=Person.getInstance();
		System.out.println("B的名字"+A.name);
	}	
}		