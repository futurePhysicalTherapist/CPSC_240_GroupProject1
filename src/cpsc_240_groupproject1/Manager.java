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
public class Manager extends Registered{
    
    String IDNum;
    
    public Manager(){
        super(null,0,null,null,null,null,null);
        IDNum = null;
    }
    public Manager(String eMail,int ccNum,String fName,String lName, String accNum,
            String pass,String memStat,String id){
        super(eMail,ccNum,fName,lName,accNum,pass,memStat);
        IDNum = id;
    }
    
    public String getIDNum(){ return IDNum; }
    public void setIDNum(String id){ IDNum = id; }
}
