public class HeadMaster extends OdinaryPeople{
	private String grad;
	private int clas;
	
	public void setGrade(String grade){
		this.grade=grade;
	}
	public String getGrade(){
		return this.grade;
	}
	
	public void setClas(int clas){
		this.clas=clas;
	}
	public int getClas(){
		return this.clas;
	}
	
	public void work{
	System.out.println("����ѧ��");
	}
	
	public void swap(){
		System.out.println("������"+this.name+"���䣺"+this.age+"�꼶��"
		+this.grade+"�༶��"+this.clas);
	}
}