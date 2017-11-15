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
    
    public Option(String menuSelection, ArrayList reservationsAL){
        this.menuSelection = menuSelection;
        this.reservationsAL = reservationsAL;
        
       
        System.out.println("A: Approve reservation");
                System.out.println("B: Block user");
                System.out.println("X: Set price");
                System.out.println("U: Upgrade membership status");
                System.out.println("D: Delete user account");
                System.out.println("Q: Quit the system\n\n");
                
             
                System.out.println("V: View public schedule as guest");
                System.out.println("R: Register an account");
                System.out.println("L: Look for a room (must be a registered user)");
                System.out.println("P: Pay for a room");
                System.out.println("C: Check for approved reservation.");
                System.out.println("M: Cancel/Modify a reservation");
                System.out.println("F: Leave feedback");
                System.out.println("H: Rate the hotel");
                System.out.println("S: Check membership status.");
                System.out.println("Q: Quit the system\n\n");
        
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
            optionV();
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
    
 
    public void optionB(){
        
    }
    
    public void optionX(){
        
    }
    
    public void optionU(){
        
    }
    
    public void optionD(){
        
    }
    
    public void optionV(){
        
    }
    
    public void optionR(){
         Registered newRegistered = new Registered();
        
    }
    
    public void optionL(){
        
    }
    
    public void optionP(){
        
    }
    
    public void optionC(){
        
    }
    
    public void optionM(){
        
    }
    
    public void optionF(){
        
    }
    
    public void optionH(){
        
    }
    
    public void optionS(){
        
    }
}
