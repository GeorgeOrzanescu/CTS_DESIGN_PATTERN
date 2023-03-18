package CTS.practice.FACTORY.problema1;

import CTS.practice.BUILDER.problema1.Patient;
import CTS.practice.BUILDER.problema1.PatientBuilder;

public class Main {


    public static IHospitalEmployeeFactory mergedFactory(EmployeeType employeeType) {
        switch (employeeType) {
            case MEDIC -> {
                return new MedicFactory();
            }
            case ASISTENT -> {
                return new AsistentFactory();
            }
            case BRANCARDIER -> {
                return new BrancardierFactory();
            }
            default -> {
                System.out.println("NO such factory");
                return null;
            }
        }
    }
    public static void main(String[] args) {

        HospitalEmployee medic1 = mergedFactory(EmployeeType.MEDIC).createHospitalEmployee(32, "Augustin", EmployeeType.MEDIC);
        System.out.println(medic1);

        HospitalEmployee brancardier1 = mergedFactory(EmployeeType.BRANCARDIER).createHospitalEmployee(12,"Vasile",EmployeeType.BRANCARDIER);
        System.out.println(brancardier1);

        HospitalEmployee asistent1 = mergedFactory(EmployeeType.ASISTENT).createHospitalEmployee(10,"Mirela", EmployeeType.ASISTENT);

        System.out.println(asistent1);
    }
}
