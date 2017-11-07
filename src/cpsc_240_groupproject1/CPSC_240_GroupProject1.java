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
         * Create Scanner object in & foodProductsAL ArrayList.
         */
        Scanner in = new Scanner(System.in); 
        ArrayList <FoodProduct> foodProductsAL = new ArrayList<>();
        
        
        /**
         * Automatically read from inventory.txt file.
         */
         String fileName = "inventory.txt"; 
         
                 
        /**
         * If file is found, makefoodProducts & add foodProducts to foodProducts AL.
         */
        
        //https://www.ics.uci.edu/~irani/s11_22/CodeExamples/FileReaderExceptionsDemoWithComments.java
        //https://www.cs.cmu.edu/~mrmiller/15-121/Lectures/30-files-sets/30-files-exceptions-4.pdf
        
        try{ 
           Scanner fileIn = new Scanner(new File(fileName));
           if(fileName != null){ 
            //System.out.println("File is not null");
            while(fileIn.hasNextLine()){
                //System.out.println("Reading stuff in");
                String foodProductInfo = fileIn.nextLine();
                FoodProduct newFoodProduct = new FoodProduct(foodProductInfo);
                foodProductsAL.add(newFoodProduct);
            } 
            System.out.println("The inventory in the file inventory.text has been successfully imported");
            System.out.println(" ");
        }
        
        /**
         * If file is not found, notify user.
         */   
        }
        catch(FileNotFoundException ex){
            System.out.println("This filename does not exist");
            System.out.println(" ");
            fileName = null;
        } 
        
        /**
         * Catch block for any other error encountered.
         * Comment out this section when you want to see the specific error message
         */
        catch(Exception e){
            System.out.println("Some other error occured");
            System.out.println(" ");
            fileName = null;
        } 
        
        boolean answerIsNotQ = true;
        
        while (answerIsNotQ == true){
            
            /**
            * Lists menu options & reads selection.
            */
            System.out.println(" ");
            System.out.println("Please select an option from the following menu & "
                    + "type the letter below");
            System.out.println("U: Upload inventory");
            System.out.println("P: Print the current inventory sorted by product name");
            System.out.println("E: List the current inventory sorted by expiration date");
            System.out.println("S: Search for an item by product name");
            System.out.println("D: Decrement the quantity for an item");
            System.out.println("R: Remove/discontinue an item.");
            System.out.println("Q: Quit the system");
            System.out.println(" ");

            String menuSelection = in.nextLine();

            if(menuSelection != "Q"){
                Option selectedOption = new Option(menuSelection, 
                        foodProductsAL);  
            }

            if(menuSelection.equals("Q")){
                answerIsNotQ = false;
                System.out.println(" ");
                System.out.println("You have quit the program. "
                + "Your current inventory has been saved.");
                System.out.println(" ");
        
                try {
                   //https://stackoverflow.com/questions/6994518/how-to-delete-the-content-of-text-file-without-deleting-itself
                   PrintWriter file = new PrintWriter("inventory.txt");
                   file.print("");

                   for(int i = 0; i < foodProductsAL.size(); i++){
                      file.println(
                              foodProductsAL.get(i).getName() + "," +
                              foodProductsAL.get(i).getUPC() + "," +
                              foodProductsAL.get(i).getQuantity() + "," +
                              foodProductsAL.get(i).getPrice() + "," +
                              foodProductsAL.get(i).getExpirationDate());
                   }

                   file.close();

               } catch (FileNotFoundException e) {
                   System.out.println("Error, could not open inventory.txt");
               }
            }
        }
        
        
        
        
    }            
}

