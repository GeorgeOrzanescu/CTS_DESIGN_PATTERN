package CTS.practice.FACTORY.problema1;

public class MedicFactory implements IHospitalEmployeeFactory{
    @Override
    public HospitalEmployee createHospitalEmployee(Integer id, String name, EmployeeType employeeType) {
        return new Medic(id,name,employeeType);
    }
}
