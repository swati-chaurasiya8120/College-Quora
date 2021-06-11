<%@page import="dto.Docs"%>
<%@page import="java.util.List"%>
<%@page import="dao.UserDao"%>
<%@include file="../blocks/header.jsp" %>
<%@include file="../blocks/studentmenu.jsp" %>

<%
    UserDao udao = new UserDao();
    
    List<Docs> list = udao.listDocs(user.getBranch());

%>

<div class="tm-right-column">
    <div class="tm-content-div">
        
        
        
        <section id="welcome" class="tm-section">
                                <header>
                                    <h2 class="tm-blue-text tm-welcome-title tm-margin-b-45">View Documents</h2>
                                </header>
            <hr
        </section>
        
        <table class='table table-hovered'>
            <tr>
                <th>Faculty</th>
                <th>Date</th>
                <th>Download</th>
            </tr>
            
            <% for(Docs ob : list) { %>
            <tr>
                <th><%=ob.getFacName()%></th>
                <td><%=ob.getUploadDate()%></td>
                <th>
                    <a target="_blank" href='<%=path%>/assets/docs/<%=ob.getFacid()%>/<%=ob.getFileName()%>'>
                        <b>Download</b>
                    </a>
                </th>
                
                
            </tr>
            <% } %>
        </table>
    </div>
</div>    
<%@include file="../blocks/footer.jsp" %>