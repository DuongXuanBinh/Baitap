package Java.Session7;

public class Vidu9 {
    int empID;
    String empName;
    private String SSN;
    protected String empDesig;
    /**
     * Parameterized constructor
     *
     * @param ID an interger variable storing the employee ID
     * @param name a String variable storing the employee name
     * @return void
     */
    public Vidu9(int ID,String name){
        empID = ID;
        empName=name;
    }
    //Define public methods
    /**
     * Returns the value of SSN
     *
     * @return String
     */
    public String getSSN(){
        return SSN;
    }
    /**
     * Sets the value of SSN
     *
     * @param ssn a String variable storing the social security number
     * @return void
     */
    public void setSSN(String ssn){
        SSN =ssn;
    }
    /**
     * Sets the value of Designation
     *
     * @param desig a String valiable storing the employee designation
     * @return void
     */
    public void setDesignation(String desig){
        empDesig=desig;
    }
    /**
     * Displays employee details
     *
     * @return void
     */
    public void display(){
        System.out.println("Employee ID is "+empID);
        System.out.println("Employee name is "+empName);
        System.out.println("Designation is "+empDesig);
        System.out.println("SSN is "+SSN);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vidu9 obj = new Vidu9(1200,"Roger Stevens");
        obj.empDesig="Manager";
        obj.SSN="281-72-3873";

        obj.display();
    }
}
