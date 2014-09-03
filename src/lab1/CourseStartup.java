/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;



/**
 *
 * @author Mike
 */
public class CourseStartup {
    public static void main(String[] args) {
        
        AdvancedJavaCourse java2 = new AdvancedJavaCourse("Advanced Java", "2031-2495");
        IntroJavaCourse java1 = new IntroJavaCourse("Intro to Java", "4568-1564");
        
        //I used the Liskov Substitution principle here, In this particular case I don't see it being very versitile, however if we were
        //to create an array of all the courses it would be very usefull then.
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
