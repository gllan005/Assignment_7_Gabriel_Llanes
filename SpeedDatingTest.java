/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *I affirm that this program is entirely my own work and 
 * none of it is the work of any other person.
 * @author Gabriel Llanes
 * Instructor: Caryl Rahn 
 * COP 2210 U02 Thursday 11:00 a.m. lab
 */
public class SpeedDatingTest {
    public static void main(String [] args ){
    
    Scanner input = new Scanner(System.in);
    SpeedDating sd = new SpeedDating();
    
    int month, day, year;
    
    
    System.out.println("Enter the month of your birthday: mm ");
    month = input.nextInt();
    System.out.println("Enter the day of your birthday: dd ");
    day = input.nextInt();
    sd.happyBirthDaze(month, day);
    
    System.out.println("Enter a year for the Election day: yyyy ");
    year = input.nextInt();
    System.out.println(sd.pollDancer(2015).getShortDate());
    
    Date aDate = new Date(month, day, year);
    System.out.println("Let's enter a date for Microsoft Excel: ");
    System.out.println("Enter the month: mm");
    month = input.nextInt();
    System.out.println("Enter the day: dd ");
    day = input.nextInt();
    System.out.println("Enter the year: yyyy ");
    year = input.nextInt();
    System.out.println(sd.iExcel(aDate));
    
   
    
    
    
    
    
    
    
    
    
    }
}
