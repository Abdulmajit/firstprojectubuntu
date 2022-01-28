package com.company;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        Student abdulmajit = new Student("Abdulmajit");
        Student jyldyzbek = new Student("Jyldyzbek");
        Student akyl = new Student("Akyl");
        Student ali = new Student("Ali");

        Student[] students = new Student[10];


        for (int i = 0; i < 10; i++) {
            if (students[i] != null)
                counter += 1;
            if(counter == 10)
                students[i].check();
        }

        for (int i = 0; i < 10; i++) {
            if (students[i] == null) {
                for (Student r : students) {
                    if (r == abdulmajit){
                        r.check2();
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (students[i] == null) {
                students[i] = abdulmajit;
                students[i].regstration();
                return;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (students[i] != null)
                counter += 1;
            if(counter != 10)
                students[i].delete();
        }

        for (int i = 0; i < 10; i++) {
            if (students[i] == null) {
                for (Student r : students) {
                    if (r == abdulmajit){
                        students[i] = null;
                        return;
                    }
                }
            }
        }
    }
}