package ex05.spring;

public class MySqlArticleDAO implements ArticleDAO {

	@Override
	public void insert(Article article) {
		System.out.println("MySQL Insert 구문 실행");

	}
	
	/**
	 * delete, update, select 구문 실행하기
	 */

}
