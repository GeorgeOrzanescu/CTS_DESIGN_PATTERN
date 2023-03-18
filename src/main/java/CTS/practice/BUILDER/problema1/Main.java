package CTS.practice.BUILDER.problema1;

public class Main {

    public static void main(String[] args) {

        Patient patient1 = new Patient("Marcel", "TBC", 43, false,false,false,true);

        System.out.println(patient1);

        PatientBuilder patientBuilder = new PatientBuilder();

        Patient buildPatient = patientBuilder.setPatientName("George").setRoomNumber(11).setSpecialBad(true).buildPatient();

        System.out.println(buildPatient);

    }
}
