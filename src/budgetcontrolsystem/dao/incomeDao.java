/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetcontrolsystem.dao;

import budgetcontrolsystem.dbutil.DBConnection;
import budgetcontrolsystem.pojo.incomePojo;
import budgetcontrolsystem.pojo.userProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aashi
 */
public class incomeDao {
     public static boolean addIncome(incomePojo income) throws SQLException{
        String qry = "insert into add_income values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, income.getUsername());
            ps.setString(2, income.getDate());
            ps.setDouble(3, income.getAmount());
            ps.setString(4, income.getCategories());
            ps.setString(5, income.getComment());
            ps.setString(6, income.getIncome());
            int status = ps.executeUpdate();
      
        return status==1;
    }
     public static double getTotalIncome() throws SQLException{
        String qry = "select amount from add_income where username = ?";
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
