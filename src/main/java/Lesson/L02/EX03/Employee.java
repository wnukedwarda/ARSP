package Lesson.L02.EX03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private List<String> companies;

    public Employee() {
        this.companies = new ArrayList<>();
    }

    public List<String> getCompanies() {
        return companies;
    }

    public void addCompanies(String text){
        Scanner sc = new Scanner(text).useDelimiter(",");
        while (sc.hasNext()){
            companies.add(sc.next().trim());
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "companies=" + companies +
                '}';
    }
}
