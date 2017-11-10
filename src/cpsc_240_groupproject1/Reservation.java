/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc_240_groupproject1;

import java.time.LocalTime;

/**
 *
 * @author KNK
 */
public class Reservation {

String name;
LocalTime time;
String date;
    
    
    
    public Reservation(String reservationInfo)
    {    
        
    }
    
    public String getDate()
    {
        return date;
    }
    
    public String getName()
    {
        return name;
    }
    
    public LocalTime getTime()
    {
        return time;
    }  
}
