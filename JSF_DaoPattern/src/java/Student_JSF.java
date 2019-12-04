
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aldyth M. V. Nahak (672017081)
 */
@ManagedBean(name ="obj")
@SessionScoped
public class Student_JSF {
    private String name;
    private int rollNo;
    
    Student_JSF (String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
     }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
    public String dao(){
        StudentDao_JSF studentDao = new StudentDaolmpl_JSF();
        //print student
        for (Student_JSF student: studentDao.getAllStudents()){
            System.out.println("Student: RollNo : "+student.getRollNo()+
                    ", Name : "+student.getName());
            
        }
        //update
        Student_JSF student = studentDao.getAllStudents().get(0);
        student.setName("M.Rashford");
        studentDao.updateStudent(student);
        
        //get student
        studentDao.getStudent(0);
            System.out.println("Student: RollNo : "+student.getRollNo()+
                    ", Name : "+student.getName());
       return "#{std.allStudents}";
    }

    
}
