package CTS.practice.BUILDER.problema1;

public class Patient {
    String name;
    String diagnostic;
    Integer roomNumber;
    Boolean specialBad;
    Boolean breakfast;
    Boolean roomFlippers;
    Boolean specialRope;

    public Patient() {
    }

    public Patient(String name, String diagnostic, Integer roomNumber, Boolean specialBad, Boolean breakfast, Boolean roomFlippers, Boolean specialRope) {
        this.name = name;
        this.diagnostic = diagnostic;
        this.roomNumber = roomNumber;
        this.specialBad = specialBad;
        this.breakfast = breakfast;
        this.roomFlippers = roomFlippers;
        this.specialRope = specialRope;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setSpecialBad(Boolean specialBad) {
        this.specialBad = specialBad;
    }

    public void setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
    }

    public void setRoomFlippers(Boolean roomFlippers) {
        this.roomFlippers = roomFlippers;
    }

    public void setSpecialRope(Boolean specialRope) {
        this.specialRope = specialRope;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", diagnostic='" + diagnostic + '\'' +
                ", roomNumber=" + roomNumber +
                ", specialBad=" + specialBad +
                ", breakfast=" + breakfast +
                ", roomFlippers=" + roomFlippers +
                ", specialRope=" + specialRope +
                '}';
    }
}
