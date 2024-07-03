/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import javax.swing.JOptionPane;


public class AccountsList {

   public Accounts[] ac;
    public int pointer = 0;
    public int max;
    public Accounts temp;
    
    public AccountsList(int max){
        this.max = max;
        ac = new Accounts[max];
        create();
    }
    
    public void duplicate(AccountsList al){
        this.ac = al.getAc();
    }
    
    public void create(){
        for(int i = 0; i < ac.length; i++){
            ac[i] = null;
        }
    }
    
    public void addAccount(Accounts a){
        ac[pointer] = a;
        pointer++;
    }
    
    // This method validates login
    public Accounts searchAccount(String email, String password){
        for(int i = 0; i < ac.length; i++){
            if(ac[i].getMail().equals(email)){
                if(ac[i].getPassword().equals(password)){
                    temp = ac[i];
                    System.out.println(temp);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect password");
                }
            } else {
                JOptionPane.showMessageDialog(null, "There is no account associated with that email");
            }  
        }        
        return temp;
    }
    
    public Accounts[] getAc(){
        return ac;
    }
    
    public void setAc(Accounts ac[]){
        this.ac = ac;
    }
    
    public String toString(){
        String result = "List of users\n";
        for(int i = 0; i < pointer; i++){
            result += "" + ac[i] + "\n";
        }
        return result;
    }
}
