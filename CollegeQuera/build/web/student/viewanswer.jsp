<%@page import="dao.AnswerDao"%>
<%@page import="dto.Answer"%>
<%@page import="java.util.List"%>
<%@page import="dao.QuestionDao"%>
<%@page import="dto.Question"%>
<%@include file="../blocks/header.jsp" %>
<%@include file="../blocks/studentmenu.jsp" %>

<%
    int qid = Integer.parseInt(request.getParameter("qus"));

    AnswerDao  adao = new AnswerDao();
    QuestionDao qdao = new QuestionDao();
    Question qus = qdao.get(qid); 
    List<Answer> alist = adao.listByQuestion(qid);
%>

<div class="tm-right-column">
    <div class="tm-content-div">
        
       <section id="welcome" class="tm-section">
                                <header>
                                    <h2 class="tm-blue-text tm-welcome-title tm-margin-b-45">View Answer</h2>
                                </header>
            <hr
        </section>
        <h3>Qus : <%=qus.getQus()%></h3>    
        
        <table class='table'>
            <tr>
                <th>Faculty Name</th>
                <th>Date</th>
                <th>Answer</th>
            </tr>
            <% for(Answer ans : alist) { %>
            <tr>
                <td><%=ans.getFacultyName()%></td>                
                <td><%=ans.getAnsDate()%></td>
                <th><%=ans.getAns()%></th>               
                
            </tr>
            <% } %>
        </table>
    </div>
