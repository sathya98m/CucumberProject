package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class GenerateReport {
	
	public static void generateJVMReport(String json) {

		// To Locate where report need to generate
				File file = new File("C:\\Users\\hp\\eclipse-workspace\\AprilCucumberProject\\target");
				
				// to some config based on our required
				Configuration con = new Configuration(file, "Adactin Login WebPage verification");
				con.addClassifications("US_No", "10021");
				con.addClassifications("Module", "Login_Module");
				con.addClassifications("Version", "JDK 1.8");
				
				// To Create Empty List and All the Reports to here
				List<String> li = new LinkedList<String>();
				li.add(json);
				
				// To generate Report
				ReportBuilder report = new ReportBuilder(li, con);
				report.generateReports();
	}

}
