package dao;

import dto.Docs;
import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao implements BaseDao<User>
{
    public List<Docs> listDocs(String branch)
    {
        List<Docs> docsList = new ArrayList<Docs>();
        String query = "select user_name,filepath,send_date,faculty "
                + "from user,documents where faculty in "
                + "(select userid from user where type='faculty' "
                + "and branch=?) and user.userid=documents.faculty "
                + "order by send_date DESC";
        
        try
        {
           Connection cnn = DBConnection.getConnection();
           PreparedStatement ps = cnn.prepareStatement(query);
           ps.setString(1, branch);
           ResultSet rs = ps.executeQuery(); 
           while (rs.next()) 
           {                
               String name = rs.getString("user_name");
               String filename = rs.getString("filepath");
               Date date = rs.getDate("send_date");
               int facid = rs.getInt("faculty");
               
               Docs ob = new Docs(facid, name, filename, date);
               docsList.add(ob);
           }
            
        }catch(Exception ex){
            System.out.println("Get Docs : " + ex.getMessage());
        }
        return docsList;
    }
    
    public boolean saveDocument(int facid,String filename)
    {
       try {
            Connection cnn = DBConnection.getConnection();
            
            PreparedStatement ps = cnn.prepareStatement("insert into documents"
                    + "(filepath,faculty) value(?,?)");
            ps.setString(1,filename);
            ps.setInt(2,facid);
            
            int i = ps.executeUpdate();
            cnn.close();
            if(i>0)
                return true;
            else
                return false;
        } catch (Exception ex) 
        {
            System.err.println("File Upload : " + ex.getMessage());
            return false;
        }         
    }
    
    @Override
    public boolean save(User ob) 
    {
        try {
            Connection cnn = DBConnection.getConnection();
            
            PreparedStatement ps = cnn.prepareStatement("insert into user"
                    + "(user_name,email,password,branch,type) value(?,?,?,?,?)");
            ps.setString(1,ob.getUserName());
            ps.setString(2,ob.getEmail());
            ps.setString(3,ob.getPassword());
            ps.setString(4,ob.getBranch());
            ps.setString(5,ob.getType());
            
            int i = ps.executeUpdate();
            cnn.close();
            if(i>0)
                return true;
            else
                return false;
        } catch (Exception ex) 
        {
            System.err.println("Register User : " + ex.getMessage());
            return false;
        }        
    }

    @Override
    public boolean update(User ob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User getUser(String email, String pass) 
    {
        try
        {  
            Connection cnn = DBConnection.getConnection();
            PreparedStatement ps  = cnn.prepareStatement("select userid,user_name,email,branch,type,isverify from user "
                    + "where email=? and password=?");
            ps.setString(1,email);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            
            
            if(rs.next())
            {
                int userid = rs.getInt("userid");
                String name = rs.getString("user_name");
                String useremail = rs.getString("email");
                String branch = rs.getString("branch");
                String type = rs.getString("type");
                boolean isverify = rs.getBoolean("isverify");
                
                User user = new User(userid, name, email, branch, type);
                user.setVerifyStatus(isverify);
                return user;                
            }else{
                return null;
            }
            
        }catch(Exception ex){
            System.err.println("Login User : " + ex.getMessage());
            return null;
        }
    }
    
    
    
    
    public ArrayList<User> listStudents(String branch)
    {
        ArrayList<User> list = new ArrayList<User>();
        
        try
        {
            Connection cnn = DBConnection.getConnection();
            PreparedStatement ps = cnn.prepareStatement("select user_name,email from user "
                    + "where type='student' and branch=?");
            ps.setString(1, branch);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String name = rs.getString("user_name");
                String email = rs.getString("email");
                
                User user = new User();
                user.setUserName(name);
                user.setEmail(email);
                
                list.add(user);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }

    public void updateOTP(String email, int otp) 
    {
        try {
            Connection cnn = DBConnection.getConnection();
            
            PreparedStatement ps = cnn.prepareStatement("update user "
                    + " set otp=? where email=?");
            ps.setInt(1,otp);
            ps.setString(2,email);
            
            int i = ps.executeUpdate();
            cnn.close();
            
        } catch (Exception ex) 
        {
            System.err.println("Update Otp User : " + ex.getMessage());            
        }        
    }

    public boolean verifyUser(String email, String otp) 
    {
        try {
            Connection cnn = DBConnection.getConnection();
            
            PreparedStatement ps = cnn.prepareStatement("update user "
                    + " set isverify=1 where email=? and otp=?");
            ps.setString(1,email);
            ps.setInt(2,Integer.parseInt(otp));
            
            int i = ps.executeUpdate();            
            cnn.close();
            if(i>0)return true;
            else return false;
        } catch (Exception ex) 
        {
            System.err.println("Verify User : " + ex.getMessage());            
            return false;
        }    
    }
    
}
