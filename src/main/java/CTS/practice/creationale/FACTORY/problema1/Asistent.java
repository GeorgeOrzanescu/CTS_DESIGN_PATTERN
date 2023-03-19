package CTS.practice.creationale.FACTORY.problema1;

public class Asistent extends HospitalEmployee{
    public Asistent(Integer id, String name, EmployeeType employeeType) {
        super(id, name, employeeType);
    }

    @Override
    public String toString() {
        return "Asistent{}" + super.toString();
    }
}
