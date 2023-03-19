package CTS.practice.creationale.FACTORY.problema1;

public class Medic extends HospitalEmployee{


    public Medic(Integer id, String name, EmployeeType employeeType) {
        super(id, name, employeeType);
    }

    @Override
    public String toString() {
        return "Medic{}" + super.toString();
    }
}
