/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-07-18 09:05:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("  <title>竞拍者登陆</title>\n");
      out.write("  <link href=\"css/common.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"wrap\">\n");
      out.write("  <div style=\"float: left\">\n");
      out.write("    <a href=\"adminlogin.jsp\">管路员登陆</a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- main begin-->\n");
      out.write("  <div class=\"main\">\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("      <p><img src=\"images/img1.jpg\" width=\"443\" height=\"314\" alt=\"\" /></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"sidebarg\">\n");
      out.write("      <form action=\"login\" method=\"post\" target='_blank'>\n");
      out.write("        <div class=\"login\">\n");
      out.write("          <dl>\n");
      out.write("            <dt class=\"blues\">用户登陆</dt>\n");
      out.write("            <dd><label for=\"userName\">用户名：</label><input type=\"text\" class=\"inputh\" value=\"常用邮箱\" id=\"userName\" name=\"userName\"/></dd>\n");
      out.write("            <dd><label for=\"password\">密 码：</label><input type=\"text\" class=\"inputh\" value=\"密码\" id=\"passWord\" name=\"passWord\"/></dd>\n");
      out.write("            <dd>\n");
      out.write("              <label class=\"lf\" for=\"passwords\">验证码：</label>\n");
      out.write("              <input type=\"text\" class=\"inputh inputs lf\" value=\"验证码\" id=\"passwords\"/>\n");
      out.write("              <span class=\"wordp lf\"><img src=\"images/img2.jpg\" width=\"96\" height=\"27\" alt=\"\" /></span>\n");
      out.write("              <span class=\"blues lf\"><a href=\"\" title=\"\">看不清</a></span>\n");
      out.write("            </dd>\n");
      out.write("            <dd>\n");
      out.write("              <input name=\"\"  type=\"checkbox\" id=\"rem_u\"  />\n");
      out.write("              <span for=\"rem_u\">下次自动登录</span>\n");
      out.write("            </dd>\n");
      out.write("            <dd class=\"buttom\">\n");
      out.write("              <input name=\"\" type=\"submit\" value=\"登 录\" class=\"spbg buttombg f14 lf\" />\n");
      out.write("              <a href=\"regist.jsp\" class=\"spbg buttombg f14 lf\" >注 册</a>\n");
      out.write("              <span class=\"blues  lf\"><a href=\"\" title=\"\">忘记密码?</a></span>\n");
      out.write("              <div class=\"cl\"></div>\n");
      out.write("            </dd>\n");
      out.write("\n");
      out.write("          </dl>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"cl\"></div>\n");
      out.write("  </div>\n");
      out.write("  <!-- main end-->\n");
      out.write("\n");
      out.write("  <!-- footer begin-->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("<!--footer end-->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}