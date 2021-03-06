package com.aes.model;
// Generated May 22, 2015 8:39:55 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ExamScores generated by hbm2java
 */
@Entity
@Table(name="exam_scores"
    ,catalog="aes"
)
public class ExamScores  implements java.io.Serializable {


     private int examScoresId;
     private Exam exam;
     private UserDetails userDetails;
     private Date dateTaken;
     private int score;
     private int maxScore;

    public ExamScores() {
    }

    public ExamScores(int examScoresId, Exam exam, UserDetails userDetails, Date dateTaken, int score, int maxScore) {
       this.examScoresId = examScoresId;
       this.exam = exam;
       this.userDetails = userDetails;
       this.dateTaken = dateTaken;
       this.score = score;
       this.maxScore = maxScore;
    }
   
     @Id 

    
    @Column(name="examScoresId", unique=true, nullable=false)
    public int getExamScoresId() {
        return this.examScoresId;
    }
    
    public void setExamScoresId(int examScoresId) {
        this.examScoresId = examScoresId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="exam_examId", nullable=false)
    public Exam getExam() {
        return this.exam;
    }
    
    public void setExam(Exam exam) {
        this.exam = exam;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_details_userId", nullable=false)
    public UserDetails getUserDetails() {
        return this.userDetails;
    }
    
    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dateTaken", nullable=false, length=19)
    public Date getDateTaken() {
        return this.dateTaken;
    }
    
    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    
    @Column(name="score", nullable=false)
    public int getScore() {
        return this.score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }

    
    @Column(name="max_score", nullable=false)
    public int getMaxScore() {
        return this.maxScore;
    }
    
    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }




}


