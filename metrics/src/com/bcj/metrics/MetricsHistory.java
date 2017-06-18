package com.bcj.metrics;


import java.util.Scanner;

/**
 * This class is used to write a code to view versions of
 * IDE,JDK,REPOSITORY,DATA BASE AND SERVER
 * 
 * @author uday
 *
 */
public class MetricsHistory {

	Scanner sc = new Scanner(System.in);

	// List of Jdk history
	String[] jdkInfo = { "2014:\tJavaSE 8", "2013:", "2012:", "2011:\tJavaSE 7", "2010:", "2009:", "2008:", "2007:",
			"2006:\tJavaSE 6", "2005:", "2004:\tJ2SE 5.0", "2003:", "2002:\tJ2SE 1.4", "2001:", "2000:\tJ2SE 1.3",
			"1999:", "December 1998:\tJ2SE 1.2", "February 1997:\tJDK 1.1", "JDK 1.0:\tJanuary 1996" };

	// List of Ide history
	String[] eclipseInfo = { "2006:\tCallisto 3.2", "2007:\tEuropa	3.3", "2008:\tGanymede 3.4", "2009:\tGalileo 3.5",
			"2010:\tHelios	3.6", "2011:\tIndigo 3.7", "2012:\tJuno 4.2", "2013:\tKepler 4.3", "2014:\tLuna 4.4",
			"2015:\tMars 4.5", "2016:\tNeon 4.6" };

	String[] netBeansInfo = { "2015:\tNet Beans 8.1", "2014:\tNet Beans 8.0", "2013:\tNet Beans 7.2",
			"2012:\tNet Beans 7.0", "2011:\tNet Beans 6.9", "2010:\tNet Beans 6.8", "2009:\tNet Beans 6.5",
			"2008:\tNet Beans 6.0", "2007:\tNet Beans 5.5", "2006:\tNet Beans 5.0" };

	String[] intelliJInfo = { "2015:\tIntelliJ Idea 15", "2014:\tIntelliJ Idea 14", "2013:\tIntelliJ Idea 13",
			"2012:\tIntelliJ Idea 12,IntelliJ Idea 11", "2011:\tIntelliJ Idea 10.5", "2010:", "2009:\tIntelliJ Idea 9",
			"2008:\tIntelliJ Idea 8", "2007:\tIntelliJ Idea 7", "2006:\tIntelliJ Idea 6", };

	// List of Repository history
	String[] svnInfo = { "2015:\tSVN 1.9", "2014:", "2013:\tSVN 1.8", "2012:", "2011:\tSVN 1.7", "2010:",
			"2009:\tSVN 1.6", "2008:\tSVN 1.5", "2007:", "2006:\tSVN 1.4" };

	String[] gitInfo = { "2016:\tGIT 2.9,GIT 2.8,GIT 2.7,GIT 2.6,GIT 2.5,GIT 2.4", "2015:\tGIT 2.3,GIT 2.2",
			"2014:\tGIT 2.1,GIT 2,GIT 1.9,GIT 1.8", "2013:", "2012:\tGIT 1.7", "2011", "2010:\tGIT 1.6", "2009:",
			"2008:\tGIT 1.5,GIT 1.4", "2007:", "2006:\tGIT 1.3,GIT 1.2,GIT 1.1,GIT 1", "2005:\tGIT 0.99" };

	// List of Data Base history
	String[] mySqlInfo = { "2015:\tMySQL 5.7", "2014:", "2013:\tMySQL 5.6", "2012", "2011", "2010:\tMySQL Server 5.5",
			"2009:", "2008:\tMySQL Version 5.1", "2007:", "2006", "2005:\tMySQL Beta Version 5.0" };

	String[] oracleInfo = { "2007:\tOracle 9i", "2006:\tOracle 10g (10.1)", "2009:", "2010:\tOracle 10g (10.2)",
			"2008:\tOracle 11g (11.1)", "2011:", "2012:", "2013:\tOracle 11g (11.2),Oracle 12c (12.1)",
			"2014:\tOracle 12c (12.1)" };

	String[] sqlServerInfo = { "2016:\tSQL Server 2016", "2015:", "2014:\tSQL Server 2014", "2013:\t",
			"2012:\tSQL Server 2012", "2011:", "2010:", "2009:", "2008:\tSQL Server 2008 Release 2,SQL Server 2008",
			"2007:", "2006", "2005:\tSQL Server 2005" };

	// List of Servers history
	String[] tomcatInfo = { "2004:\tApache Tomcat3.0,Apache Tomcat5.0", "2005:", "2006:", "2007:", "2008:",
			"2009:\tApache Tomcat4.1", "2010:\tApache Tomcat5.5",
			"2016:\tApache Tomcat6.0,Apache Tomcat7.0,Apache Tomcat8.0,Apache Tomcat8.5 Beta,Apache Tomcat9.0	alpha" };

