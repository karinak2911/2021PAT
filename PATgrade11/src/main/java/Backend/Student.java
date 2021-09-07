/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Navi
 */
public class Student {
    
    private String name; 
    private int grade; 

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public int compareTo(Student s){ 
        return this.grade - s.getGrade(); 
    }
    
            public String fileFormat(){ 
           return this.name + "£" + this.grade; 
        }
            
            public int compareTo(String name){ 
                return this.name.compareToIgnoreCase(name); 
            }
    
    
    
}
