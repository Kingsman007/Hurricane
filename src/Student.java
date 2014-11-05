
public class Student {
	
	private String name;
	private int age;
	private char gender;
	
	public Student (String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		}
	
	public void displayStudentDetails() 
	{
	System.out.println("Name:" + name +" Age:" + age +" Gender:" + gender);
	}

}
