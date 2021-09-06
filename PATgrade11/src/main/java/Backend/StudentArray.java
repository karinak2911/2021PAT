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
    Student [] arr = new Student[200];
    private int size; 
    
    
        public StudentArray() {
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
       
        
        
    
    public void sort(){ 
         for (int i = 0 ; i < size - 1; i++){ 
            for(int j = i + 1; j < size; j++){ 
                if(arr[i].compareTo(arr[j])> 0){ 
                    Student temp = arr [j]; 
                    arr [j] = arr [i]; 
                    arr [i] = temp; 
                }
            }
        }
            
        }
    
    public void addStudent(String name, int grade) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\2021PAT\\PATgrade11\\data\\Students.txt", true));
			pw.println(name + "@" + grade);
			pw.close();
		} catch (IOException ex) {
			System.out.println("Could not write to file");
		}
	}// have a print array to fill metho, does not apped but overwrites 
    
    public void printArray

	public void deleteStudent(String name, int grade) {
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\2021PAT\\PATgrade11\\data\\Students.txt"));
			String output = "";
			String details = name + "@" + grade;

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(details)) {
					output += line + "\n";
				}
			}
			sc.close();

			PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\2021PAT\\PATgrade11\\data\\Students.txt", false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
	}
        
        
        public Object [][] getStudentTableData(){ 
            Object[][] data = new Object[size][2]; 
            
        }
}
