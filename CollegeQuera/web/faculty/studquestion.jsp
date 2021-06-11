<%@page import="dto.Question"%>
<%@page import="java.util.List"%>
<%@page import="dao.QuestionDao"%>
<%@include file="../blocks/header.jsp" %>
<%@include file="../blocks/facultymenu.jsp" %>

<%

QuestionDao qdao = new QuestionDao();
List<Question> qlist = qdao.listByBranch(user.getBranch());
%>

<script>
    function send(evt,ob,qid)
    {
        var txt = ob.value; 
        var code = evt.keyCode;
        if(code==13)
        {
            var URL = "<%=application.getContextPath()%>/sendans";
            var data = {ans:txt,qusid:qid};
            
            $.post(URL,data,function(data,status)
            {
                alert(data);
                ob.value='';
            });
        }
    }
</script>

<div class="tm-right-column">
    <div class="tm-content-div">
        
        <section id="welcome" class="tm-section">
                                <header>
                                    <h2 class="tm-blue-text tm-welcome-title tm-margin-b-45">Student Questions</h2>
                                </header>
            <hr
        </section>
        
         <table class='table'>
            <tr>
                <th>Student Name</th>
                <th>Question</th>
                <th>Ask Date</th>               
            </tr>
           
            <% for (Question q : qlist) { %>
            <tr>
                <th><%=q.getUserName()%></th>
                <td><%=q.getQus()%></td>
                <td><%=q.getAskDate()%></td>                
            </tr>
            <tr>
                <td></td>
                <td colspan="2">
                    <textarea value='' onkeyup="send(event,this,<%=q.getQid()%>)">
                        
                    </textarea>
                </td>
            </tr>
            <% } %>
            
        </table>
        
        
    </div>
</div>    
<%@include file="/blocks/footer.jsp" %>
