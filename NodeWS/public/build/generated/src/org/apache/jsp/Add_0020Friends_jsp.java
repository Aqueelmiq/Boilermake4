package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Add_0020Friends_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>News &amp; Blog - Tourism Surfing Web Template</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"header\">\n");
      out.write("            <a href=\"index.html\"><img style=\"max-height: 99%; max-width: 99%;\" src=\"A_Alexa_internet_logo.png\" alt=\"Logo\"></a>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"body\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<ul id=\"navigation\">\n");
      out.write("\t\t\t\t<li>\n");
      out.write("                                    <a href=\"home.jsp\" class=\"link1\">Home</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("                                    <a href=\"Notifications.jsp\" class=\"link2\">Notifications</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"current\">\n");
      out.write("                                    <a href=\"Friends.jsp\" class=\"link1\">Friends </a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("                                    <a href=\"calendar.jsp\" class=\"link2\">Calendar</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"contact.html\" class=\"link1\">Contact</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div id=\"newsblog\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t <a href=\"newsblog.html\"><img src=\"images/surfing5.png\" alt=\"Image\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"newsblog.html\">meeta morris</a></h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t <a href=\"newsblog.html\"><img src=\"images/family.png\" alt=\"Image\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"newsblog.html\">Rishabh Shah</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t <a href=\"newsblog.html\"><img src=\"images/surfing6.png\" alt=\"Image\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"newsblog.html\">Aqueel</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<div id=\"newsletter\">\n");
      out.write("\t\t\t\t<h3>Newsletter</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tYou can remove any link to our website from this website template, you&#39;re free to use this website template without linking back to us.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<form action=\"index.html\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" value=\"email address\" onblur=\"this.value=!this.value?'email address':this.value;\" onfocus=\"this.select()\" onclick=\"this.value='';\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"connect\">\n");
      out.write("\t\t\t\t<h3>Social</h3>\n");
      out.write("\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/facebook/\" id=\"facebook\" target=\"_blank\">Facebook</a>\n");
      out.write("\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/twitter/\" id=\"twitter\" target=\"_blank\">Twitter</a>\n");
      out.write("\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/googleplus/\" id=\"googleplus\" target=\"_blank\">Google&#43;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t&copy; Copyright 2023. All rights reserved.\n");
      out.write("\t\t</p>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
