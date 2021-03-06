package com.aes.model;
// Generated May 22, 2015 8:39:55 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CoursesAssigned generated by hbm2java
 */
@Entity
@Table(name="courses_assigned"
    ,catalog="aes"
)
public class CoursesAssigned  implements java.io.Serializable {


     private int assignmentId;
     private Course course;
     private UserDetails userDetails;

    public CoursesAssigned() {
    }

    public CoursesAssigned(int assignmentId, Course course, UserDetails userDetails) {
       this.assignmentId = assignmentId;
       this.course = course;
       this.userDetails = userDetails;
    }
   
     @Id 

    
    @Column(name="assignmentId", unique=true, nullable=false)
    public int getAssignmentId() {
        return this.assignmentId;
    }
    
    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }       

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="course_courseId", nullable=false)
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="user_details_userId", nullable=false)
    public UserDetails getUserDetails() {
        return this.userDetails;
    }
    
    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }




}


