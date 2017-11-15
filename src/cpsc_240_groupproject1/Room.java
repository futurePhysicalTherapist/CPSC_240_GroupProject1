/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc_240_groupproject1;

//import java.util.ArrayList;


/**
 *
 * @author KNK
 */
public class Room 
{
    String floor; // Basement, first, second, third
    int roomNumber;
    boolean isAvailable;

    public Room()
    {        
        floor = null;
        roomNumber = 0;
        isAvailable = false;  
    }
    
    public Room(boolean avail, int roomNum, String floorName)
    {
        isAvailable = avail;
        roomNumber = roomNum;
        floor = floorName;
    }
    
    /**
     * Have my getters
     * @return 
     */
     public boolean getIsAvailable()
    { 
        return isAvailable; 
    }
    
    public int getRoomNumber()
    { 
        return roomNumber; 
    }
    
    public String getFloor()
    {
        return floor;
    }
    
    /**
     * Have my setters
     * @param avail 
     */
     public void setIsAvailable(boolean avail)
     {
         isAvailable = avail;
     }
     
     public void setRoomNumber(int roomNum)
     {
         roomNumber = roomNum;
     }
     
     public void setFloor(String floorName)
     {
         floor = floorName;
     }
    
    

    
    //public void addRoom()
    //{
        //room.add(addRoom);
    //}
    
    //public void setRoom()
    
    
}
