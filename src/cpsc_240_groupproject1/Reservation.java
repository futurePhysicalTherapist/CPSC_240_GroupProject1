/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc_240_groupproject1;

import java.util.ArrayList;

/**
 *
 * @author KNK
 * @version 11/15/17 
 */
public class Reservation {

String name;
String time;
String date;
    
    
    
    public Reservation(String reservationInfo)
    {    
       
        String [] separatedReservationInfo = reservationInfo.split(",");
           
            date = separatedReservationInfo[0];
            time = separatedReservationInfo[1];
            time = separatedReservationInfo[2];
    }
    
    public String getDate()
    {
        return date;
    }
    
    public String getTime()
    {
        return time;
    }  
    
    public String getName()
    {
        return name;
    } 
}
