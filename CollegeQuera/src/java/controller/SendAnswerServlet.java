package controller;

import dao.AnswerDao;
import dto.Answer;
import dto.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "sendans",urlPatterns = {"/sendans"})
public class SendAnswerServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String ans = req.getParameter("ans");
        int qusid = Integer.parseInt(req.getParameter("qusid"));
        
        HttpSession sess = req.getSession();
        User user = (User)sess.getAttribute("user");
        
        int userid = user.getUserid();
        
        Answer ob = new Answer(ans, userid, qusid);
        
        AnswerDao dao = new AnswerDao();
        dao.save(ob);
        resp.getWriter().write("Done !");
    }    
}

/*
$.ajax({
	url: "",
	success : function(data)
	{

	},
	error:function(err)
	{
	
	}
});

$.get();
$.post();
*/