package org.apache.jsp.jsp.plugin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class plugin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<!--\n");
      out.write(" Licensed to the Apache Software Foundation (ASF) under one or more\n");
      out.write("  contributor license agreements.  See the NOTICE file distributed with\n");
      out.write("  this work for additional information regarding copyright ownership.\n");
      out.write("  The ASF licenses this file to You under the Apache License, Version 2.0\n");
      out.write("  (the \"License\"); you may not use this file except in compliance with\n");
      out.write("  the License.  You may obtain a copy of the License at\n");
      out.write("\n");
      out.write("      http://www.apache.org/licenses/LICENSE-2.0\n");
      out.write("\n");
      out.write("  Unless required by applicable law or agreed to in writing, software\n");
      out.write("  distributed under the License is distributed on an \"AS IS\" BASIS,\n");
      out.write("  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n");
      out.write("  See the License for the specific language governing permissions and\n");
      out.write("  limitations under the License.\n");
      out.write("-->\n");
      out.write("<title> Plugin example </title>\n");
      out.write("<body bgcolor=\"white\">\n");
      out.write("<h3> Current time is : </h3>\n");
      out.write("<object classid=\"clsid:8AD9C840-044E-11D1-B3E9-00805F499D93\"" + " width=\"" + "160" + "\"" + " height=\"" + "150" + "\"" + " codebase=\"http://java.sun.com/products/plugin/1.2.2/jinstall-1_2_2-win.cab#Version=1,2,2,0\">");
      out.write("\n");
      out.write("<param name=\"java_code\" value=\"Clock2.class\">");
      out.write("\n");
      out.write("<param name=\"java_codebase\" value=\"applet\">");
      out.write("\n");
      out.write("<param name=\"type\" value=\"application/x-java-applet;version=1.2\">");
      out.write("\n");
      out.write("<comment>");
      out.write("\n");
      out.write("<EMBED type=\"application/x-java-applet;version=1.2\"" + " width=\"" + "160" + "\"" + " height=\"" + "150" + "\"" + " pluginspage=\"http://java.sun.com/products/plugin/\" java_code=\"Clock2.class\" java_codebase=\"applet\"");
      out.write("/>");
      out.write("\n");
      out.write("<noembed>");
      out.write("\n");
      out.write("\n");
      out.write("        Plugin tag OBJECT or EMBED not supported by browser.\n");
      out.write("    ");
      out.write("\n");
      out.write("</noembed>");
      out.write("\n");
      out.write("</comment>");
      out.write("\n");
      out.write("</object>");
      out.write("\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("<h4>\n");
      out.write("<font color=red> \n");
      out.write("The above applet is loaded using the Java Plugin from a jsp page using the\n");
      out.write("plugin tag.\n");
      out.write("</font>\n");
      out.write("</h4>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
