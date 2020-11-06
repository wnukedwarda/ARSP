package Lesson.L02.EX03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private String text;
    private List<String> companies;
    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee();
        text = "LG, Kinder, Samsung, Dell";
        companies = Arrays.asList("LG", "Kinder", "Samsung", "Dell");
        employee.addCompanies(text);
    }

    @Test
    void addCompanies(){
        assertEquals(employee.getCompanies(),companies);
    }

}