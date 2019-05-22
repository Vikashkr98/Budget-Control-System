/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetcontrolsystem.dao;

import budgetcontrolsystem.dbutil.DBConnection;
import budgetcontrolsystem.pojo.userPojo;
import budgetcontrolsystem.pojo.userProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aashi
 */
public class userDao {
    public static boolean validateUser(userPojo user) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from user where username = ? and  password = ?");
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getPassword());
        ResultSet rs = ps.executeQuery();
        return rs.next();  
    }
    public static boolean addUser(userPojo user) throws SQLException{
        boolean status = true;
        String qry = "select * from user where username=?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, user.getUsername());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            status = false;
        }
        else{
            qry = "insert into user values(?,?)";
            ps = conn.prepareStatement(qry);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();
        }
        return status;
    }
    public static boolean changePassword(String username,String password)throws SQLException{
        String qry="Update user set password = ? where username = ?";
        boolean status=true;
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,password);
        ps.setString(2,userProfile.getUsername());
        int ans=ps.executeUpdate();
        if(ans==0)
               status=false;
     return status;
     }
}
