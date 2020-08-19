/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

/**
 *
 * @author pjmbt
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student(12345 , "prae", "pornpailin");
        System.out.println(student1.getId() +" "+ student1.getName() +" "+student1.getLastname());
    }
    
}
