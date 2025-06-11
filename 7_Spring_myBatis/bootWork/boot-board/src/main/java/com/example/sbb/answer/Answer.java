package com.example.sbb.answer;

import java.time.LocalDateTime;
import java.util.Set;

import com.example.sbb.question.Question;
import com.example.sbb.user.SiteUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@SequenceGenerator(name = "ANSWER_SEQ_GENERATOR", 
								sequenceName = "ANSWER_SEQ", 
								initialValue = 1, allocationSize = 1)
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ANSWER_SEQ_GENERATOR")
	@Column(length = 10)
    private Integer id;

    @Column(columnDefinition = "CLOB") 
//    @Column(length = 4000, nullable = false)
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;

    @ManyToMany
    private Set<SiteUser> voter;
}