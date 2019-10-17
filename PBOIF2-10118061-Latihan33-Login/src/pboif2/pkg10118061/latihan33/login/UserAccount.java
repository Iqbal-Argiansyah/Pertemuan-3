/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan33.login;

/**
 *
 * @author Iqbal
 */
public class UserAccount {
     private String username;
    private String password;
    private String [][] accounts = {{"iqbal", "10118061"},{"10118061", "iqbal"}};

    public UserAccount(String username, String password) 
    {
        this.username = username;
    this.password = password;
    boolean active;
    }

    public boolean checkPassword()
    {

         return (username.equals(accounts[0][0])) && (password.equals(accounts[0][1]));
    }

    public void deactivateAccount()
    {
        boolean active = false;
    }
}
