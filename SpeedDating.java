/**
 *I affirm that this program is entirely my own work and 
 * none of it is the work of any other person.
 * @author Gabriel Llanes
 * Instructor: Caryl Rahn 
 * COP 2210 U02 Thursday 11:00 a.m. lab
 */
/**
 * A class to give students experience using loops.  This class
 * creates and manipulates objects of Greg's Date class.
 */
 public class SpeedDating
 {
    // Note: this class has no instance variables!
 	
    /**
     * Create an empty SpeedDating object
     */
     
     public SpeedDating()
     {}	   // Constructor has empty body
           // (this is known as a "default" constructor)
 	
    /**
     * Computes and prints the day of the week on which the user's birthday
     * will fall for each year from 2015 to 2025 inclusive
     * @param theMonth the month of the birthday
     * @param theDay the day of the birthday
     */
     public void happyBirthDaze(int theMonth, int theDay)
     {
         int year = 2015;
         
         Date d = new Date(theMonth, theDay, year);
         
         for(int i = 0; i < 10; i++){
          d = new Date(theMonth, theDay, year);

          System.out.println(d.getDayOfWeek());
         year++;
             
         }
     }
 	
    /**
     * Computes and returns the Date on which Election Day will fall 
     * in the USA for a given year.
     *
     * NOTE: By law, Election  Day is the first Tuesday after the first
     * Monday in November.
     *
     * @param year the year for which to compute the date of Election Day
     * @return the Date of Election Day for the specified year
     */
    public Date pollDancer(int year)
     {
        Date d = new Date(11, 1, year);
        
        if(d.getDayOfWeek() == "Tuesday"){
            d.next();
        }
        
        while(d.getDayOfWeek() != "Tuesday"){
            d.next();
        }
        return d;
     }

 	 	
     /**
      * Computes and returns the corrected "Excel Date" for a given Date.
      * I.e., the number of the given Date where 1/1/1900 is date #1
      * 
      * @param aDate the Date for which to return the Excel Date
      * @return the Excel Date of aDate 
      */
      public int iExcel(Date aDate) 
      {
          
        Date excelDate = new Date(1, 1, 1900);  
        int iDate = 0;
        
        while(!aDate.equals(excelDate)){
            excelDate.next();
            iDate++;
        }
         return iDate;
      }
 }