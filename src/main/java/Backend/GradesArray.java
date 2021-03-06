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
// this class gets the grades from a text file and puts it into an array 
public class GradesArray {

    private String[] gradesArr = new String[200];
    private int size;

    public GradesArray() {
        try {
            Scanner sc = new Scanner(new File("data\\Grades.txt"));

            while (sc.hasNext()) {

                String grade = sc.next();

                gradesArr[size] = grade;
                size++;

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Grades file not found");

        }
    }

    // the array can be accessed from a combo box 
    public String[] getArr() {
        return gradesArr;
    }

}
