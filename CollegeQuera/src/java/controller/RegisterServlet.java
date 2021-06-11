package controller;

import dao.UserDao;
import dto.User;
import service.EmailService;
import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "register",urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet
{
    private UserDao userDao;

    @Override
    public void init(ServletConfig config) throws ServletException 
    {
        userDao = new UserDao();
        super.init(config); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    protected void doPost(HttpServletRequest req, 
            HttpServletResponse resp) throws ServletException, IOException 
    {
        EmailService mail = new EmailService();
        
        String name = req.getParameter("username");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        String branch = req.getParameter("branch");
        String type = req.getParameter("type");
        
        User user = new User(name, email, pass, branch, type);
        boolean status = userDao.save(user);
        // resp.getWriter().write(status+"");
        if(status)
        {
            Random r = new Random(System.currentTimeMillis());
            int otp =  10000 + r.nextInt(20000);
            
            mail.sendVerifyMail(name, email, otp);
            userDao.updateOTP(email,otp);
        }
        
        String url = "register.jsp?reg="+status;
        resp.sendRedirect(url);
    }    
}
