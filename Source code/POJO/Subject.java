package POJO;
// Generated Apr 10, 2017 8:42:19 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Subject generated by hbm2java
 */
public class Subject  implements java.io.Serializable {


     private String id;
     private Account account;
     private String name;
     private Set<Timetableofsubject> timetableofsubjects = new HashSet<Timetableofsubject>(0);
     private Set<Studentofsubject> studentofsubjects = new HashSet<Studentofsubject>(0);

    public Subject() {
    }

	
    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Subject(String id, Account account, String name, Set<Timetableofsubject> timetableofsubjects, Set<Studentofsubject> studentofsubjects) {
       this.id = id;
       this.account = account;
       this.name = name;
       this.timetableofsubjects = timetableofsubjects;
       this.studentofsubjects = studentofsubjects;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set<Timetableofsubject> getTimetableofsubjects() {
        return this.timetableofsubjects;
    }
    
    public void setTimetableofsubjects(Set<Timetableofsubject> timetableofsubjects) {
        this.timetableofsubjects = timetableofsubjects;
    }
    public Set<Studentofsubject> getStudentofsubjects() {
        return this.studentofsubjects;
    }
    
    public void setStudentofsubjects(Set<Studentofsubject> studentofsubjects) {
        this.studentofsubjects = studentofsubjects;
    }




}

