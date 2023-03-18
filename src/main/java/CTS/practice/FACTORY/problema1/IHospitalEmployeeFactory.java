package CTS.practice.FACTORY.problema1;

public interface IHospitalEmployeeFactory {
    HospitalEmployee createHospitalEmployee(Integer id, String name, EmployeeType employeeType);
}
