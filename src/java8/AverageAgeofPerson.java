package java8;

import java.util.Arrays;
import java.util.List;

public class AverageAgeofPerson {
	
	 static List<Person> person = Arrays.asList(
			
			new Person(25,"Akhil","IT","40000","male"),
			new Person(40,"Paul","IT Support","40000","male"),
			new Person(35,"Sachin","HR","40000","male"),
			new Person(18,"Virat","IT","40000","male"),
			new Person(38,"Aishwaarya","HR","40000","female"),
			new Person(22,"pooja","Developer","40000","female"),
			new Person(50,"ramshimi","Sales","40000","female")
			);
	 
	 	

	public static void main(String[] args) {
		double avgAge = person.stream().mapToInt(Person::getAge).average().orElse(0);
		System.out.println(avgAge);
				
		
				

	}

	
	
	public static class Person{
		int age;
		String name;
		String dept;
		String salary;
		String gender;
		
		
		
		public Person(int age, String name, String dept, String salary, String gender) {
			super();
			this.age = age;
			this.name = name;
			this.dept = dept;
			this.salary = salary;
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		
		
		
		
	}
}


