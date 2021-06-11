<%@page import="java.util.ArrayList"%>
<%@page import="dao.UserDao"%>
<%@include file="../blocks/header.jsp" %>
<%@include file="../blocks/facultymenu.jsp" %>


<div class="tm-right-column">
    <div class="tm-content-div">
        
        <section id="welcome" class="tm-section">
                                <header>
                                    <h2 class="tm-blue-text tm-welcome-title tm-margin-b-45">Upload Documents</h2>
                                </header>
            <hr
        
        
        <form action='<%=path%>/faculty/upload'
              enctype="multipart/form-data"
              method="POST">
            
          
            <input type="file" name="myfile" class='form-control' required>
            
            <br>
            
            <button type='submit' class='btn btn-success'>Send File</button>
                
        </form>
        
    </div>
</div>    
<%@include file="../blocks/footer.jsp" %>
