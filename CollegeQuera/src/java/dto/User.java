package dto;

public class User 
{
    private int userid;
    private String userName;
    private String email;
    private String password;
    private String branch;
    private String type;
    private int otp;
    private boolean verifyStatus;

    public User() {
    }

    public User(int userid, String userName, String email, String password, String branch, String type, int otp, boolean verifyStatus) {
        this.userid = userid;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.branch = branch;
        this.type = type;
        this.otp = otp;
        this.verifyStatus = verifyStatus;
    }
     public User(int userid, String userName, String email,String branch, String type)
     {
        this.userid = userid;
        this.userName = userName;
        this.email = email;
        this.branch = branch;
        this.type = type;        
    }
    
    public User(String userName, String email, String password, String branch, String type) {        
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.branch = branch;
        this.type = type;        
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public boolean isVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(boolean verifyStatus) {
        this.verifyStatus = verifyStatus;
    }
}
