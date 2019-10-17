/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan33.login;

import java.util.Scanner;

/**
 *
 * @author Iqbal
 * Iqbal Argiansyah
 * 10118061
 * IF2
 * Login
 */
public class PBOIF210118061Latihan33Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);  

      String username;
      String password;


      System.out.println("Selamat datang di program login");
      System.out.println("\nMasukan username dan password kamu dengan benar");    

      System.out.println("Username: ");
        username = input.nextLine();

      System.out.println("Password: ");
        password = input.nextLine();

        UserAccount login = new UserAccount(username, password);

        if(login.checkPassword())
            System.out.println("Selamat datang");
        else
            System.out.println("Username dan password yang kamu masukan salah");
    }
    
}
