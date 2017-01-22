package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Advance Alexa</title>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/clockstyle.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<!--//theme-style-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Maven+Pro:700,400' rel='stylesheet' type='text/css'>\n");
      out.write("<!--//theme-style-->\n");
      out.write(" <!--Calender-->\n");
      out.write("\t  <link rel=\"stylesheet\" href=\"css/clndr.css\" type=\"text/css\" />\n");
      out.write("\t  <script src=\"js/underscore-min.js\"></script>\n");
      out.write("\t  <script src= \"js/moment-2.2.1.js\"></script>\n");
      out.write("\t  <script src=\"js/clndr.js\"></script>\n");
      out.write("\t  <script src=\"js/site.js\"></script>\n");
      out.write("\t<!--End Calender-->\n");
      out.write("\t<script src=\"js/jClocksGMT.js\"></script>\n");
      out.write("<script src=\"js/jquery.rotate.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jClocksGMT.css\">\n");
      out.write("<script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $('#clock_hou').jClocksGMT({offset: '-5', hour24: true});\n");
      out.write("                $('#clock_dc').jClocksGMT({offset: '-4', digital: false});\n");
      out.write("                $('#clock_india').jClocksGMT({offset: '+5.5'});\n");
      out.write("            });\n");
      out.write("</script>\n");
      out.write("<!---Google Analytics Designmaz.net-->\n");
      out.write("<script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', 'UA-35751449-15', 'auto');ga('send', 'pageview');</script>\n");
      out.write("  \t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("             <h1>Your Reminder and alarms</h1>\n");
      out.write("        <div class=\"main\">\n");
      out.write("\t\t    <div class=\"cloc\">\n");
      out.write("\t\t\t\t\t<div id=\"clock_india\" class=\"clock_container\">            \n");
      out.write("\t\t\t\t\t\t<div class=\"digital\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"hr\"></span><span class=\"minute\"></span> <span class=\"period\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clockHolder\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"rotatingWrapper\"><img class=\"hour\" src=\"images/clock_hour.png\" alt=\"\"/></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"rotatingWrapper\"><img class=\"min\" src=\"images/clock_min.png\" alt=\"\"/></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"rotatingWrapper\"><img class=\"sec\" src=\"images/clock_sec.png\" alt=\"\"/></div>\n");
      out.write("\t\t\t\t\t\t\t<img class=\"clock\" src=\"images/clock.png\" alt=\"\"/> \n");
      out.write("\t\t\t\t\t\t</div>             \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t <div class=\"mini-cal\">\n");
      out.write("\t\t\t<div class=\"calender\">\n");
      out.write("\t\t\t\t\t<div class=\"column_right_grid calender\">\n");
      out.write("                      <div class=\"cal1\"><div class=\"clndr\"><div class=\"clndr-controls\"><div class=\"clndr-control-button\"><p class=\"clndr-previous-button\">previous</p></div><div class=\"month\">September 2015</div><div class=\"clndr-control-button rightalign\"><p class=\"clndr-next-button\">next</p></div></div><table class=\"clndr-table\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><thead><tr class=\"header-days\"><td class=\"header-day\">S</td><td class=\"header-day\">M</td><td class=\"header-day\">T</td><td class=\"header-day\">W</td><td class=\"header-day\">T</td><td class=\"header-day\">F</td><td class=\"header-day\">S</td></tr></thead><tbody><tr><td class=\"day past adjacent-month last-month calendar-day-2015-08-30\"><div class=\"day-contents\">30</div></td><td class=\"day past adjacent-month last-month calendar-day-2015-08-31\"><div class=\"day-contents\">31</div></td><td class=\"day past calendar-day-2015-09-01\"><div class=\"day-contents\">1</div></td><td class=\"day past calendar-day-2015-09-02\"><div class=\"day-contents\">2</div></td><td class=\"day past calendar-day-2015-09-03\"><div class=\"day-contents\">3</div></td><td class=\"day past calendar-day-2015-09-04\"><div class=\"day-contents\">4</div></td><td class=\"day past calendar-day-2015-09-05\"><div class=\"day-contents\">5</div></td></tr><tr><td class=\"day past calendar-day-2015-09-06\"><div class=\"day-contents\">6</div></td><td class=\"day past calendar-day-2015-09-07\"><div class=\"day-contents\">7</div></td><td class=\"day past calendar-day-2015-09-08\"><div class=\"day-contents\">8</div></td><td class=\"day past calendar-day-2015-09-09\"><div class=\"day-contents\">9</div></td><td class=\"day past event calendar-day-2015-09-10\"><div class=\"day-contents\">10</div></td><td class=\"day past event calendar-day-2015-09-11\"><div class=\"day-contents\">11</div></td><td class=\"day past event calendar-day-2015-09-12\"><div class=\"day-contents\">12</div></td></tr><tr><td class=\"day past event calendar-day-2015-09-13\"><div class=\"day-contents\">13</div></td><td class=\"day past event calendar-day-2015-09-14\"><div class=\"day-contents\">14</div></td><td class=\"day past calendar-day-2015-09-15\"><div class=\"day-contents\">15</div></td><td class=\"day past calendar-day-2015-09-16\"><div class=\"day-contents\">16</div></td><td class=\"day past calendar-day-2015-09-17\"><div class=\"day-contents\">17</div></td><td class=\"day past calendar-day-2015-09-18\"><div class=\"day-contents\">18</div></td><td class=\"day past calendar-day-2015-09-19\"><div class=\"day-contents\">19</div></td></tr><tr><td class=\"day past calendar-day-2015-09-20\"><div class=\"day-contents\">20</div></td><td class=\"day past event calendar-day-2015-09-21\"><div class=\"day-contents\">21</div></td><td class=\"day past event calendar-day-2015-09-22\"><div class=\"day-contents\">22</div></td><td class=\"day past event calendar-day-2015-09-23\"><div class=\"day-contents\">23</div></td><td class=\"day past calendar-day-2015-09-24\"><div class=\"day-contents\">24</div></td><td class=\"day past calendar-day-2015-09-25\"><div class=\"day-contents\">25</div></td><td class=\"day today calendar-day-2015-09-26\"><div class=\"day-contents\">26</div></td></tr><tr><td class=\"day calendar-day-2015-09-27\"><div class=\"day-contents\">27</div></td><td class=\"day calendar-day-2015-09-28\"><div class=\"day-contents\">28</div></td><td class=\"day calendar-day-2015-09-29\"><div class=\"day-contents\">29</div></td><td class=\"day calendar-day-2015-09-30\"><div class=\"day-contents\">30</div></td><td class=\"day adjacent-month next-month calendar-day-2015-10-01\"><div class=\"day-contents\">1</div></td><td class=\"day adjacent-month next-month calendar-day-2015-10-02\"><div class=\"day-contents\">2</div></td><td class=\"day adjacent-month next-month calendar-day-2015-10-03\"><div class=\"day-contents\">3</div></td></tr></tbody></table></div></div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t<div class=\"cal-pos a\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"cal-pos\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clear\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t<!--End Calender-->\n");
      out.write("<div class=\"copy-right\">\n");
      out.write("\t\t \n");
      out.write("</div>\n");
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
