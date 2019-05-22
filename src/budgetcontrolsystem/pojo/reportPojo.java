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
public class reportPojo {

    public reportPojo(String username) {
        this.username = username;
    }

    public reportPojo(double amount) {
        this.amount = amount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public reportPojo(String username,String date, double amount, String categories, String comment, String btype) {
        this.username = username;
        this.date = date;
        this.amount = amount;
        this.categories = categories;
        this.comment = comment;
        this.btype = btype;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }
    private String username;
    private String date;
    private double amount;
    private String categories;
    private String comment,btype;
    
    
}
