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
	System.out.println("管理学生");
	}
	
	public void swap(){
		System.out.println("姓名："+this.name+"年龄："+this.age+"年级："
		+this.grade+"班级："+this.clas);
	}
}