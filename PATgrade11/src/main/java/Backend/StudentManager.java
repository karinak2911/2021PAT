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
public class StudentManager {

    Student[] arr = new Student[200];
    private int size;

    public StudentManager() {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\2021PAT\\PATgrade11\\data\\Students.txt"));

            while (sc.hasNextLine()) {
                Scanner lineSc = new Scanner(sc.nextLine());
                lineSc.useDelimiter("@");
                String name = sc.next();
                int grade = sc.nextInt();

                Student s = new Student(name, grade);
                arr[size] = s;
                size++;

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Students file not found");

        }

    }

    public String[] getStudentsnamesAsarrayForComboBox() {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\2021PAT\\PATgrade11\\data\\Students.txt"));

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

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }

    // have a print array to fill metho, does not apped but overwrites
    public void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index) {
        size++;
        for (int i = size - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public void printArrayToFile(Student [] arr) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\2021PAT\\PATgrade11\\data\\Students.txt"));
            for (int i = 0; i < size; i++) {
                pw.println(arr[i].fileFormat());
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }

    public void deleteStudent(String name, int grade) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].compareTo(name) == 0) {
                index = i;
            }

            if (index >= 0) {
                this.shiftLeft(index);
            }
        }
        this.printArrayToFile(arr);
        
    }

    public void addStudent(String name, int grade) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i].compareTo(name) > 0) {
                index = i;
                break;
            }
        }
        this.shiftRight(index);
        arr[index] = new Student(name, grade);

    }

    public Object[][] getStudentTableData() {
        Object[][] data = new Object[size][2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                data[i][j] = arr[i]; 

            }
        }
        return data; 

    }
}
