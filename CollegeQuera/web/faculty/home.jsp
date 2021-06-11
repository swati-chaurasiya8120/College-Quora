<%@page import="java.util.ArrayList"%>
<%@page import="dao.UserDao"%>
<%@include file="../blocks/header.jsp" %>
<%@include file="../blocks/facultymenu.jsp" %>

<%
    String branch = user.getBranch();
    
    UserDao uDao = new UserDao();
    ArrayList<User> students = uDao.listStudents(branch);
%>
<style>
.aligncenter {
    text-align: center;
}
</style>
<div class="tm-right-column">
    <div class="tm-content-div">
        
        
        <section id="welcome" class="tm-section">
                                <header>
                                    <h2 class="tm-blue-text tm-welcome-title tm-margin-b-30">Welcome Faculty</h2>
                                </header>
            <hr
        </section>
        
        
        <table class='table table-hover'>
            <tr>
                <th>Student Name</th>
                <th>Email</th>
            </tr>
            
            <% for(User stud : students)  { %>
            <tr>
                <td><%=stud.getUserName()%></td>
                <td><%=stud.getEmail()%></td>
            </tr>
            <% } %>
        </table>
        
        
    </div>
</div>    
<%@include file="../blocks/footer.jsp" %>
