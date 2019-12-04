
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
public class Student {
    private String name;
    private String rollNo;
    
    public Student(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    
    public String add(){
        return "Success";
    }
    public String update(){
    return "update";
    }
    
    public String home(){
    return "index";
    }
    
}
