package Lesson.L02.EX09;

import java.util.Objects;

public class Person{
    private String name;
    private String lastName;
    private int age;
    private String job;

    public Person(String name, String lastName, int age, String job) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getLastName(), person.getLastName()) &&
                Objects.equals(getJob(), person.getJob());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getLastName(), getAge(), getJob());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
