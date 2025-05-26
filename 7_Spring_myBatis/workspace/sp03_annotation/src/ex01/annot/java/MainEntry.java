package ex01.annot.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(javaConfig.class);

		Cats catInfo = acac.getBean("catsInfo", Cats.class);
		catInfo.getMyCatsInfo();

		MyCats cat2 = acac.getBean("cat2", MyCats.class);

		catInfo.setCats(cat2);
		catInfo.getMyCatsInfo();

		acac.close();

	}
}
