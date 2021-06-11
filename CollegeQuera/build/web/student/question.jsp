<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dto.Question"%>
<%@page import="java.util.List"%>
<%@page import="dao.QuestionDao"%>
<%@include file="../blocks/header.jsp" %>
<%@include file="../blocks/studentmenu.jsp" %>

<%
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    QuestionDao qDao = new QuestionDao();
    List<Question> qList = qDao.listByStudent(user.getUserid());
%>

<div class="tm-right-column">
    <div class="tm-content-div">
        
        <section id="welcome" class="tm-section">
                                <header>
                                    <h2 class="tm-blue-text tm-welcome-title tm-margin-b-45">Ask Questions</h2>
                                </header>
            <hr
        </section>
        
        <form action="<%=path%>/askqus" method="post">
            <textarea name="qus" cols="45" rows="6"></textarea>
            <br><br>
            <button class='btn btn-primary' type='submit'>Send Question</button>
        </form>
        
        <hr>
        
        <table class='table'>
            <tr>
                <th>Question</th>
                <th>Ask Date</th>
                <th>Answers</th>
            </tr>
            
            <% for (Question qu : qList ) { %>
            <tr>
                <td><%=qu.getQus()%></td>
                <td><%=sdf.format(qu.getAskDate())%></td>
                <td>
        <a href='<%=path%>/student/viewanswer.jsp?qus=<%=qu.getQid()%>'>View Answer</a>                    
                </td>
            </tr>
            <% } %>
        </table>
    </div>
</div>    
<%@include file="../blocks/footer.jsp" %>
