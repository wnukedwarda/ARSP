package Lesson.L02.EX05;

import Lesson.ContentOfEx;

import java.util.*;

public class Exercise05 {
    private Set<String> linkedSet;
    private Set<String> treeSet;
    private Set<String> hashSet;

    public Exercise05() {
        this.linkedSet = new LinkedHashSet<>();
        loadNumberOfStudents(linkedSet);
        this.treeSet = new TreeSet<>(linkedSet);
        this.hashSet = new HashSet<>(linkedSet);
    }

    public void loadNumberOfStudents(Set<String> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students entered: ");
        int nStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < nStudents; i++) {
            System.out.println("Enter " + (i + 1) + " student:");
            students.add(scanner.nextLine());
        }
    }
    public void solve(){
        System.out.println(ContentOfEx.L02_EX05);
        System.out.println();
        System.out.println("Hash Set:");
        hashSet.stream()
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Tree Set:");
        treeSet.stream()
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Linked Set:");
        linkedSet.stream()
                .forEach(System.out::println);
    }
}
