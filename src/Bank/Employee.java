package Bank;

public class Employee {

    private String employeeID;
    private String name;
    private String position;
    private int basicSalary;

    public Employee(String employeeID, String name, String position, int basicSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;

    }

    //Getters
    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    //Setters
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }













































} //end of class
