package com.example.sbb.question;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	Question findBySubject(String subject);

	Question findBySubjectAndContent(String subject, String content);

	List<Question> findBySubjectLike(String subject);

	Page<Question> findAll(Pageable pageable);

	Page<Question> findAll(Specification<Question> spec, Pageable pageable);

//    @Query("select "
//            + "distinct q "
//            + "from Question q " 
//            + "left outer join SiteUser u1 on q.author=u1 "
//            + "left outer join Answer a on a.question=q "
//            + "left outer join SiteUser u2 on a.author=u2 "
//            + "where "
//            + "   q.subject like %:kw% "
//            + "   or q.content like %:kw% "
//            + "   or u1.username like %:kw% "
//            + "   or a.content like %:kw% "
//            + "   or u2.username like %:kw% ")
//    Page<Question> findAllByKeyword(@Param("kw") String kw, Pageable pageable);

	@Query(value = "SELECT * FROM ( " + "  SELECT q., ROWNUM rn FROM ( " + "    SELECT DISTINCT q. "
			+ "    FROM question q " + "    LEFT JOIN site_user u1 ON q.author_id = u1.id "
			+ "    LEFT JOIN answer a ON a.question_id = q.id " + "    LEFT JOIN site_user u2 ON a.author_id = u2.id "
			+ "    WHERE q.subject LIKE %:kw% " + "       OR q.content LIKE %:kw% "
			+ "       OR u1.username LIKE %:kw% " + "       OR a.content LIKE %:kw% "
			+ "       OR u2.username LIKE %:kw% " + "    ORDER BY q.create_date DESC " + "  ) q WHERE ROWNUM <= :end "
			+ ") WHERE rn > :start", nativeQuery = true)
	List<Question> searchByKeywordNative(@Param("kw") String kw, @Param("start") int start, @Param("end") int end);

}