package com.likelion.project1.week3.day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CodeUp3108 {

    private List<Student> students = new ArrayList<>();

    private Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }

    private boolean isExist(Student pStudent) {
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) {
                return true;
            }
        }
        return false;
    }

    private void addAStudent(Student student) {
        if (!isExist(student)) {
            students.add(student);
        }
    }

    private void deleteStudent(Student pStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getTestId() == pStudent.getTestId()) {
                students.remove(i);
            }
        }
    }

    public void process(String line) {
        String[] splitted = line.split(" ");
        Student student = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);

        switch (student.getCode()) {
            case "I" -> addAStudent(student);
            case "D" -> deleteStudent(student);
        }
    }

    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    private void printSpecificStudents(int[] arr) {
        // 정렬
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });

        for (int j : arr) {
            Student student = students.get(j - 1);
            System.out.printf("%s %s\n", student.getTestId(), student.getName());
        }
    }

    public static void main(String[] args) {
        CodeUp3108 codeUp3108 = new CodeUp3108();

        codeUp3108.process("I 1011 한라산");
        codeUp3108.process("I 999 백두산");
        codeUp3108.process("I 999 오대산");
        codeUp3108.process("D 999 백두산");
        codeUp3108.process("I 800 백두산");
        codeUp3108.process("D 500 한라산");
        codeUp3108.process("I 900 남산");
        codeUp3108.process("I 950 금강산");
        codeUp3108.process("I 1205 지리산");
        codeUp3108.process("I 700 북한산");

//        codeUp3108.printStudents();

        int[] arr = new int[]{1, 2, 4, 5, 6};
        codeUp3108.printSpecificStudents(arr);
    }
}
