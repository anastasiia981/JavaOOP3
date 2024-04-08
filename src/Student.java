public class Student {
    protected String firstName;
    protected String lastName;
    protected int age;



    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public int getAge() {
        return age;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s", firstName, lastName, age);
    }
}