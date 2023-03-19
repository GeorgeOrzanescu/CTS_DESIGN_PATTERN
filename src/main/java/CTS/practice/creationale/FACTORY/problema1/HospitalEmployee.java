package CTS.practice.FACTORY.problema1;

public abstract class HospitalEmployee {

    private Integer id;
    private String name;
    private EmployeeType employeeType;

    public HospitalEmployee(Integer id, String name, EmployeeType employeeType) {
        this.id = id;
        this.name = name;
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        return "HospitalEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeType=" + employeeType +
                '}';
    }
}
