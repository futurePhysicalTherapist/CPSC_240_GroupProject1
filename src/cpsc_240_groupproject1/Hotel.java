/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc_240_groupproject1;

/**
 *
 * @author KNK
 */
public class Hotel {
    public String hotelName = "WannaStay";
    public String location;
    public boolean hasPool;
    public boolean hasBreakfast;
    public boolean airportShuttle;
    
    public Hotel(){
        hotelName = null;
        location = null;
        hasPool = false;
        hasBreakfast = false;
        airportShuttle = false;
    }
    
    public Hotel(String hotelLoc, boolean pool, boolean breakfast, boolean shuttle){
        location = hotelLoc;
        hasPool = pool;
        hasBreakfast = breakfast;
        airportShuttle = shuttle;
    }
    
    public String getHotelName()
    { 
        return hotelName; 
    }
    
    public String getLocation()
    { 
        return location; 
    }
    
    public boolean getHasPool()
    { 
        return hasPool; 
    }
    
    public boolean getHasBreakfast()
    { 
        return hasBreakfast; 
    }
    
    public boolean getAirportShuttle()
    { 
        return airportShuttle;
    }
    
    public void setLocation(String hotelLoc)
    { 
        location = hotelLoc; 
    }
    
    public void setHasPool(boolean pool)
    { 
        hasPool = pool; 
    }
    
    public void setHasBreakfast(boolean breakfast)
    { 
        hasBreakfast = breakfast;
    }
    
    public void setAirportShuttle(boolean shuttle)
    { 
        airportShuttle = shuttle; 
    }
    
}
