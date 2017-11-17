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
public class Registered extends User{
    
    String firstName;
    String lastName;
    String accountNum;
    String password;
    String memberStatus;
    
    public Registered(){
        super(null, 0);
        firstName = null;
        lastName = null;
        accountNum = null;
        password = null;
        memberStatus = null;
    }
    
    public Registered(String eMail, int ccNum, String fName, String lName, 
            String accNum, String pass, String memStat){
        
        super(eMail,ccNum);
        firstName = fName;
        lastName = lName;
        accountNum = accNum;
        password = pass;
        memberStatus = memStat;
    }
    
    public String getFirstName(){ return firstName; }
    public void setFirstName(String fName){ firstName = fName; }
    
    public String getLastName(){ return lastName; }
    public void setLastName(String lName){ lastName = lName; }
    
    public String getAccountNum(){ return accountNum; }
    public void setAccountNum(String accNum){ accountNum = accNum; }
    
    public String getPassword(){ return password; }
    public void setPassword(String pass){ password = pass; }
    
    public String getMemberStatus(){ return memberStatus; }
    public void setMemberStatus(String memStat){ memberStatus = memStat; }
    
}
