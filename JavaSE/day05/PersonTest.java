public class PersonTest{
	public static void main(String[] args){
		Person A=Person.getInstance();
		A.name="С��";
		System.out.println("A������"+A.name);
		Person B=Person.getInstance();
		System.out.println("B������"+A.name);
	}	
}		