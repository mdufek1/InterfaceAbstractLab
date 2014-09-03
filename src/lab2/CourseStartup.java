/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import lab1.AdvancedJavaCourse;
import lab1.IntroJavaCourse;
import lab1.IntroToProgrammingCourse;
import lab1.ProgrammingCourse;



/**
 *
 * @author Mike
 */
public class CourseStartup {
    public static void main(String[] args) {
        
        AdvancedJavaCourse java2 = new AdvancedJavaCourse("Advanced Java", "2031-2495");
        IntroJavaCourse java1 = new IntroJavaCourse("Intro to Java", "4568-1564");
        
        //The interface in this case wasn't as useful as the abstract class was, however, perhaps if I coupled the interface with an abstract class, there
        //would be much more code re-use. I'm also not sure how the substitution principal would work here, since every class just implements the interface.
        ProgrammingCourse introProgramming = new IntroToProgrammingCourse("Intro to Programming", "1324-4658");
        
        java2.setPrerequisites("Intro to Java");
        java2.setCredits(3);
        System.out.println("Course Name: "+java2.getCourseName());
        System.out.println("Course Number: "+java2.getCourseNumber());
        System.out.println("Course Credits: "+java2.getCredits());
        System.out.println("Course Prerequisites: "+java2.getPrerequisites()+"\n");
        
        java1.setPrerequisites("Intro to Programming");
        java1.setCredits(2);
        System.out.println("Course Name: "+java1.getCourseName());
        System.out.println("Course Number: "+java1.getCourseNumber());
        System.out.println("Course Credits: "+java1.getCredits());        
        System.out.println("Course Prerequisites: "+java1.getPrerequisites()+"\n");
        
        
        introProgramming.setCredits(1);
        System.out.println("Course Name: "+introProgramming.getCourseName());
        System.out.println("Course Numbers: "+introProgramming.getCourseNumber());
        System.out.println("Course Credits: "+introProgramming.getCredits());        

        
    }
  
}
