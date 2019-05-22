/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetcontrolsystem.dao;

import budgetcontrolsystem.dbutil.DBConnection;
import budgetcontrolsystem.pojo.reportPojo;
import budgetcontrolsystem.pojo.userProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aashi
 */
public class reportDao {
    public static boolean addReport(reportPojo in) throws SQLException{
        String qry = "insert into report values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, in.getUsername());
            ps.setString(2, in.getDate());
            ps.setDouble(3, in.getAmount());
            ps.setString(4, in.getCategories());
            ps.setString(5, in.getComment());
            ps.setString(6, in.getBtype());
            int status = ps.executeUpdate();
      
        return status == 1;
    }
    public static ArrayList<reportPojo> getAllData() throws SQLException{
       String qry = "select * from report where username=?";
       ArrayList <reportPojo> reportList = new ArrayList <reportPojo>();
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement(qry);
       ps.setString(1, userProfile.getUsername());
       ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            String username = rs.getString("username");
            String date = rs.getString("date");
            double amount =rs.getDouble("amount");
            String category = rs.getString("categories");
            String comment = rs.getString("comment");
            String budtype = rs.getString("btype");
            reportPojo p = new reportPojo(username,date,amount,category,comment,budtype);
            reportList.add(p);
        }
        return reportList;
    }
    
    public static ArrayList<reportPojo> getAllDataByYear() throws SQLException{
       String qry = "select * from report where username=?";
       ArrayList <reportPojo> reportList = new ArrayList <reportPojo>();
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement(qry);
       ps.setString(1, userProfile.getUsername());
       ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            String username = rs.getString("username");
            String date = rs.getString("Date");
            //Date d = Date.getInstance();
            //int year = date.get(Calendar.YEAR);
            //int year = date.getYear();
            //String date = rs.getString("date");
            //int Datee = calendar.get(Calendar.YEAR);
            double amount =rs.getDouble("amount");
            String category = rs.getString("categories");
            String comment = rs.getString("comment");
            String budtype = rs.getString("btype");
            reportPojo p = new reportPojo(username,date,amount,category,comment,budtype);
            reportList.add(p);
        }
        return reportList;
    }
    
}
