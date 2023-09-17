
public class Main {

    public static void main(String[] args) {
        HRManager hr = new HRManager("manoj", "st112", 23, 34);
        Department d = new Department();
        Employee em = new Employee("lahiru", "1234fghykl", 24, 34);
        HRAssistent AS = new HRAssistent();
        Person p = new Person();
        hr.addnewEmployee("akil", "199946738u4y4v", 24, 8907546, "IT", "SOFTWARE engineer");
        hr.ADDdepartment("IT", "0112IT", "KURUNAGLA", 67);
        hr.createAccount("akila", "123edfmdfvgnjfg");
        em.setDepartment("IT");
        em.setdesignation("SOFTWARE ENGINEERING");
        em.employeeview();
        hr.searchEmployeeDetails();

    }
}