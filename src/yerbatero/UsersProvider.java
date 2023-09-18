/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yerbatero;

/**
 *
 * @author Usuario
 */
public class UsersProvider {
    private String[] adminUserNames = {"HieloElemental", "Bywar"};
    private String[] adminPasswords = {"llelo1234", "lasbolasdecristo"};
    
    public boolean validateuser(String userName, String userPassword){
        boolean response = false;
        for(int i = 0; i < adminUserNames.length; i++){
            if(adminUserNames[i].equals(userName) && adminPasswords[i].equals(userPassword)){
                response = true;
            }
        }
        return response;
    }
}
