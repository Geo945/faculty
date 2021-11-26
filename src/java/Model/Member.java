package Model;

import java.util.Objects;

public class Member {
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer income;
    private Integer years_of_experience;

    public Member(String firstName, String lastName, Integer age, Integer income, Integer years_of_experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.income = income;
        this.years_of_experience = years_of_experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(Integer years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(firstName, member.firstName) && Objects.equals(lastName, member.lastName) && Objects.equals(age, member.age) && Objects.equals(income, member.income) && Objects.equals(years_of_experience, member.years_of_experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, income, years_of_experience);
    }

    @Override
    public String toString() {
        return "Member{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", income=" + income +
                ", years_of_experience=" + years_of_experience +
                '}';
    }
}