	String[] webLogicInfo = { "2015:\tWebLogic Server 12c R2 (12.2.1)", "2014:\tWebLogic Server 12c Release 3",
			"2013:\tWebLogic Server 12c Release 2 ",
			"2012:\tWebLogic Server 12c Release 1 , WebLogic Server 11gR1 PS5 (10.3.6)",
			"2011:\tWebLogic Server 11gR1 PS4 (10.3.5),WebLogic Server 11gR1 PS3 (10.3.4)",
			"2010:\tWebLogic Server 11gR1 PS2 (10.3.3)",
			"2009:\tWebLogic Server 11gR1 PS1 (10.3.2),WebLogic Server 11g (10.3.1)", "2008:\tWebLogic Server 10.3",
			"2007:\tWebLogic Server 10.0", "2006:\tWebLogic Server 9.0 " };

	String[] glassFishInfo = { "2007:\tGlassFish1,GlassFish1", "2008:", "2009:\tGlassFish 2.1,GlassFish v3", "2010:",
			"2011:\tGlassFish v3.1.1", "2012:\tGlassFish v3.1.2,GlassFish v3.1.2.2", "2013:\tGlassFish 4.0",
			"2014:\tGlassFish 4.1", "2015:\tGlassFish 4.1.1" };

	/*
	 * Jdk processing is done in this method
	 */
	public void jdkProcessing() {

		System.out.println(
				"Now you are ready to view JDK versions\nEnter how many years of jdk versions you need (range:1-19)");

		int input1 = sc.nextInt();

		if (input1 < 20) {

			for (int i = 0; i < input1; i++) {

				System.out.println(jdkInfo[i]);
			}

		} else {

			System.out.println("Please select a history less than 20years ");

			jdkProcessing();
		}

	}

	/**
	 * Ide processing is done in this method for (eclipse,netbeans,intellij)
	 */
	public void ideProcessing() {

		System.out.println("Select an Ide in the below :\n\n1.Eclipse\n2.Netbeans\n3.IntelliJ");

		int input2 = sc.nextInt();

		switch (input2) {

		case 1:

			System.out.println(
					"Now you are ready to view Eclipse versions\nEnter how many years of versions you need (range:1-11)");

			int inputEclipse = sc.nextInt();

			if (inputEclipse < 12) {

				for (int i = 0; i < inputEclipse; i++) {

					System.out.println(eclipseInfo[i]);
				}

			} else {

				System.out.println("Please select a history less than 12years ");

				ideProcessing();
			}

			break;

		case 2:

			System.out.println(
					"Now you are ready to view Net Beans versions\nEnter how many years of versions you need (range:1-10)");

			int inputNetBeans = sc.nextInt();

			if (inputNetBeans < 11) {

				for (int i = 0; i < inputNetBeans; i++) {

					System.out.println(netBeansInfo[i]);
				}

			}

			else {

				System.out.println("Please select a history less than 11years ");

				ideProcessing();
			}

			break;

		case 3:

			System.out.println(
					"Now you are ready to view IntelliJ versions\nEnter how many years of versions you need (range:1-10)");

			int inputIntelliJ = sc.nextInt();

			if (inputIntelliJ < 11) {

				for (int i = 0; i < inputIntelliJ; i++) {

					System.out.println(intelliJInfo[i]);
				}

			}

			else {

				System.out.println("Please select a history less than 11years ");

				ideProcessing();
			}

			break;

		default:

			System.out.println("Please select a valid number 1 or 2 or 3");

			ideProcessing();

			break;

		}
	}

	/*
	 * Repository processing is done in this method for(svn,git)
	 */
	public void repositoryProcessing() {

		System.out.println("Select a repository in the below :\n\n1.SVN\n2.GIT");

		int input3 = sc.nextInt();

		switch (input3) {

		case 1:

			System.out.println(
					"Now you are ready to view SVN repository versions\nEnter how many years of versions you need (range:1-10)");

			int inputSvn = sc.nextInt();

			if (inputSvn < 11) {

				for (int i = 0; i < inputSvn; i++) {
					System.out.println(svnInfo[i]);
				}

			} else {

				System.out.println("Please select a history less than 11years ");

				repositoryProcessing();
			}

			break;

		case 2:

			System.out.println(
					"Now you are ready to view GIT repository versions\nEnter how many years of versions you need (range:1-12)");

			int inputGit = sc.nextInt();

			if (inputGit < 13) {

				for (int i = 0; i < inputGit; i++) {

					System.out.println(gitInfo[i]);
				}

			}

			else {

				System.out.println("Please select a history less than 13years ");

				repositoryProcessing();
			}

			break;

		default:

			System.out.println("Please select a valid number 1 or 2");

			repositoryProcessing();

			break;

		}
	}

