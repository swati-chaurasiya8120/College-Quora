package controller;

import dao.QuestionDao;
import dto.Question;
import dto.User;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "askqus",urlPatterns = {"/askqus"})
public class AskQuestionServlet extends HttpServlet
{
    private QuestionDao qusDao;

    @Override
    public void init(ServletConfig config) throws ServletException 
    {
        qusDao = new QuestionDao();
        super.init(config); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        HttpSession sess = req.getSession();
        User user = (User)sess.getAttribute("user");
        
        String qus = req.getParameter("qus");
        int userid = user.getUserid();
        
        Question question = new Question(qus,userid);
        qusDao.save(question);
        String url = req.getContextPath()+"/student/question.jsp";
        resp.sendRedirect(url);
    }    
}
