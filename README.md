##Multi-threaded Java Application Server##
####Developed by Zach Zarrow to fulfill an academic assignment in Spring 2011.####

This is a multi-threaded web server and application server written from the ground up in Java, without using Java's given HTTP libraries. This service serves Java Servlets (Say that ten times fast), similar in nature to Apache Tomcat. It will also serve static content from the /resources directory.

The text below is the README that was originally submitted with the project.


Description of features implemented:
  All required features of the application server are implemented.
  All test cases pass.  Added my own additional test suite.
  For the interactive menu requirement, I decided to make it integrated into the actual server program instead of serving it on the web.  The menu allows you to shutdown the server, view thread statuses, view a log of all errors that the application server encounters, and clear the the error log.

List of source files included (consider using `find src | grep java`)
src/edu/upenn/cis/cis555/webserver/SessionServlet2.java
src/edu/upenn/cis/cis555/webserver/RequestType.java
src/edu/upenn/cis/cis555/webserver/DemoServlet.java
src/edu/upenn/cis/cis555/webserver/TestHarness.java
src/edu/upenn/cis/cis555/webserver/CookieServlet1.java
src/edu/upenn/cis/cis555/webserver/SessionServlet1.java
src/edu/upenn/cis/cis555/webserver/Worker.java
src/edu/upenn/cis/cis555/webserver/HttpServletSession.java
src/edu/upenn/cis/cis555/webserver/HttpServletContext.java
src/edu/upenn/cis/cis555/webserver/HttpServer.java
src/edu/upenn/cis/cis555/webserver/Config.java
src/edu/upenn/cis/cis555/webserver/CookieServlet2.java
src/edu/upenn/cis/cis555/webserver/HttpServletConfig.java
src/edu/upenn/cis/cis555/webserver/HttpRequest.java
src/edu/upenn/cis/cis555/webserver/HttpResponse.java
src/edu/upenn/cis/cis555/webserver/Validator.java
src/edu/upenn/cis/cis555/webserver/InitParamServlet.java
src/edu/upenn/cis/cis555/webserver/SessionServlet3.java
src/edu/upenn/cis/cis555/webserver/CookieServlet3.java
src/edu/upenn/cis/cis555/webserver/Dispatcher.java
src/test/edu/upenn/cis/cis555/RunAllTests.java
src/test/edu/upenn/cis/cis555/ServletTests.java

Special instructions for building or running:
  You can use the given build script to build.  To run, please type the
  following command from within the root of the project:

java -cp target/WEB-INF/lib/hw1.jar:lib/servlet-api.jar edu.upenn.cis.cis555.webserver.HttpServer PORT_NUMBER HT_DOCS_PATH/ WEB_DOT_XML_PATH
