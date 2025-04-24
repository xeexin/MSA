package day12_collection.set;

import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name= " + name + ", age = " + age + "]\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person temp = (Person) obj;
			return name.equals(temp.name) && age == temp.age; //return true

		}
		return false;

	}

	@Override
	public int hashCode() {
		
		return name.hashCode() + age;
	}
	
	

}

public class HashSetEx2 {
	public static void main(String[] args) {

//		Person person = new Person("heejin", 27);
//		System.out.println(person);  //toString override했기 때문에, 주소 안나옴!

		Set set = new HashSet(); // 객체도 넣을 수 있다~
		// 이름과 나이가 같아도 중복으로 저장된다.. 이러면 해쉬의 의미가 없는데,,,?!
		set.add(new Person("yuna", 36));
		set.add(new Person("yuna", 36));
		set.add(new Person("david", 20));
		set.add(new Person("david", 20));
		set.add(new Person("amy", 37));
		set.add(new Person("david", 55));
		set.add(new Person("david", 10));

		set.add(new String("happy"));
		set.add(new String("happy"));

		System.out.println(set);

	}

}