	/*
	 * Data Base processing is done here for ( MySql , Oracle & Sql Server )
	 */
	public void dataBaseProcessing() {

		System.out.println("Select a Data Base in the below :\n\n1.My Sql\n2.Oracle\n3.Sql Server");

		int input4 = sc.nextInt();

		switch (input4) {

		case 1:

			System.out.println(
					"Now you are ready to view MySql versions\nEnter how many years of versions you need (range:1-11)");

			int inputMySql = sc.nextInt();

			if (inputMySql < 12) {

				for (int i = 0; i < inputMySql; i++) {

					System.out.println(mySqlInfo[i]);
				}

			}

			else {

				System.out.println("Please select a history less than 12years ");

				dataBaseProcessing();
			}

			break;

		case 2:

			System.out.println(
					"Now you are ready to view Oracle versions\nEnter how many years of versions you need (range:1-8)");

			int inputOracle = sc.nextInt();

			if (inputOracle < 9) {

				for (int i = 0; i < inputOracle; i++) {

					System.out.println(oracleInfo[i]);
				}

			}

			else {

				System.out.println("Please select a history less than 9years ");

				dataBaseProcessing();
			}

			break;

		case 3:

			System.out.println(
					"Now you are ready to view Sql Server versions\nEnter how many years of versions you need (range:1-12)");

			int inputSqlServer = sc.nextInt();

			if (inputSqlServer < 13) {

				for (int i = 0; i < inputSqlServer; i++) {

					System.out.println(sqlServerInfo[i]);
				}

			}

			else {

				System.out.println("Please select a history less than 13years ");

				dataBaseProcessing();
			}

			break;

		default:

			System.out.println("Please select a valid number 1 or 2 or 3");

			dataBaseProcessing();

			break;

		}
	}

	/*
	 * Server history is printed from the logic written here for ( Tomcat, Web
	 * Logic & Glass Fish )
	 */
	public void serverProcessing() {

		System.out.println("Select a server in the below :\n\n1.Apache Tomcat\n2.Web Logic\n3.Glass Fish");

		int input5 = sc.nextInt();

		switch (input5) {

		case 1:

			System.out.println(
					"Now you are ready to view Apache Tomcat versions\nEnter how many years of versions you need (range:1-7)");

			int inputTomcat = sc.nextInt();

			if (inputTomcat < 8) {

				for (int i = 0; i < inputTomcat; i++) {

					System.out.println(tomcatInfo[i]);
				}

			}

			else {

				System.out.println("Please select a history less than 8 years ");

				serverProcessing();
			}

			break;

		case 2:

			System.out.println(
					"Now you are ready to view WebLogic versions\nEnter how many years of versions you need (range:1-9)");

			int inputWebLogic = sc.nextInt();

			if (inputWebLogic < 10) {

				for (int i = 0; i < inputWebLogic; i++) {

					System.out.println(webLogicInfo[i]);
				}

			}

			else {

				System.out.println("Please select a history less than 10years ");

				serverProcessing();
			}

			break;

		case 3:

			System.out.println(
					"Now you are ready to view GlassFish versions\nEnter how many years of versions you need (range:1-9)");

			int inputGlassFish = sc.nextInt();

			if (inputGlassFish < 10) {

				for (int i = 0; i < inputGlassFish; i++) {

					System.out.println(glassFishInfo[i]);
				}

			}

			else {

				System.out.println("Please select a history less than 10years ");

				serverProcessing();
			}

			break;

		default:

			System.out.println("Please select a valid number 1 or 2 or 3");

			serverProcessing();

			break;

		}
	}

	/**
	 * This method is used to call all the above methods
	 */
	public void allMethodsInvoking() {

		System.out.println(
				"Select a number between 1 to 5 :\n1.JDK\n2.IDE\n3.Repository\n4.DataBase\n5.Application Server");

		switch (sc.nextInt()) {

		case 1:

			jdkProcessing();

			break;

		case 2:

			ideProcessing();

			break;

		case 3:

			repositoryProcessing();

			break;

		case 4:

			dataBaseProcessing();

			break;

		case 5:

			serverProcessing();

			break;

		default:

			System.out.println("Please Enter numbers between 1 to 5 ");

			allMethodsInvoking();

			break;

		}

	}

	/**
	 * This main method is used to create object & for calling methods
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		MetricsHistory obj = new MetricsHistory();
		obj.allMethodsInvoking();

	}
}