<%-- 
    Document   : index
    Created on : 10 Mar, 2021, 8:35:42 PM
    Author     : Hacker_Shubbu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="blocks/header.jsp" %>
<%@include file="blocks/menu.jsp" %>
<style>
.aligncenter {
    text-align: center;
}
</style>
<div class="tm-right-column">
    <figure>
        <p class="aligncenter"> <img  src="assets/img/neaty-02.png" alt="Header image"  width="250" height="250" class="center"></p>   
    </figure>

    <div class="tm-content-div">
                            <!-- Welcome section -->
                            <section id="welcome" class="tm-section">
                                <header class="aligncenter">
                                    <h2 class="tm-blue-text tm-welcome-title tm-margin-b-45">Welcome to College Quora</h2>
                                </header>
                                <p>College Quora is a question-and-answer WebApplication where questions are asked by Student and answered by Faculty. College Quora is a place to gain and share knowledge. Collage Quora’s mission is to share and grow the Student’s knowledge. College Quora is a place where you can ask questions you care about and get answers that are amazing.</p>
                            </section>
                            <!-- About section -->
                            <section id="about" class="tm-section">
                                <div class="row">                                                                
                                    <div class="col-lg-8 col-md-7 col-sm-12 col-xs-12 push-lg-4 push-md-5">
                                        <header>
                                            <h2 class="tm-blue-text tm-section-title tm-margin-b-45">About the College Quora</h2>
                                        </header>
                                        <p>College Quora is an online community of Students and Faculties providing answers to questions.</p>
                                        <p>Actually 'Quora' is an abbreviated form where 'qu' stands for question and 'a' stands for answer. Thus the full form of Quora is 'Question or answer '</p>
                                          
                                    </div>

                                    <div class="col-lg-4 col-md-5 col-sm-12 col-xs-12 pull-lg-8 pull-md-7 tm-about-img-container">
                                        <img src="assets/img/neaty-02.png" alt="Image" class="img-fluid">    
                                    </div>  
                                </div>                            
    </section>  
<%@include file="blocks/footer.jsp" %>                           
