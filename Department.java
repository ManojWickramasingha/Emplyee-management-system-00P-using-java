public class Department {
    private String dname;
    private String Did;
    private String Dlocation;
    private int maxEmployee;

    public void setDname(String name) {
        this.dname = name;
    }

    public String getDname() {
        return dname;
    }

    public void setDid(String id) {
        this.Did = id;
    }

    public String getDid() {
        return Did;
    }

    public void setDlocation(String location) {
        this.Dlocation = location;
    }

    public String getDlocation() {
        return Dlocation;
    }

    public void setMaxEmployee(int maxemp) {
        this.maxEmployee = maxemp;
    }

    public int getMaxEmployee() {
        return maxEmployee;
    }

}
