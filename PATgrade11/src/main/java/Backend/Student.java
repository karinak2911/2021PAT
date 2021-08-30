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

    public Student(String name, int age) {
        this.name = name;
        this.grade = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return grade;
    }

    public void setAge(int age) {
        this.grade = age;
    }
    
    
    
}
