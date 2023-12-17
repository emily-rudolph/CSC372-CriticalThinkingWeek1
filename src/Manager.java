//Declare Manager Subclass 
public class Manager extends Employee {
    String department; 

    //Override print to create good printing 
    //Note: Because we are overriding the built in print like this there is no need for another employee summary method.
    @Override
    public String toString(){ 
       String s = String.format(" Employee First Name: %s \n Employee Last Name is: %s \n Employee ID is: %d \n Employee Salary is: %f \n Employee Department is: %s \n", this.firstName, this.lastName, this.emolpyeeID, this.salary, this.department); 
       return s; 
    }

    //Getter for department 
    public String getDepartment(){ 
        return this.department; 
    }


    //Setter for department 
    public void setDepartment(String newDepartment){ 
        this.department = newDepartment; 
    }
    
}
