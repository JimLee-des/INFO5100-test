/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccount(String username, String password, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccount(String name, String username, String password, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void deleteUserAccount(UserAccount user){
        for(int i=0; i<userAccountList.size(); i++){
            if(userAccountList.get(i).getName()==null){
                continue;
            }else if(userAccountList.get(i).getName().equals(user.getName())){
                userAccountList.remove(i);
            }
        }
    }
    
    public void updateUserAccount(UserAccount user,String username, String password){
        for(int i=0; i<userAccountList.size(); i++){
            if(userAccountList.get(i).getName()==null){
                continue;
            }else if(userAccountList.get(i).getName().equals(user.getName())){
                userAccountList.get(i).setUsername(username);
                userAccountList.get(i).setPassword(password);
            }
        }
    }
    
    public void updateUserAccount(String name, UserAccount user,String username, String password){
        for(int i=0; i<userAccountList.size(); i++){
            if(userAccountList.get(i).getName()==null){
                continue;
            }else if(userAccountList.get(i).getName().equals(user.getName())){
                userAccountList.get(i).setName(name);
                userAccountList.get(i).setUsername(username);
                userAccountList.get(i).setPassword(password);
            }
        }
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
