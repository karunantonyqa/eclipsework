import java.util.ArrayList;

public class Person {
	
	private String name;
	private int age;
	private String jobTitle;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person henrie = new Person("Henrie", 24, "Technical Consultant");
		
		Person melvin = new Person("Melvin", 25, "Software Dev");
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(henrie);
		people.add(melvin);
		
		for(Person i : people) {
			System.out.println(i);
		}
		
		Person search = searchName("Melvin", people);
		search.toString();
	
	}

	
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		
		return "Name: " + name + "\nAge: " + age + "\nJob Title: " + jobTitle + "\n";
		
	}
	
	public static Person searchName(String name, ArrayList<Person> p) {
		Person result = null;
		for(Person a : p) {
			if(a.name.equals(name)) {
				result = new Person(a.name, a.age, a.jobTitle);
			}
		}
		
		return result;
	}
	
	public static Person searchName2(String name, ArrayList<Person> p) {
		Person person = null;
		
		return person;
		
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	
	public void setAge(int age) {
		this.age = age;		
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	

}
