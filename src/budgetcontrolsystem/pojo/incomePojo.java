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
public class incomePojo {

    public incomePojo(String username, double amount) {
        this.username = username;
        this.amount = amount;
    }

    public incomePojo(String username) {
        this.username = username;
    }

    public incomePojo(double amount) {
        this.amount = amount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public incomePojo(String username, String date, double amount, String categories, String comment,String income) {
        this.username = username;
        this.date = date;
        this.amount = amount;
        this.categories = categories;
        this.comment = comment;
        this.income = income;
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
    public String getIncome() {
        return income;
    }

    public void setIncome(String comment) {
        this.income = income;
    }
    private String username;
    private String date;
    private double amount;
    private String categories;
    private String comment,income;
    
}
