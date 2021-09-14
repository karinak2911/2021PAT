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

    public String[] getStudentsnamesAsarrayForComboBox() {
        try {
            Scanner sc = new Scanner(new File("data\\Students.txt"));

            String[] outputArr = new String[size];
            int currentIndex = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("@");
                String studentName = lineSc.next();
                outputArr[currentIndex] = studentName;
                currentIndex++;
            }
            sc.close();
            return outputArr;
        } catch (FileNotFoundException ex) {
            System.out.println("Students file not found");
            return null;
        }
    }

    public int getSize() {
        return size;
    }

    public void sort(Student[] studentArr) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (studentArr[i].compareTo(studentArr[j]) > 0) {
                    Student temp = studentArr[j];
                    studentArr[j] = studentArr[i];
                    studentArr[i] = temp;
                }
            }
        }

    }

    // have a print array to fill metho, does not apped but overwrites
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

    public void deleteStudent(String name) {
        for (int i = 0; i < size; i++) {
            if (studentArr[i].compareTo(name) == 0) {
                this.shiftLeft(i);
            }

        }

        this.sort(studentArr);
        this.printArrayToFile(studentArr);

    }

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
        this.sort(studentArr);
        this.printArrayToFile(studentArr);

    }

    public Object[][] getStudentTableData() {
        Object[][] out = new Object[size][2];
        for (int row = 0; row < size; row++) {

            out[row][0] = studentArr[row].getName();
            out[row][1] = studentArr[row].getGrade();

        }
        return out;

    }
    
    public Student getStudentForOrder(String name){ 
        for(int i = 0; i < size; i++){ 
            if(name.equalsIgnoreCase(studentArr[i].getName()))
                return studentArr[i]; 
        }
        return null; 
    }
}
