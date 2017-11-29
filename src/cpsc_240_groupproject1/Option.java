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
public class Option
{
    String menuSelection;
    ArrayList <Reservation> reservationsAL = new ArrayList<>();
    ArrayList <Guest> guestList = new ArrayList<>();
    ArrayList <Registered> regList = new ArrayList<>();
    ArrayList <Manager> managerList = new ArrayList<>();
    Scanner in = new Scanner(System.in); 
    
    public Option(String menuSelection, ArrayList reservationsAL)
    {
        this.menuSelection = menuSelection;
        this.reservationsAL = reservationsAL;
               
        /*
        if(menuSelection.equals("B")){
            optionB();
        }
        if(menuSelection.equals("X")){
            optionX();
        }
        if(menuSelection.equals("U")){
            optionU();
        }
        /*
        
        */
      
        if(menuSelection.equals("D"))
        {
            optionD();
        }    
        if(menuSelection.equals("V"))
        {
            optionV(reservationsAL);
        }
        if(menuSelection.equals("R"))
        {
            optionR();
        }
        if(menuSelection.equals("L"))
        {
            optionL();
        }
        
        /*
        if(menuSelection.equals("P")){
            optionP();
        }
        if(menuSelection.equals("C")){
            optionC();
        }
        */
        
        if(menuSelection.equals("M"))
        {
            optionM();
        }
        
        /*
        if(menuSelection.equals("F")){
            optionF();
        }
        if(menuSelection.equals("H")){
            optionH();
        }
        if(menuSelection.equals("S")){
            optionS();
        }
        */
    }
    
    
    /**
    * Option B - Block a user.
    */
    //public void optionB(){
        
    //}
    
    
    /**
     * Option X - Set price.
     */
    //public void optionX(){
        
    
    
    /*
    /**
     * Option U - Upgrade membership status.
     */
    /*
    public void optionU(){
        
    }
    */
    
    /**
     * Option D - Delete user account. - CHASE
     */
    public void optionD()
    {
        
    }
             
    /**
    * Option V - View public schedule as guest -- KATE.
    */
    public void optionV(ArrayList <Reservation> reservationsAL)
    {
        
        this.reservationsAL = reservationsAL;
        
        System.out.println("Please type the calendar day you "
                + "would like to view using the following format: "
                + "MM/DD/YYYY\n\n");
        
        String date = in.nextLine();
        
        boolean reservationsExist = false;
                
        for(int i = 0; i < reservationsAL.size(); i++)
        {
            if(reservationsAL.get(i).getDate().equals(date))
            {
                reservationsExist = true;
                //System.out.println(Reservation.getReservationInformation());
                System.out.println(
                reservationsAL.get(i).getRoomNumber() + "\t" +
                reservationsAL.get(i).getDate() + "\t" +
                reservationsAL.get(i).getTime() + "\t" +
                reservationsAL.get(i).getName() + "\n\n"); 
            }
        }
        
        if(reservationsExist = false)
        {
            System.out.println("There are no reservations on this date.");
        }
    }
    
    /**
     * Option R - Register an account.
     */
    public void optionR()
    {
         Registered newRegistered = new Registered();
         Scanner acctNum = new Scanner(System.in);
         System.out.println("Enter a unique six digit account number: ");
         String acctNum1 = acctNum.next();
         newRegistered.setAccountNum(acctNum1);
         acctNum1 = acctNum1.replaceAll("[^A-Z]","");
         System.out.println(acctNum1);
         //user search method to check for acct number in arrayList
         //if acct number has been taken, print out an error
         
         System.out.println("Enter a unique eight character password: ");
         Scanner passWord = new Scanner(System.in);
    }
    
    /**
     * Option L - Look for a room/and or reserve a room (must be a registered user). - SIERRA
     */
    public void optionL()
    {
        System.out.println("Enter your account number: ");
        Scanner acctNum = new Scanner(System.in); 
        //check for acctNum in Registered arraylist
        
        
        System.out.println("Enter your password: ");
        Scanner passWord = new Scanner(System.in); 
        //check for passWord in Registered arraylist
        
        System.out.println("Would you like to reserve a room");
    }
    
    
    /**
     * Option P - Pay for a room.
     */
    //public void optionP(){
        
    //}
    
    /**
     * Option C - Check for approved reservation.
     */
    //public void optionC(){
    
    //}
    
    
    /**
     * Option M - Cancel/Modify a reservation. 
     */    
    public void optionM()
    {
        
    }
    
    /**
     * Option F - Leave feedback.
     */
    //public void optionF(){
        
    //}
    
    /**
     * Option H – Rate the hotel.
     */
    //public void optionH(){
        
    //}
    
    /**
     * Option S – Check membership status.
     */
    //public void optionS(){
        
    //}
}
