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

    int roomNum;
    int capacity;
    boolean smoking;
    boolean reserved;
    boolean handicapAccess;
    double roomPrice;
    String roomType;

    public Room()
    {        
        roomNum = 0;
        capacity = 0;
        smoking = false;
        reserved = false;
        handicapAccess = false;
        roomPrice = 3.50;
        roomType = null;

    }
    
    public Room(int roomNumber, int roomCapacity, boolean smoke, boolean reserve, boolean access, double price, String type  )
    {
        roomNum = roomNumber;
        capacity = roomCapacity;
        smoking = smoke;
        reserved = reserve;
        handicapAccess = access;
        roomPrice = price;
        roomType = type;
    }
    /**
     * @return 
     */
    public int getRoomNum()
    {
     return roomNum;   
    }
    public int getCapacity()
    {
        return capacity;
    }
    public boolean getSmoking()
    {
        return smoking;
    }
    public boolean getReserved()
    {
        return reserved;
    }
    public boolean getHandicapAccess()
    {
        return handicapAccess;
    }
    public double getRoomPrice()
    {
        return roomPrice;
    }
    public String getRoomType()
    {
        return roomType;
    }
    /**
     * Here are the setters!!!!
     */
    
    /**
     * @param roomNumber 
     */
    public void setRoomNum(int roomNumber)
    {
        roomNumber = roomNum;
    }
    
    //not sure i need a setter for capacity...
    public void setCapacity(int roomCapacity)
    {
        roomCapacity = capacity;
    }
    /**
     * 
     * @param smoke 
     */
    public void setSmoking(boolean smoke)
    {
        smoke = smoking;
    }
    /**
     * 
     * @param reserve 
     */
    public void setReserved(boolean reserve)
    {
        reserve = reserved;
    }
        
    //not sure i need a setter for handicapAccess...
    public void setHandicapAccess(boolean access)
    {
        access = handicapAccess;
    }
    /**
     * 
     * @param price 
     */
    public void setRoomPrice(double price)
    {
        price = roomPrice;
    }
    public void setRoomType(String type)
    {
        type = roomType;
    }
    

}

    

    
    


    
    

 