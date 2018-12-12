package designe_patterns.builder;

public class Employee {

    private String name;
    private String surname;
    private int old;
    private String country;
    private String profession;
    private String phone;
    private String address;
    private String city;
    private String postalCode;
    private String salary;
    private String section;

    private Employee(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.old = builder.old;
        this.country = builder.country;
        this.profession = builder.profession;
        this.phone = builder.phone;
        this.address = builder.address;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
        this.salary = builder.salary;
        this.section = builder.section;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", old=" + old +
                ", country='" + country + '\'' +
                ", profession='" + profession + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", salary='" + salary + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String surname;
        private int old;
        private String country;
        private String profession;
        private String phone;
        private String address;
        private String city;
        private String postalCode;
        private String salary;
        private String section;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder old(int old) {
            this.old = old;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder profession(String profesion) {
            this.profession = profesion;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder adress(String adress) {
            this.address = adress;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder salary(String salary) {
            this.salary = salary;
            return this;
        }

        public Builder section(String section) {
            this.section = section;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}

