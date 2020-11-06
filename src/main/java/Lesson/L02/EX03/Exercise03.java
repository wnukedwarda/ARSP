package Lesson.L02.EX03;

import Lesson.ContentOfEx;

import java.util.Scanner;

public class Exercise03 {
    private Scanner scanner;
    private Employee employee;

    public Exercise03() {
        this.scanner = new Scanner(System.in);
        this.employee = new Employee();
    }

    public void solve(){
        System.out.println(ContentOfEx.L02_EX03);
        System.out.println("Enter companies:");
        String text = scanner.nextLine();
        employee.addCompanies(text);
        System.out.println("Companies: " + employee.getCompanies());
    }
}
