/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetcontrolsystem.dao;

import budgetcontrolsystem.dbutil.DBConnection;
import budgetcontrolsystem.pojo.spendingLimitPojo;
import budgetcontrolsystem.pojo.userProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aashi
 */
public class spendingLimitDao {
    public static boolean addSpendingLimit(spendingLimitPojo spending) throws SQLException{
        String qry = "insert into spending_limit values(?,?)";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, spending.getUsername());
            ps.setDouble(2, spending.getSpendinglimit());
            int status = ps.executeUpdate();
      
        return status==1;
    }
     public static double getSpendingLimit() throws SQLException{
        String qry = "select spending_limit from spending_limit where username = ?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1,userProfile.getUsername());
        ResultSet rs = ps.executeQuery();
        double spendinglimit = 0;
        while(rs.next()){
            spendinglimit = rs.getDouble(1);
        }
        return spendinglimit;
     } 
     
     public static void upadateSpendingLimit(double spendinglimit, String username) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement sp = conn.prepareStatement("update spending_limit set spending_limit=? where username=? ");
        sp.setDouble(1, spendinglimit);
        sp.setString(2,userProfile.getUsername());
        sp.executeUpdate();
     }
    
}
