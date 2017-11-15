/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc_240_groupproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KNK
 * @version 11/15/17 
 */
public class Option {
    String menuSelection;
    ArrayList <Reservation> reservationsAL;
    Scanner in = new Scanner(System.in); 
    
    public Option(String menuSelection, ArrayList reservationsAL){
        this.menuSelection = menuSelection;
        this.reservationsAL = reservationsAL;
               
        if(menuSelection.equals("B")){
            optionB();
        }
        if(menuSelection.equals("X")){
            optionX();
        }
        if(menuSelection.equals("U")){
            optionU();
        }
        if(menuSelection.equals("D")){
            optionD();
        }    
        if(menuSelection.equals("V")){
            optionV(reservationsAL);
        }
        if(menuSelection.equals("R")){
            optionR();
        }
        if(menuSelection.equals("L")){
            optionL();
        }
        if(menuSelection.equals("P")){
            optionP();
        }
        if(menuSelection.equals("C")){
            optionC();
        }
        if(menuSelection.equals("M")){
            optionM();
        }
        if(menuSelection.equals("F")){
            optionF();
        }
        if(menuSelection.equals("H")){
            optionH();
        }
        if(menuSelection.equals("S")){
            optionS();
        }
    }
    
    
    /**
    * Option B - Block a user. -- THIS ONE MIGHT BE TRICKY TO CODE!
    */
    public void optionB(){
        
    }
    
    /**
     * Option X - Set price.
     */
    public void optionX(){
        
    }
    
    /**
     * Option U - Upgrade membership status.
     */
    public void optionU(){
        
    }
    
    /**
     * Option D - Delete user account. 
     */
    public void optionD(){
        
    }
             
    /**
    * Option V - View public schedule as guest.
    */
    public void optionV(ArrayList <Reservation> reservationsAL){
        
        this.reservationsAL = reservationsAL;
        
        System.out.println("Please type the calendar day you "
                + "would like to view using the following format:"
                + "MM.DD.YYYY ");
        
        String date = in.nextLine();
        System.out.println("Rooms reserved on" + date + ":");
        for(int i = 0; i < reservationsAL.size(); i++){
            if(reservationsAL.get(i).getDate().equals(date)){
                //System.out.println(Reservation.getReservationInformation());
            }
        }
    }
    
    /**
     * Option R - Register an account.
     */
    public void optionR(){
         Registered newRegistered = new Registered();
        
    }
    
    /**
     * Option L - Look for a room (must be a registered user).
     */
    public void optionL(){
        
    }
    
    /**
     * Option P - Pay for a room.
     */
    public void optionP(){
        
    }
    
    /**
     * Option C - Check for approved reservation.
     */
    public void optionC(){
    
    }
    
    /**
     * Cancel/Modify a reservation").
     */    
    public void optionM(){
        
    }
    
    /**
     * Option F - Leave feedback
     */
    public void optionF(){
        
    }
    
    /**
     * Option H – Rate the hotel.
     */
    public void optionH(){
        
    }
    
    /**
     * Option S – Check membership status.
     */
    public void optionS(){
        
    }
}
