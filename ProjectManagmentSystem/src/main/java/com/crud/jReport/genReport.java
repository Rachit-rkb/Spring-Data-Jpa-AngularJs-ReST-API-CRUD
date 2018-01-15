package com.crud.jReport;




import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;


public class genReport {
   @SuppressWarnings("unchecked")
   public  void generate(Integer sn) throws URISyntaxException {
	  
	  String fileName = "hibn.jasper";
	  URI location = getClass().getResource(fileName).toURI();
	  String path = location.getPath();
	  System.out.println(path);
      String sourceFileName = path;//file.getAbsolutePath() .toString();
      String printFileName = null;  
      System.out.println(sourceFileName);
     
      String dbUrl = "jdbc:mysql://localhost:3306/hibnatedb";
      String dbDriver = "com.mysql.jdbc.Driver";
      String dbUname = "root";
      String dbPwd = "root";
      try {
    	   	 Class.forName(dbDriver);
    	     Connection conn = DriverManager.getConnection(dbUrl, dbUname, dbPwd);
    	   	
    	   	 Map parameters = new HashMap<String, Integer>();
    	   	 parameters.put("project_id", sn);	     
	         printFileName = JasperFillManager.fillReportToFile(sourceFileName,parameters, conn);
	         if (printFileName != null) {
	            /**
	             * 1- export to PDF
	             */
	        	 JasperExportManager.exportReportToPdfFile(printFileName,"generatedReport//"+sn+"report.pdf");

		         /**
		          * 2- export to HTML
		          */
		         JasperExportManager.exportReportToHtmlFile(printFileName,"generatedReport//"+sn+"report.html");
	          
	          
	         }
	            
	   } 
	    catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	     }     
	     catch (JRException e) {
         e.printStackTrace();
         } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
