package programming.task_13;

public class Patient {

    private String firstName;
    private String familyName;
    private String pesel;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Patient(String firstName, String familyName, String pesel, String phone) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.pesel = pesel;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (firstName != null ? !firstName.equals(patient.firstName) : patient.firstName != null) return false;
        if (familyName != null ? !familyName.equals(patient.familyName) : patient.familyName != null) return false;
        if (pesel != null ? !pesel.equals(patient.pesel) : patient.pesel != null) return false;
        return phone != null ? phone.equals(patient.phone) : patient.phone == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (pesel != null ? pesel.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Imię: " + getFirstName() +
                "\nNazwisko: " + getFamilyName() +
                "\nPesel: " + getPesel() +
                "\nTelefon: " + getPhone();
    }
}