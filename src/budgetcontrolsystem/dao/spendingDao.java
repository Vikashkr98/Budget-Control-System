/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetcontrolsystem.dao;

import budgetcontrolsystem.dbutil.DBConnection;
import budgetcontrolsystem.pojo.spendingPojo;
import budgetcontrolsystem.pojo.userProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aashi
 */
public class spendingDao {
    public static boolean addSpending(spendingPojo spending) throws SQLException{
        String qry = "insert into add_spending values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, spending.getUsername());
            ps.setString(2, spending.getDate());
            ps.setDouble(3, spending.getAmount());
            ps.setString(4, spending.getCategories());
            ps.setString(5, spending.getComment());
            ps.setString(6, spending.getSpending());
            int status = ps.executeUpdate();
      
        return status==1;
    }
    public static double getTotalSpending() throws SQLException{
        String qry = "select amount from add_spending where username = ?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1,userProfile.getUsername());
        ResultSet rs = ps.executeQuery();
        double total = 0;
        while(rs.next()){
            total = total+rs.getDouble(1);
        }
        return total;
     }
    
}
