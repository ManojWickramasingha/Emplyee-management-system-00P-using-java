public class Employee extends Person {

    private String department;
    private String designation;

    Employee(String name, String Id, int age, int epf) {
        setName(name);
        setID(Id);
        setAge(age);
        setEPF(epf);
    }

    public void setDepartment(String dep) {
        this.department = dep;
    }

    public String getDepartment() {
        return department;
    }

    public void setdesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void employeeview() {
        System.out.println(getName());
        System.out.println(getID());
        System.out.println(getAge());
        System.out.println(getEPF());
        System.out.println(getDepartment());
        System.out.println(getDesignation());
    }
}