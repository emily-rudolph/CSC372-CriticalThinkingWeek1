public class Test {
    public static void main(String[] args){ 
        //Create a new Employee and test the get summary to show it worked 
        System.out.println("Test 1 Make Employee Object\n");
        Employee employee1 = new Employee(); 
        employee1.getEmployeeSummary(); 

        //Test the setter methods 
        System.out.println("Test 2 Test Employee Setters\n");
        employee1.setFirstName("John"); 
        employee1.setLastName("Smith"); 
        employee1.setEmployeeID(12345);
        employee1.setEmployeeID(50000);
        employee1.getEmployeeSummary(); 

        //Test the getter methods
        System.out.println("Test 3 Test Employee Getters\n");
        System.out.println(String.format(" \n Employee First Name: %s", employee1.getFirstName())); 
        System.out.println(String.format(" \n Employee Last Name: %s", employee1.getLastName())); 
        System.out.println(String.format(" \n Employee ID: %d", employee1.getEmployeeID())); 
        System.out.println(String.format(" \n Employee Salary: %f", employee1.getSalary())); 


        //Create a new Manager and test the get summary to show it worked 
        System.out.println("Test 4 Make Manager Object\n");
        Manager manager1 = new Manager(); 
        manager1.getEmployeeSummary(); 

        //Test the setter methods 
        System.out.println("Test 5 Test Manager Setters\n");
        manager1.setFirstName("Jane"); 
        manager1.setLastName("Doe"); 
        manager1.setEmployeeID(98765);
        manager1.setDepartment("Development");
        manager1.setSalary(60000); 
        manager1.getEmployeeSummary(); 

        //Test the getter methods
        System.out.println("Test 6 Test Manager Getters \n");
        System.out.println(String.format(" \n Manager First Name: %s", manager1.getFirstName())); 
        System.out.println(String.format(" \n Manager Last Name: %s", manager1.getLastName())); 
        System.out.println(String.format(" \n Manager ID: %d", manager1.getEmployeeID())); 
        System.out.println(String.format(" \n Manager Department: %s", manager1.getDepartment())); 
        System.out.println(String.format(" \n Manager Salary: %f", manager1.getSalary())); 

    }
}
