package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Advance Alexa </title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\n");
      out.write("            <a href=\"home.jsp\"><img style=\"max-height: 99%; max-width: 99%;\" class=\"fit\" src=\"A_Alexa_internet_logo.png\" alt=\"Logo\"></a>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"body\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<ul id=\"navigation\">\n");
      out.write("\t\t\t\t<li class=\"current\">\n");
      out.write("                                    <a href=\"home.jsp\" class=\"link1\">Home</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("                                    <a href=\"Notifications.jsp\" class=\"link2\">Notifications</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("                                    <a href=\"Add Friends.jsp\" class=\"link1\">Friends</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"about.html\" class=\"link2\">About</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"contact.html\" class=\"link1\">Contact</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div id=\"home\">\n");
      out.write("                            <script>\n");
      out.write("        // request permission on page load\n");
      out.write("document.addEventListener('DOMContentLoaded', function () {\n");
      out.write("  if (Notification.permission !== \"granted\")\n");
      out.write("    Notification.requestPermission();\n");
      out.write("});\n");
      out.write("\n");
      out.write("function notifyMe() {\n");
      out.write("  if (!Notification) {\n");
      out.write("    alert('Desktop notifications not available in your browser. Try Chromium.'); \n");
      out.write("    return;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  if (Notification.permission !== \"granted\")\n");
      out.write("    Notification.requestPermission();\n");
      out.write("  else {\n");
      out.write("    var notification = new Notification('Reminder Set ', {\n");
      out.write("      icon: 'http://cdn.sstatic.net/stackexchange/img/logos/so/so-icon.png',\n");
      out.write("      body: \"Hey there! You will be notified!\",\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    notification.onclick = function () {\n");
      out.write("      window.open(\"http://stackoverflow.com/a/13328397/1269037\");      \n");
      out.write("    };\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("                            \t<h1><span>Advance Alexa</span></h1>\n");
      out.write("\t\t\t\t<h2>Hi, how are you doing today? How can I help you?..!!!!</h2>\n");
      out.write("                                \n");
      out.write("                                <!-- CSS Styles -->\n");
      out.write("<style>\n");
      out.write("  .speech {border: 1px solid #DDD; width: 300px; padding: 0; margin: 0}\n");
      out.write("  .speech input {border: 0; width: 240px; display: inline-block; height: 30px;}\n");
      out.write("  .speech img {float: right; width: 40px }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- Search Form -->\n");
      out.write("<form id=\"labnol\" method=\"get\"  onsubmit=\"notifyMe()\" action=\"https://www.google.com/search\">\n");
      out.write("  <div class=\"speech\">\n");
      out.write("    <input type=\"text\" name=\"q\" id=\"transcript\" placeholder=\"Speak\" />\n");
      out.write("    <img onclick=\"startDictation()\" src=\"//i.imgur.com/cHidSVu.gif\" />\n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<!-- HTML5 Speech Recognition API -->\n");
      out.write("<script>\n");
      out.write("  function startDictation() {\n");
      out.write("\n");
      out.write("    if (window.hasOwnProperty('webkitSpeechRecognition')) {\n");
      out.write("\n");
      out.write("      var recognition = new webkitSpeechRecognition();\n");
      out.write("\n");
      out.write("      recognition.continuous = false;\n");
      out.write("      recognition.interimResults = false;\n");
      out.write("\n");
      out.write("      recognition.lang = \"en-US\";\n");
      out.write("      recognition.start();\n");
      out.write("\n");
      out.write("      recognition.onresult = function(e) {\n");
      out.write("        document.getElementById('transcript').value\n");
      out.write("                                 = e.results[0][0].transcript;\n");
      out.write("        recognition.stop();\n");
      out.write("        document.getElementById('labnol').submit();\n");
      out.write("      };\n");
      out.write("\n");
      out.write("      recognition.onerror = function(e) {\n");
      out.write("        recognition.stop();\n");
      out.write("      }\n");
      out.write("\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<div id=\"newsletter\">\n");
      out.write("\t\t\t\t<h3>Newsletter</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tSubscribe to our news letter.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<form action=\"index.html\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" value=\"email address\" onblur=\"this.value=!this.value?'email address':this.value;\" onfocus=\"this.select()\" onclick=\"this.value='';\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"connect\">\n");
      out.write("\t\t\t\t<h3>Social</h3>\n");
      out.write("\t\t\t\t<a href=\" \" id=\"facebook\" target=\"_blank\">Facebook</a>\n");
      out.write("\t\t\t\t<a href=\"\" id=\"twitter\" target=\"_blank\">Twitter</a>\n");
      out.write("\t\t\t\t<a href=\" \" id=\"googleplus\" target=\"_blank\">Google&#43;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t&copy; Copyright 2023. All rights reserved.\n");
      out.write("\t\t</p>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
