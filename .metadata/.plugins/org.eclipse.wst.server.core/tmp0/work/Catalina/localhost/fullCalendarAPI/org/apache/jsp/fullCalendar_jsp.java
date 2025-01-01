/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-04-14 23:43:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fullCalendar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
request.setCharacterEncoding("UTF-8");
      out.write('\r');
      out.write('\n');
response.setContentType("text/html; charset=UTF-8");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>∴fullCalendar∵</title>\r\n");
      out.write("<link href='fullcalendar/main.css' rel='stylesheet' />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<p><em>달력을 클릭해주세요!</em></p>\r\n");
      out.write("\t<!-- 달력API -->\t\t<div id='postMdate'></div>\r\n");
      out.write("\t\t\t\t\t\t    \r\n");
      out.write("\t\t<input type=\"hidden\" name=\"postMdate\" value=\"\" />\r\n");
      out.write("\t\t<div id='calendar'></div>\r\n");
      out.write("\t\t<p><em>시계아이콘을 클릭해 약속시간을 정해주세요</em></p>\r\n");
      out.write("\t\t<input type=\"time\" name=\"postLatitude\"/>\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\" src=\"/fullCalendarAPI/resources/JavaScript/fullCallendar.js\"></script>\r\n");
      out.write("<script src='/fullCalendarAPI/resources/API/fullcalendar-5.6.0/lib/main.js'></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tdocument.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("\t\tvar calendarEl = document.getElementById('calendar');\r\n");
      out.write("\t\tvar calendar = new FullCalendar.Calendar(calendarEl, {\r\n");
      out.write("\t\t\tselectable: true,\r\n");
      out.write("\t\t\theaderToolbar: {\r\n");
      out.write("\t\t\t\tleft: 'prev,next today',\r\n");
      out.write("\t\t\t\tcenter: 'title',\r\n");
      out.write("\t\t\t\tright: 'dayGridMonth,timeGridWeek,timeGridDay'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t// 위에까지가 기본 달력화면\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 아래가 클릭기능. postMdate라는 id를 가진 태그를 변수로 만들어 \r\n");
      out.write("\t\t\t// info.dateStr이라는 약속일자를 담아주고 있다.\r\n");
      out.write("\t\t\tdateClick: function(info) {\r\n");
      out.write("\t\t\t\tvar postMdate = document.getElementById('postMdate');\r\n");
      out.write("\t\t\t\tpostMdate.innerHTML = \"약속일자 : \" + info.dateStr;\r\n");
      out.write("\t\t\t\tdocument.getElementsByName(\"postMdate\")[0].value = info.dateStr;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tcalendar.render();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<link href='/fullCalendarAPI/resources/API/fullcalendar-5.6.0/lib/main.css' rel='stylesheet' />\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
