/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class GradesArray {

    private String[] arr = new String[200];
    private int size;

    public GradesArray() {
        try {
            Scanner sc = new Scanner(new File("data\\Grades.txt"));

            while (sc.hasNext()) {

                String grade = sc.next();

                arr[size] = grade;
                size++;

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Students file not found");

        }
    }

    public String[] getArr() {
        return arr;
    }

}
