package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/blocks/header.jsp");
    _jspx_dependants.add("/blocks/menu.jsp");
    _jspx_dependants.add("/blocks/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>Universal College</title>\n");
      out.write("<!--\n");
      out.write("Neaty HTML Template\n");
      out.write("http://www.templatemo.com/tm-501-neaty\n");
      out.write("-->\n");
      out.write("    <!-- load stylesheets -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400\">  <!-- Google web font \"Open Sans\" -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">                                      <!-- Bootstrap style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">                                <!-- Magnific pop up style, http://dimsemenov.com/plugins/magnific-popup/ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-style.css\">                                   <!-- Templatemo style -->\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("          <![endif]-->\n");
      out.write("</head>\n");
      out.write("    <body>        \n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">   \n");
      out.write("        <div class=\"tm-left-right-container\">");
      out.write('\n');
      out.write("<!-- Left column: logo and menu -->\n");
      out.write("                    <div class=\"tm-blue-bg tm-left-column\">                        \n");
      out.write("                        <div class=\"tm-logo-div text-xs-center\">\n");
      out.write("                            <img src=\"assets/img/tm-neaty-logo.png\" alt=\"Logo\">\n");
      out.write("                            <h1 class=\"tm-site-name\">\n");
      out.write("                                Universal College\n");
      out.write("                            </h1>\n");
      out.write("                        </div>\n");
      out.write("                        <nav class=\"tm-main-nav\">\n");
      out.write("                            <ul class=\"tm-main-nav-ul\">\n");
      out.write("                                <li class=\"tm-nav-item\">\n");
      out.write("                                    <a href=\"index.jsp\" class=\"tm-nav-item-link\">Home Page</a>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("                                <li class=\"tm-nav-item\">\n");
      out.write("                                    <a href=\"register.jsp\" class=\"tm-nav-item-link\">Register Page</a>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("                                 <li class=\"tm-nav-item\">\n");
      out.write("                                    <a href=\"login.jsp\" class=\"tm-nav-item-link\">Login Page</a>\n");
      out.write("                                </li>\n");
      out.write("                               \n");
      out.write("                            </ul>\n");
      out.write("                        </nav>                                         \n");
      out.write("                    </div> <!-- Left column: logo and menu -->\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"tm-right-column\">\n");
      out.write("    <figure>\n");
      out.write("         <img src=\"assets/img/neaty-01.jpg\" alt=\"Header image\" class=\"img-fluid\">    \n");
      out.write("    </figure>\n");
      out.write("\n");
      out.write("    <div class=\"tm-content-div\">\n");
      out.write("                            <!-- Welcome section -->\n");
      out.write("                            <section id=\"welcome\" class=\"tm-section\">\n");
      out.write("                                <header>\n");
      out.write("                                    <h2 class=\"tm-blue-text tm-welcome-title tm-margin-b-45\">Welcome to Neaty Design</h2>\n");
      out.write("                                </header>\n");
      out.write("                                <p>Neaty is simple and clean design HTML CSS template for any kind of website. Feel free to use this layout. Please tell your friends about TemplateMo website. Thank you. Suspendisse imperdiet, felis eu hendrerit pretium, sapien mauris blandit arcu, et accumsan neque est ut erat. Vivamus eget tellus euismod, interdum nibh at, eleifend justo. Quisque placerat ante in ex tempor, ultrices bibendum nunc finibus. Etiam luctus nec eros vel pulvinar.</p>\n");
      out.write("                            </section>\n");
      out.write("                            <!-- About section -->\n");
      out.write("                            <section id=\"about\" class=\"tm-section\">\n");
      out.write("                                <div class=\"row\">                                                                \n");
      out.write("                                    <div class=\"col-lg-8 col-md-7 col-sm-12 col-xs-12 push-lg-4 push-md-5\">\n");
      out.write("                                        <header>\n");
      out.write("                                            <h2 class=\"tm-blue-text tm-section-title tm-margin-b-45\">About the team</h2>\n");
      out.write("                                        </header>\n");
      out.write("                                        <p>Sed turpis nunc, laoreet sit amet fermentum sed, euismod ac justo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.</p>\n");
      out.write("                                        <p>Donec ut lectus semper, sollicitudin risus blandit, mattis felis. Nam non malesuada odio. Vestibulum vaius, arcu eget rutrum consequat, arcu lacus imperdiet arcu, id pulvinar arcu erat vel magna.</p>\n");
      out.write("                                        <p>Ut commodo malesuada eros, quis consequat ante tincidunt ut. Suspendisse malesuada augue vitae nisi sollicitudin placerat.</p>\n");
      out.write("                                        <a href=\"#\" class=\"tm-button tm-button-wide\">Read More</a>  \n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-lg-4 col-md-5 col-sm-12 col-xs-12 pull-lg-8 pull-md-7 tm-about-img-container\">\n");
      out.write("                                        <img src=\"assets/img/neaty-02.jpg\" alt=\"Image\" class=\"img-fluid\">    \n");
      out.write("                                    </div>  \n");
      out.write("                                </div>                            \n");
      out.write("    </section>  \n");
      out.write("                            <footer>\n");
      out.write("                                <p class=\"tm-copyright-p\">Copyright &copy; <span class=\"tm-current-year\">2017</span> Your Company \n");
      out.write("                                \n");
      out.write("                                | Designed by TemplateMo</p>\n");
      out.write("                            </footer>\n");
      out.write("                        </div>  \n");
      out.write("                        \n");
      out.write("                    </div> <!-- Right column: content -->\n");
      out.write("                </div>\n");
      out.write("            </div> <!-- row -->\n");
      out.write("        </div> <!-- container -->\n");
      out.write("                \n");
      out.write("        <!-- load JS files -->\n");
      out.write("        <script src=\"assets/js/jquery-1.11.3.min.js\"></script>             <!-- jQuery (https://jquery.com/download/) -->\n");
      out.write("        <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>     <!-- Magnific pop-up (http://dimsemenov.com/plugins/magnific-popup/) -->\n");
      out.write("        <script src=\"assets/js/jquery.singlePageNav.min.js\"></script>      <!-- Single Page Nav (https://github.com/ChrisWojcik/single-page-nav) -->\n");
      out.write("        <script>     \n");
      out.write("       \n");
      out.write("            $(document).ready(function(){\n");
      out.write("\n");
      out.write("              \n");
      out.write("                // Magnific pop up\n");
      out.write("                $('.tm-gallery-1').magnificPopup({\n");
      out.write("                  delegate: 'a', // child items selector, by clicking on it popup will open\n");
      out.write("                  type: 'image',\n");
      out.write("                  gallery: {enabled:true}\n");
      out.write("                  // other options\n");
      out.write("                }); \n");
      out.write("\n");
      out.write("                $('.tm-gallery-2').magnificPopup({\n");
      out.write("                  delegate: 'a', // child items selector, by clicking on it popup will open\n");
      out.write("                  type: 'image',\n");
      out.write("                  gallery: {enabled:true}\n");
      out.write("                  // other options\n");
      out.write("                }); \n");
      out.write("\n");
      out.write("                $('.tm-gallery-3').magnificPopup({\n");
      out.write("                  delegate: 'a', // child items selector, by clicking on it popup will open\n");
      out.write("                  type: 'image',\n");
      out.write("                  gallery: {enabled:true}\n");
      out.write("                  // other options\n");
      out.write("                }); \n");
      out.write("\n");
      out.write("                $('.tm-current-year').text(new Date().getFullYear());                \n");
      out.write("            });\n");
      out.write("        </script>             \n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("                           \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
