<%@include file="blocks/header.jsp" %>
<%@include file="blocks/menu.jsp" %>

<%
    String msg = "";
    
    String regData = request.getParameter("reg");
    if(regData != null)
    {
        if(regData.equals("true")){
            msg= "User Registeration Successfully Done !";
        }else{
            msg= "User Registeration Failed !";
        }
    }
%>

<div class="tm-right-column">
    <div class="tm-content-div">
        
        <section id="welcome" class="tm-section">
                                <header>
                                    <h2 class="tm-blue-text tm-welcome-title tm-margin-b-45">User Registeration</h2>
                                </header>
            <hr
        </section>
        <form action="register" method="post">
        
        <div class="row form-group">            
            <div class='col-lg-6'>
                <input type="text" class='form-control' placeholder="Your Name"
                       name='username' required>
            </div>
            <div class='col-lg-6'>
                <input type="email" class='form-control' placeholder="Your Email"
                       name='email' required>
            </div>
        </div>
        
        <div class='row form-group'>
            <div class='col-lg-6'>
                <input type="password" class='form-control' placeholder="Password"
                       name='pass' required>
            </div>
            <div class='col-lg-6'>
                <input type="password" class='form-control' placeholder="Confirm Password"
                      required>
            </div>            
        </div>
        
        <div class='row form-group'>
            <div class='col-lg-6'>
                <select name='branch' class='form-control' required>
                    <option value=''>Choose Branch</option>
                    <option value='cs'>Computer Science</option>
                    <option value='me'>Mechanical</option>
                    <option value='ce'>Civil</option>
                </select>
            </div>
            <div class='col-lg-6'>
                <select name='type' class='form-control' required>
                    <option value=''>Choose Type</option>
                    <option value='student'>Student</option>
                    <option value='faculty'>Faculty</option>                    
                </select>
            </div>
        </div>
        
           <div class='row form-group'>
               <div class='col-lg-6'>
                   <button type='submit' 
                           class='btn btn-success'>Save User</button>                                          
               </div>
               <div class='col-lg-6'>
                    <b class='text-success'><%=msg%></b>     
               </div>
           </div>
        </form>
<%@include file="blocks/footer.jsp" %>