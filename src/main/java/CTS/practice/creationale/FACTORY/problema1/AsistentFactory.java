package CTS.practice.creationale.FACTORY.problema1;

public class AsistentFactory implements IHospitalEmployeeFactory{
    @Override
    public HospitalEmployee createHospitalEmployee(Integer id, String name, EmployeeType employeeType) {
        return new Asistent(id,name,employeeType);
    }
}
