package programming.task_2;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;
    private String adress;
    private String city;
    private String postalCode;
    private String phoneNumber;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nPerson" +
                "\nName: " + firstName +
                "\nFamily name: " + lastName +
                "\nAge: " + age +
                "\nPesel: " + pesel +
                "\nAdress " + adress +
                "\nCity: " + city +
                "\nPostal code: " +postalCode +
                "\nPhone number: " + phoneNumber ;
    }

    public Person(String firstName, String lastName, int age, String pesel, String adress, String city, String postalCode, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
        this.adress = adress;
        this.city = city;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }
}