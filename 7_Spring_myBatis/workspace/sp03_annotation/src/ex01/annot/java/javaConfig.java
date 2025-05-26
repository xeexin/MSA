package ex01.annot.java;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // xml 설정파일 역할을 한다. ex)ctx.xml, appCtx.xml
public class javaConfig {

	@Bean // MyCats cat1 = new MyCats(); || <bean id="cat1" class="ex01.annot.java.MyCats"
	public MyCats cat1() {
		ArrayList<String> hobbies = new ArrayList();
		hobbies.add("앞 발 들기");
		hobbies.add("뒹굴기");

		MyCats myCats = new MyCats("네로", 7, hobbies);
		myCats.setWeight(3.0);
		myCats.setColor("black");

		return myCats;
	}

	@Bean
	public MyCats cat2() {
		ArrayList<String> hobbies = new ArrayList();
		hobbies.add("윙크");
		hobbies.add("낮잠");

		MyCats myCats = new MyCats("나비", 9, hobbies);
		myCats.setWeight(6.0);
		myCats.setColor("yellow");

		return myCats;

	}

	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1()); // ref="cat1";

		return cats;
	}

}
