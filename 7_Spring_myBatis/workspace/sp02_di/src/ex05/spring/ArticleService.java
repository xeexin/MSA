package ex05.spring;

public class ArticleService {
	//service 클래스는 ArticleDAO에 의존하다. (포괄적 의미)
	
	// 주입
	
	//생성자
	
	//setter
	
	private ArticleDAO articleDAO; // has-a

	public ArticleService(ArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
		System.out.println("ArticleService 생성자 호출");
	}
	
	//글쓰기 서비스
	public void write(Article article) {
		this.articleDAO.insert(article);
	}
	
	// 수정(업데이트) 서비스
	public void update(Article article) {
//		this.articleDAO.update(article);
	}
	
	// 삭제 서비스...
	public void delete(Article article) {
//		this.articleDAO.delete(article);
	}
	

}
