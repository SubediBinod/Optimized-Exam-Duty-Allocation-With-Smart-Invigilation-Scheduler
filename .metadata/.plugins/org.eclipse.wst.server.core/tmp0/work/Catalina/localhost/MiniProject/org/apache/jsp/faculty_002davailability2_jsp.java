/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-11-16 05:01:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;
import com.gnit.DatabaseFile.DbConnection;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.io.IOException;

public final class faculty_002davailability2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(8);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_packages.add("com.itextpdf.text");
    _jspx_imports_packages.add("com.itextpdf.text.pdf");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("com.gnit.DatabaseFile.DbConnection");
    _jspx_imports_classes.add("java.io.FileOutputStream");
    _jspx_imports_classes.add("java.io.IOException");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Faculty Availability</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/faculty-availability.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("  body {\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    background-color: #f4f4f4;\r\n");
      out.write("    background-image: url('images/4.jpg');\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    background-position: center;\r\n");
      out.write("    background-attachment: fixed;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".center-button {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".center-button button {\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    background-color: #7E6363; /* Blue background */\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".center-button button:hover {\r\n");
      out.write("    background-color: #3E3232; /* Darker blue on hover */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Container styling */\r\n");
      out.write(".container {\r\n");
      out.write("    max-width: 1200px;\r\n");
      out.write("    margin: 30px auto;\r\n");
      out.write("    background: rgba(255, 255, 255, 0.8);\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    border-radius: 12px;\r\n");
      out.write("    box-shadow: 0 6px 12px rgba(0, 0, 0, 0.15);\r\n");
      out.write("    overflow-x: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Heading styling */\r\n");
      out.write("h1, h2 {\r\n");
      out.write("    color: #333;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Table styling */\r\n");
      out.write("table {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("    font-size: 1.1em; /* Increased text size */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("    padding: 12px;\r\n");
      out.write("    border: 1px solid #ddd;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    text-overflow: ellipsis;\r\n");
      out.write("    white-space: nowrap;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("    background-color: #49243E; /* Dark color for header */\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("    transition: color 0.3s ease, font-size 0.3s ease; /* Smooth transition for hover effect */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Hover effect */\r\n");
      out.write("td:hover {\r\n");
      out.write("    color: #637E76; /* Dark color on hover */\r\n");
      out.write("    font-size: 1.2em; /* Increase text size on hover */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Form styling */\r\n");
      out.write("form {\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"text\"], input[type=\"date\"], select {\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    width: 220px;\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"submit\"] {\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    background-color: #49243E;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"submit\"]:hover {\r\n");
      out.write("    background-color: #331729; /* Darker shade on hover */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Conditional date styling */\r\n");
      out.write(".conditional-date {\r\n");
      out.write("    display: none;\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".conditional-date input[type=\"date\"] {\r\n");
      out.write("    width: 240px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Wrapper to hold both forms in a single line, aligned center */\r\n");
      out.write(".inline-forms-container {\r\n");
      out.write("    display: flex;  /* Use flexbox for horizontal alignment */\r\n");
      out.write("    justify-content: center;  /* Center-align both forms horizontally */\r\n");
      out.write("    align-items: center;  /* Vertically center the forms */\r\n");
      out.write("    gap: 20px;  /* Add some space between the forms */\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Button styling */\r\n");
      out.write(".styled-button {\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    background-color: #7E6363; /* Button background */\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".styled-button:hover {\r\n");
      out.write("    background-color: #3E3232; /* Darker background on hover */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1>Faculty Availability</h1>\r\n");
      out.write("<!-- Wrapper to hold both forms in a single line -->\r\n");
      out.write("<div class=\"inline-forms-container\">\r\n");
      out.write("    <!-- Search Faculty Form -->\r\n");
      out.write("    <form method=\"post\" action=\"faculty-availability.jsp\">\r\n");
      out.write("        <input type=\"text\" name=\"facultyId\" placeholder=\"Enter Faculty ID\" required>\r\n");
      out.write("        <input type=\"submit\" value=\"Search\">\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <!-- Button with the class 'styled-button' -->\r\n");
      out.write("    <form action=\"DbConnectionTest\" method=\"post\">\r\n");
      out.write("        <button type=\"submit\" class=\"styled-button\">Mark All Available</button>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Display Faculty Status Count -->\r\n");
      out.write("        <h2>Faculty Status Counts</h2>\r\n");
      out.write("        ");

            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                conn = DbConnection.getConnection();

                // Query to count faculty status
                String countQuery = "SELECT status, COUNT(*) AS count FROM availability GROUP BY status";
                stmt = conn.prepareStatement(countQuery);
                rs = stmt.executeQuery();
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Status</th>\r\n");
      out.write("                <th>Count</th>\r\n");
      out.write("                <th>Actions</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                while (rs.next()) {
                    String status = rs.getString("status");
                    int count = rs.getInt("count");
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print( status );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( count );
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <!-- Button to Generate PDF for specific status -->\r\n");
      out.write("                    <form method=\"post\" action=\"faculty-availability.jsp\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"status\" value=\"");
      out.print( status );
      out.write("\">\r\n");
      out.write("                        <input type=\"submit\" value=\"Generate PDF\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        ");

            } catch (SQLException e) {
                out.println("<p>Error fetching status counts: " + e.getMessage() + "</p>");
            } finally {
                try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
                try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
                try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Faculty Details Section -->\r\n");
      out.write("        ");

            String facultyId = request.getParameter("facultyId");
            if (facultyId != null && !facultyId.isEmpty()) {
                try {
                    conn = DbConnection.getConnection();

                    // Query to fetch faculty availability
                    String query = "SELECT a.id, f.name, f.department, a.available_date, a.status " +
                                   "FROM availability a JOIN faculty f ON a.faculty_id = f.id " +
                                   "WHERE a.faculty_id = ?";
                    stmt = conn.prepareStatement(query);
                    stmt.setString(1, facultyId);
                    rs = stmt.executeQuery();

                    if (rs.next()) {
                        String name = rs.getString("name");
                        String department = rs.getString("department");
                        String availableDate = rs.getString("available_date");
                        String status = rs.getString("status");
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Display Faculty Details -->\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Faculty ID</th>\r\n");
      out.write("                <th>Name</th>\r\n");
      out.write("                <th>Department</th>\r\n");
      out.write("                <th>Available Date</th>\r\n");
      out.write("                <th>Status</th>\r\n");
      out.write("                <th>Actions</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print( facultyId );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( name );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( department );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( availableDate );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( status );
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <!-- Form to Update Availability -->\r\n");
      out.write("                    <form method=\"post\" action=\"faculty-availability.jsp\" class=\"update-form\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"facultyId\" value=\"");
      out.print( facultyId );
      out.write("\">\r\n");
      out.write("                        <select name=\"newStatus\">\r\n");
      out.write("                            <option value=\"Available\" ");
      out.print( "Available".equals(status) ? "selected" : "" );
      out.write(">Available</option>\r\n");
      out.write("                            <option value=\"On Leave\" ");
      out.print( "On Leave".equals(status) ? "selected" : "" );
      out.write(">On Leave</option>\r\n");
      out.write("                            <option value=\"Busy\" ");
      out.print( "Busy".equals(status) ? "selected" : "" );
      out.write(">Busy</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <input type=\"date\" name=\"newAvailableDate\" value=\"");
      out.print( availableDate );
      out.write("\" required>\r\n");
      out.write("                        <input type=\"submit\" name=\"updateStatus\" value=\"Update Status\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        ");

                    } else {
                        out.println("<p>No availability records found for Faculty ID: " + facultyId + "</p>");
                    }
                } catch (Exception e) {
                    out.println("<p>Error: " + e.getMessage() + "</p>");
                } finally {
                    try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
                    try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
                    try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
                }
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Form to Assign Another Faculty -->\r\n");
      out.write("        <h2>Assign Another Faculty</h2>\r\n");
      out.write("        <form method=\"post\" action=\"faculty-availability.jsp\">\r\n");
      out.write("            <input type=\"text\" name=\"newFacultyId\" placeholder=\"New Faculty ID\" required>\r\n");
      out.write("            <input type=\"date\" name=\"assignmentDate\" required>\r\n");
      out.write("            <input type=\"submit\" name=\"assignFaculty\" value=\"Assign Faculty\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        ");
 
            if ("POST".equalsIgnoreCase(request.getMethod())) {
                if (request.getParameter("updateStatus") != null) {
                    // Update the status
                    String newStatus = request.getParameter("newStatus");
                    String newAvailableDate = request.getParameter("newAvailableDate");
                    try {
                        conn = DbConnection.getConnection();
                        
                        // Delete existing records for the faculty member
                        String deleteQuery = "DELETE FROM availability WHERE faculty_id = ?";
                        stmt = conn.prepareStatement(deleteQuery);
                        stmt.setString(1, facultyId);
                        stmt.executeUpdate();
                        
                        // Insert new record
                        String insertQuery = "INSERT INTO availability (faculty_id, available_date, status) VALUES (?, ?, ?)";
                        stmt = conn.prepareStatement(insertQuery);
                        stmt.setString(1, facultyId);
                        stmt.setDate(2, java.sql.Date.valueOf(newAvailableDate)); // Corrected date format handling
                        stmt.setString(3, newStatus);
                        int rowsAffected = stmt.executeUpdate();

                        if (rowsAffected > 0) {
                            out.println("<p>Status updated successfully!</p>");
                        } else {
                            out.println("<p>No records updated. Please check the faculty ID.</p>");
                        }
                    } catch (SQLException e) {
                        out.println("<p>Error updating status: " + e.getMessage() + "</p>");
                    } finally {
                        try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
                        try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
                    }
                }
                
                if (request.getParameter("assignFaculty") != null) {
                    // Assign a new faculty
                    String newFacultyId = request.getParameter("newFacultyId");
                    String assignmentDate = request.getParameter("assignmentDate");
                    try {
                        conn = DbConnection.getConnection();

                        // Check if the new faculty exists
                        String checkQuery = "SELECT id FROM faculty WHERE id = ?";
                        stmt = conn.prepareStatement(checkQuery);
                        stmt.setString(1, newFacultyId);
                        rs = stmt.executeQuery();

                        if (rs.next()) {
                            // Faculty exists, proceed with assignment
                            String deleteQuery = "DELETE FROM availability WHERE faculty_id = ?";
                            stmt = conn.prepareStatement(deleteQuery);
                            stmt.setString(1, newFacultyId);
                            stmt.executeUpdate();
                            
                            String assignQuery = "INSERT INTO availability (faculty_id, available_date, status) " +
                                                 "VALUES (?, ?, 'Available')"; // Default status is "Available"
                            stmt = conn.prepareStatement(assignQuery);
                            stmt.setString(1, newFacultyId);
                            stmt.setDate(2, java.sql.Date.valueOf(assignmentDate)); // Corrected date format handling
                            stmt.executeUpdate();

                            out.println("<p>New faculty assigned successfully!</p>");
                        } else {
                            out.println("<p>Error: Faculty ID does not exist.</p>");
                        }
                    } catch (SQLException e) {
                        out.println("<p>Error assigning new faculty: " + e.getMessage() + "</p>");
                    } finally {
                        try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
                        try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
                        try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
                    }
                }
                
                if (request.getParameter("status") != null) {
                    // Generate PDF based on status
                    String statusToFetch = request.getParameter("status");
                    String statusMessage = "";
                    
                    if ("Available".equals(statusToFetch)) {
                        statusMessage = "List of available faculty";
                    } else if ("Busy".equals(statusToFetch)) {
                        statusMessage = "List of busy faculty";
                    } else if ("On Leave".equals(statusToFetch)) {
                        statusMessage = "List of faculty on leave";
                    }
                    
                    try {
                        conn = DbConnection.getConnection();
                        String pdfQuery = "SELECT f.id, f.name, f.department " +
                                          "FROM availability a JOIN faculty f ON a.faculty_id = f.id " +
                                          "WHERE a.status = ?";
                        stmt = conn.prepareStatement(pdfQuery);
                        stmt.setString(1, statusToFetch);
                        rs = stmt.executeQuery();
                        
                        // Create PDF
                        response.setContentType("application/pdf");
                        response.setHeader("Content-Disposition", "attachment;filename=Faculty_Details_" + statusToFetch + ".pdf");
                        Document document = new Document();
                        PdfWriter.getInstance(document, response.getOutputStream());
                        document.open();
                        
                        Font redFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.RED);
                        Font blackFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.BLACK);
                        
                        Paragraph header = new Paragraph(statusMessage, blackFont);
                        header.setAlignment(Element.ALIGN_CENTER);
                        header.setSpacingAfter(20); // Add space between title and table
                        document.add(header);
                        
                        PdfPTable table = new PdfPTable(3);
                        table.setWidthPercentage(100);
                        
                        table.addCell(new Phrase("Faculty ID", redFont));
                        table.addCell(new Phrase("Name", redFont));
                        table.addCell(new Phrase("Department", redFont));
                        
                        while (rs.next()) {
                            table.addCell(new Phrase(rs.getString("id"), blackFont));
                            table.addCell(new Phrase(rs.getString("name"), blackFont));
                            table.addCell(new Phrase(rs.getString("department"), blackFont));
                        }
                        
                        document.add(table);
                        document.close();
                    } catch (Exception e) {
                        out.println("<p>Error generating PDF: " + e.getMessage() + "</p>");
                    } finally {
                        try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
                        try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
                        try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
                    }
                }
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"center-button\">\r\n");
      out.write("            <a href=\"landing2.html\"><button>Back to Dashboard</button></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
