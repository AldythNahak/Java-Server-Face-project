
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
@ManagedBean(name ="vw")
@SessionScoped
public class View {
        public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student : ");
        System.out.println("Name : "+ studentName);
        System.out.println("Roll No : "+ studentRollNo+"\n\n");
        
    }
}
