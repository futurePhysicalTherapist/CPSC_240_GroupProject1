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

String roomNumber;
String name;
String time;
String date;
String roomReservationInformation;
    
    
    
    public Reservation(String reservationInfo)
    {    
       
        String [] separatedReservationInfo = reservationInfo.split(",");
           
        roomNumber = separatedReservationInfo[0];  
        date = separatedReservationInfo[1];
        time = separatedReservationInfo[2];
        name = separatedReservationInfo[3];
    }
    
    public String getRoomNumber(){
        return roomNumber;
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
    
    /*
    public String getReservationInformation(){
        roomReservationInformation = roomNumber + " " + date + " " + time + " " + name;
        return roomReservationInformation;
    }
    */
}
