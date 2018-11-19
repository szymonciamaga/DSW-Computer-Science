package programming.task_12;

public class Person {

    private String firstName;
    private String lastName;
    private String pesel;
    private String phone;
    private int age;

    public Person() {}

    public Person(String firstName, String lastName, String pesel, String phone, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.phone = phone;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (pesel != null ? !pesel.equals(person.pesel) : person.pesel != null) return false;
        return phone != null ? phone.equals(person.phone) : person.phone == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (pesel != null ? pesel.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() +
                "\nFamily name: " + getLastName() +
                "\nPesel: " + getPesel() +
                "\nPhone: " + getPhone() +
                "\nAge: " + getPhone() + "\n";
    }
}