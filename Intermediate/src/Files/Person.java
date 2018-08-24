package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Person {
	
	String name;
	String occupation;
	int age;
	
	public static void main(String[] args) throws IOException {
		
		String fileName = "output.txt";
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		ArrayList<Person> readPeople = new ArrayList<Person>();

		
		Person p1 = new Person("Hakim", "The Thinker", 24);
		Person p2 = new Person("Noor", "The 3pm Napper", 23);
		Person p3 = new Person("Melvin", "The Dreadmaster", 25);
		Person p4 = new Person("Elvis", "The Joker", 23);
		Person p5 = new Person("Henrie", "The Eighth King, of QAC", 22);
		Person p6 = new Person("Vinu", "The Smooth Criminal", 24);
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		
		outputFile(people);	
		
		readFile(fileName, readPeople);
		
		for(int i=0;i<readPeople.size();i++) {
			System.out.println(readPeople.toString());
		}
			
	}
		

		
	

	private static String readFile(String fileName, ArrayList<Person> readPeople) throws IOException {

		File inputFile = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		String mess=null;
		int count =1;
		
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			String name = br.readLine();
			String occupation = br.readLine();
			int age = br.read();
			
			mess = name + occupation + age;
			
			readPeople.add(new Person(name, occupation, age));
		}
			
		
		return mess;
	}





	public Person(String name, String occupation, int age) {
		this.name=name;
		this.occupation=occupation;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void outputFile(ArrayList<Person> people) throws IOException {
		File outputFile = new File("output.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

		
		try {
			for(int i=0;i<people.size();i++) {
			String fileString = people.get(i).toString();
					
			bw.write(fileString);
			
			bw.newLine();
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bw.close();
	}

	@Override
	public String toString() {
		return getName() + " \n" +  getOccupation() + " \n"  + getAge() + " \n";
	}

}
