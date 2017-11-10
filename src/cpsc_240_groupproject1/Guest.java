package cpsc_240_groupproject1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ogdvenstroodle
 */
public class Guest extends User {
    
    String phoneNumber;
    
    public Guest(){
        super(null,0);
        phoneNumber = null;
    }
    public Guest(String eMail, int ccNum, String uPhone){
        super(eMail, ccNum);
        phoneNumber = uPhone;
    }
    
}
