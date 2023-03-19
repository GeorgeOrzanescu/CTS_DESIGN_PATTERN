package CTS.practice.FACTORY.problema1;

public class Brancardier extends HospitalEmployee{

    public Brancardier(Integer id, String name, EmployeeType employeeType) {
        super(id, name, employeeType);
    }

    @Override
    public String toString() {
        return "Brancardier{}" + super.toString();
    }
}
