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
public class User {
    String eMail;
    int creditCardNumber;
    
    public User(){
        eMail = null;
        creditCardNumber = 0;
    }
    
    public User(String uEMail, int uCCNum){
        eMail = uEMail;
        creditCardNumber = uCCNum;
    }
    
    public void setEmail(String eMail) {
        this.eMail = eMail;
    }
    
    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    public String getEmail() {
        return eMail;
    }
    
    public int getCreditCardNumber() {
        return creditCardNumber;
    }
}
