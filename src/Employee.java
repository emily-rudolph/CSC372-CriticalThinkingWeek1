// Declare Class 
public class Employee {
    String firstName;  
    String lastName; 
    int emolpyeeID; 
    double salary; 

    //Initialize Constructor 
    public static void main(String[] args) { 
        Employee newEmployee = new Employee(); 
        newEmployee.salary = 0; 

    }

    //Getter Methods 
    public String getFirstName(){
        return this.firstName; 
    }

    public String getLastName(){
        return this.lastName; 
    }

    public int getEmployeeID(){
        return this.emolpyeeID; 
    }

    public double getSalary(){ 
        return this.salary; 
    }

    public Employee getEmployeeSummary(){ 
        System.out.println(this);
        return this; 
    }

    


    //Setter Methods 
    public void setFirstName(String newFirstName){ 
        this.firstName = newFirstName; 
    }

     public void setLastName(String newLastName){ 
        this.lastName = newLastName; 
    }

     public void setEmployeeID(int newEmployeeID){ 
        this.emolpyeeID = newEmployeeID; 
    }

    public void setSalary(double newSalary){ 
        this.salary = newSalary; 
    }


    //Override print to create good printing 
    @Override
    public String toString(){ 
       String s = String.format(" Employee First Name: %s \n Employee Last Name is: %s \n Employee ID is: %d \n Employee Salary is: %f \n", this.firstName, this.lastName, this.emolpyeeID, this.salary); 
       return s; 
    }
}

