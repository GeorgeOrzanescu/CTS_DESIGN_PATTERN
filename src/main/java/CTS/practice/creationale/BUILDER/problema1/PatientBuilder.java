package CTS.practice.creationale.BUILDER.problema1;

public class PatientBuilder implements IPatientBuilder{
    String name;
    String diagnostic;
    Integer roomNumber;
    Boolean specialBad;
    Boolean breakfast;
    Boolean roomFlippers;
    Boolean specialRope;

    public PatientBuilder() {
        this.name = "";
        this.diagnostic = "";
        this.roomNumber = 0;
        this.specialBad = false;
        this.breakfast = false;
        this.roomFlippers = false;
        this.specialRope = false;
    }

    @Override
    public Patient buildPatient() {
        return new Patient(this.name,this.diagnostic,this.roomNumber,this.specialBad,this.breakfast,this.roomFlippers,this.specialRope);
    }

    public PatientBuilder setPatientName(String patientName) {
        this.name = patientName;
        return this;
    }

    public PatientBuilder setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
        return this;
    }

    public PatientBuilder setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public PatientBuilder setSpecialBad(Boolean specialBad) {
        this.specialBad = specialBad;
        return this;
    }

    public PatientBuilder setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
        return this;
    }

    public PatientBuilder setRoomFlippers(Boolean roomFlippers) {
        this.roomFlippers = roomFlippers;
        return this;
    }

    public PatientBuilder setSpecialRope(Boolean specialRope) {
        this.specialRope = specialRope;
        return this;
    }


}
