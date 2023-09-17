import java.util.Scanner;

public class HRManager extends Person {
    private String hrname;
    private int hrage;
    private String hrid;
    private int hrepf;

    Person p = new Person();
    Department d = new Department();
    Designation des = new Designation();
    Employee em = new Employee(hrname, hrid, hrage, hrepf);

    HRManager(String name, String id, int age, int epf) {

        this.hrname = name;
        this.hrage = age;
        this.hrid = id;
        this.hrepf = epf;
    }

    public void addnewEmployee(String name, String id, int age, int epf, String department, String designation) {
        em.setAge(age);
        em.setEPF(epf);
        em.setID(id);
        em.setName(name);
        em.setDepartment(department);
        em.setdesignation(designation);
    }

    public void ADDdepartment(String name, String id, String location, int maxemp) {
        d.setDid(id);
        d.setDname(name);
        d.setDlocation(location);
        d.setMaxEmployee(maxemp);

    }

    public void addDesination(String type) {
        des.setType(type);
    }

    public void searchEmployeeDetails() {
        Scanner iput = new Scanner(System.in);
        String dename = iput.nextLine();

        if (em.getDepartment() == dename) {
            em.employeeview();
        }
    }

    public void createAccount(String usernme, String password) {

        String username = usernme;
        String passward = password;
    }

    // view HR manger details---
    public void viewDetails() {
        System.out.println(hrname);
        System.out.println(hrage);
        System.out.println(hrid);
        System.out.println(hrepf);
    }
}
