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
public class Guest extends User
{
    
    String phoneNum;
    
    public Guest()
    {
        super(null, 0);
        phoneNum = null;
    }
    
    public Guest(String email, int ccNum, String pNum)
    {
        super(email,ccNum);
        phoneNum = pNum;
    }
    
    public void setPhoneNum(String pNum)
    { 
        phoneNum = pNum; 
    }
    
    public String getPhoneNum()
    { 
        return phoneNum; 
    }
}
