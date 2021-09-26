/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Navi
 */
public class StudentArray {

    Student[] studentArr = new Student[200];
    private int size;

    public StudentArray() {
        try {
            Scanner sc = new Scanner(new File("data\\Students.txt"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                Scanner lineSc = new Scanner(line);
                lineSc.useDelimiter("@");
                String name = lineSc.next();
                int grade = lineSc.nextInt();

                Student s = new Student(name, grade);
                studentArr[size] = s;
                size++;

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Students file not found");

        }

    }

    // returns an array of students for combo box 
    public String[] getStudentsnamesAsarrayForComboBox() {
        String[] output = new String[200];
        for (int i = 0; i < size; i++) {
            output[i] = studentArr[i].getName();
        }
        return output;

    }

    public void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            studentArr[i] = studentArr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index) {
        size++;
        for (int i = size - 1; i > index; i--) {
            studentArr[i] = studentArr[i - 1];
        }
    }

    // overwrites the file 
    public void printArrayToFile(Student[] arr) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("data\\Students.txt"));
            for (int i = 0; i < size; i++) {
                pw.println(arr[i].fileFormat());
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }

    // removes student from array using compare to method 
    public void deleteStudent(String name) {
        for (int i = 0; i < size; i++) {
            if (studentArr[i].compareTo(name) == 0) {
                this.shiftLeft(i);
            }

        }

        this.printArrayToFile(studentArr);

    }

    // adds a student to array 
    public void addStudent(String name, int grade) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (studentArr[i].compareTo(name) > 0) {
                index = i;
                break;
            }
        }
        this.shiftRight(index);
        studentArr[index] = new Student(name, grade);

        this.printArrayToFile(studentArr);

    }

    // returns a 2D object array of the students name and grade to populate table for manage students screen 
    public Object[][] getStudentTableData() {
        Object[][] out = new Object[size][2];
        for (int row = 0; row < size; row++) {

            out[row][0] = studentArr[row].getName();
            out[row][1] = studentArr[row].getGrade();

        }
        return out;

    }

    // returns a student for an order based of the name selected 
    public Student getStudentForOrder(String name) {
        for (int i = 0; i < size; i++) {
            if (name.equalsIgnoreCase(studentArr[i].getName())) {
                return studentArr[i];
            }
        }
        return null;
    }
}
