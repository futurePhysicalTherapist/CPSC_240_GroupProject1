/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc_240_groupproject1;

/**
 * Import statements.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.ArrayList;


/**
 *
 * @author KNK
 */
public class CPSC_240_GroupProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        /**
         * Welcome the user to the program.
         */

        System.out.println(" ");
        System.out.println("Welcome to the WannaStay Reservation Managment System.");
        System.out.println(" ");
        
       
        Hotel newHotel = new Hotel();
        
        Room newRoom = new Room();
        
        User newUser = new User();
        
        
        /**
         * Create Scanner object in & reservationAL ArrayList.
         */
        Scanner in = new Scanner(System.in); 
        ArrayList <Reservation> reservationsAL = new ArrayList<>();
        
        
        /**
         * Automatically read from inventory.txt file.
         */
         String fileName = "reservations.txt"; 
         
                 
        /**
         * If file is found, make reservation objects & add reservations to reservationAL.
         */
        
        //https://www.ics.uci.edu/~irani/s11_22/CodeExamples/FileReaderExceptionsDemoWithComments.java
        //https://www.cs.cmu.edu/~mrmiller/15-121/Lectures/30-files-sets/30-files-exceptions-4.pdf
        
        try{ 
           Scanner fileIn = new Scanner(new File(fileName));
           if(fileName != null){ 
            //System.out.println("File is not null");
            while(fileIn.hasNextLine()){
                //System.out.println("Reading stuff in");
                String reservationInfo = fileIn.nextLine();
                Reservation newReservation = new Reservation(reservationInfo);
                reservationsAL.add(newReservation);
            } 
            System.out.println("The reservation info in the file reservations.text has been successfully imported!\n");
        }
        
        /**
         * If file is not found, notify user.
         */   
        }
        catch(FileNotFoundException ex){
            System.out.println("This filename does not exist\n");
            fileName = null;
        } 
        
        /**
         * Catch block for any other error encountered.
         * Comment out this section when you want to see the specific error message
         */
        catch(Exception e){
            System.out.println("Some other error occured\n");
            fileName = null;
        } 
        
        boolean answerIsNotQ = true;
        
        while (answerIsNotQ == true){
            
            
            System.out.println("Are you a hotel manager? Please enter YES OR NO.");
            String answer = in.nextLine();
            
            /**
             * Code dealing with hotel managers.
             */
            if(answer.equals("YES")){
                System.out.println("Please enter your username:");
                String username = in.nextLine();
                System.out.println("Please enter your password:");
                String password = in.nextLine();
                
                 /**
                * Lists menu options & reads selection.
                */
                System.out.println(" ");
                System.out.println("Please select an option from the following menu & "
                        + "type the letter below\n");
                System.out.println("A: Approve reservation");
                System.out.println("B: Block user");
                System.out.println("S: Set price");
                System.out.println("U: Upgrade membership status");
                System.out.println("D: Delete user account");
                System.out.println("Q: Quit the system\n\n");
            }
            
            
            /**
             * Code dealing with registered and non-registered users. 
             */
            else {
                 System.out.println("Please enter your username:");
                 String username = in.nextLine();
                 System.out.println("Please enter your password:");
                 String password = in.nextLine();
          
                
                /**
                * Lists menu options & reads selection.
                */
                System.out.println(" ");
                System.out.println("Please select an option from the following menu & "
                        + "type the letter below\n");

                System.out.println("V: View public schedule as guest");
                System.out.println("R: Register an account");
                System.out.println("L: Look for a room (must be a registered user)");
                System.out.println("P: Pay for a room");
                System.out.println("C: Check for approved reservation.");
                System.out.println("M: Cancel/Modify a reservation");
                System.out.println("F: Leave feedback");
                System.out.println("R: Rate the hotel");
                System.out.println("S: Check membership status.");
                System.out.println("Q: Quit the system\n\n");
            }
            

            String menuSelection = in.nextLine();

            if(menuSelection != "Q"){
                Option selectedOption = new Option(menuSelection, 
                        reservationsAL);  
            }

            if(menuSelection.equals("Q")){
                answerIsNotQ = false;
                System.out.println(" ");
                System.out.println("You have quit the program. "
                + "Your reservation records have been saved.\n");
        
                try {
                   //https://stackoverflow.com/questions/6994518/how-to-delete-the-content-of-text-file-without-deleting-itself
                   PrintWriter file = new PrintWriter("reservations.txt\n");
                   file.print("");

                   for(int i = 0; i < reservationsAL.size(); i++){
                      file.println(
                              reservationsAL.get(i).getDate() + "," +
                              reservationsAL.get(i).getTime() + "," +
                              reservationsAL.get(i).getName());
                   }

                   file.close();

               } catch (FileNotFoundException e) {
                   System.out.println("Error, could not open reservations.txt");
               }
            }
        } 
    }            
}

