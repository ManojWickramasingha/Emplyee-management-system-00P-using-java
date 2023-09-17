public class Person {
    private String name;
    private String ID;
    private int age;
    private int EPE;

    // condtrouctor
    Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(String id) {
        this.ID = id;
    }

    public String getID() {
        return ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setEPF(int EPF) {
        this.EPE = EPF;
    }

    public int getEPF() {
        return EPE;
    }

    public void login() {
        System.out.println("login start");
    }
}