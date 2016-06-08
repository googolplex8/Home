package packageOfStuff;

import java.util.Random;

public class Person {
	public String name;
	public int age;
	public String identification;
	int population = 0;
	Person[] people = new Person[0];

	public static void main(String[] args) {
		Random rand = new Random();
		
		Person p1 = new Person("Paco", 21, "1");
		Person p2 = new Person("Nacho", 21, "2");
		Person p3 = new Person("Felipe", rand.nextInt(100), "3");
	
	
		
		System.out.println(p2.getAge());
		System.out.println(p1.convertId(p1.getidentification()));
		
//		if (p3.getAge() == p2.getAge() || p3.getAge() == p2.getAge()) {
//			System.out.println("Some one is the same age as Felipe");
//		} else {
//			System.out.println("no one is the same age");
//		}
	}

	Person(String name, int age, String identification) {
		this.setName(name);
		this.setAge(age);
		this.setidentification(identification);
	}

	void createPerson(String name, int age, String identification){
		people[0] = new Person(name, age, identification);
		population+=1;
	}
		
	
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getidentification() {
		return identification;
	}

	void setidentification(String identifiaction) {
		this.identification = identifiaction;
	}

	int convertId(String identifiaction) {
		if (identification.contains("666")) {
			System.out.println("this person is Satan, cannot convert");
			return 666;
		}
		else{
			int ID = Integer.parseInt(identification);
			return ID;
		}
		
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

}
