/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetcontrolsystem.pojo;

/**
 *
 * @author aashi
 */
public class userPojo {

    public userPojo(String username) {
        this.username = username;
    }

    public userPojo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public userPojo() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    private String username;
    private String password;
    
    
}
