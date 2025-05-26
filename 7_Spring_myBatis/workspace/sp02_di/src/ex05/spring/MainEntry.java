package ex05.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:ex05/spring/appCtx.xml");

		ArticleService service = ac.getBean("articleService", ArticleService.class);
		Article article = ac.getBean("article", Article.class);
		
		service.write(article);
	}
}
