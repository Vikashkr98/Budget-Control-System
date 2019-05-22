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
public class spendingLimitPojo {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getSpendinglimit() {
        return spendinglimit;
    }

    public void setSpendinglimit(double spendinglimit) {
        this.spendinglimit = spendinglimit;
    }

    public spendingLimitPojo() {
    }

    public spendingLimitPojo(String username, double spendinglimit) {
        this.username = username;
        this.spendinglimit = spendinglimit;
    }
    private String username;
    private double spendinglimit;
    
    
    
}
