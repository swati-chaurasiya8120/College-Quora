<%@include file="blocks/header.jsp" %>
<%@include file="blocks/menu.jsp" %>

<%
    String msg = "";

    String regData = request.getParameter("err");
    if(regData!=null)
    {
        msg = "Invalid User !";
    }
%>

<div class="tm-right-column">
    <div class="tm-content-div">
        
        <section id="welcome" class="tm-section">
                                <header>
                                    <h2 class="tm-blue-text tm-welcome-title tm-margin-b-45">User Login</h2>
                                </header>
            <hr
        </section>
        
        <form action="login" method="post">
        
        <div class="row form-group">            
            <div class='col-lg-6'>
                <input type="email" class='form-control' placeholder="Your Email"
                       name='email' required>
            </div>
            <div class='col-lg-6'>
                <input type="password" class='form-control' placeholder="Password"
                       name='pass' required>
            </div>
        </div>
           <div class='row form-group'>
               <div class='col-lg-6'>
                   <button type='submit' 
                           class='btn btn-success'>Login User</button>                                          
               </div>
               <div class='col-lg-6'>
                    <b class='text-danger'><%=msg%></b>     
               </div>
           </div>
        </form>
<%@include file="blocks/footer.jsp" %>