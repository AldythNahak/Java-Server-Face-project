
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
@ManagedBean(name ="clr")
@SessionScoped
public class Controller {
    private Student model;
    private View view;
    
    public Controller(Student model, View view){
        this.model = model;
        this.view = view;
    }
    
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    
    public void setStudentRollNo(String rollNo){
        model.setName(rollNo);
    }
    public String getStudentRollNo(){
        return model.getRollNo();
    }
       public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    } 
    
}
