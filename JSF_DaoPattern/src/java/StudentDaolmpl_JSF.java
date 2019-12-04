
import java.util.ArrayList;
import java.util.List;
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
@ManagedBean(name ="std")
@SessionScoped
public class StudentDaolmpl_JSF implements StudentDao_JSF {
    
     List<Student_JSF> students;
    
    public StudentDaolmpl_JSF(){
        students = new ArrayList<Student_JSF>();
        Student_JSF student1 = new Student_JSF("Aldyth",0);
        Student_JSF student2 = new Student_JSF("Irvons",1);
        Student_JSF student3 = new Student_JSF("Kores",2);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }
    

    @Override
    public List<Student_JSF> getAllStudents() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return students;
    }

    @Override
    public Student_JSF getStudent(int rollNo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student_JSF student) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     students.get(student.getRollNo()).setName(student.getName());
          System.out.println("Student Roll No "+student.getRollNo()+", Updated");
    }

    @Override
    public void deleteStudent(Student_JSF student) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    students.remove(student.getRollNo());
        System.out.println("Student Roll No "+student.getRollNo()+", Deleted");
    }

}
