public class PracticeOOP{
	public static void main(String... arg){

	Person person = new Person("Afeez",26);
System.out.println(person.getName() + " is " + person.getAge() + " year");
    }
}
class Person1{

	private String name;
	private int age;



	public Person1(String name, int age){
	this.name = name;
	this.age = age;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}

}
