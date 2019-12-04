
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aldyth M. V. Nahak (672017081)
 */
public interface StudentDao_JSF {
    public List<Student_JSF> getAllStudents();
    public Student_JSF getStudent (int rollNo);
    public void updateStudent (Student_JSF student);
    public void deleteStudent (Student_JSF student);
}
