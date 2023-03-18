package CTS.practice.FACTORY.problema1;

public class BrancardierFactory implements IHospitalEmployeeFactory{
    @Override
    public HospitalEmployee createHospitalEmployee(Integer id, String name, EmployeeType employeeType) {
        return new Brancardier(id,name,employeeType);
    }
}
