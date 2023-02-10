class Person {
    private String firstName;
    private String lastName;
    private double paycheck;

    public Person(String firstName, String lastName, double paycheck) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.paycheck = paycheck;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", paycheck=" + paycheck +
                "}\n";
    }
}

class Doctor extends Person {
    private double bonus;


    public Doctor(String firstName, String lastName, double paycheck, double bonus) {
        super(firstName, lastName, paycheck);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "bonus= " + bonus +
                "} " + super.toString();
    }
}

class Nurse extends Person {
    private int overtime;

    public Nurse(String firstName, String lastName, double paycheck, int overtime) {
        super(firstName, lastName, paycheck);
        this.overtime = overtime;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "overtime=" + overtime +
                "} " + super.toString();
    }
}
