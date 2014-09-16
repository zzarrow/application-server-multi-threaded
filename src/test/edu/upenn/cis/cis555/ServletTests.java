package test.edu.upenn.cis.cis555;

import java.net.Socket;
import java.util.HashMap;

import edu.upenn.cis.cis555.webserver.*;
import junit.framework.TestCase;

public class ServletTests extends TestCase {

	//*****Tests for Validator*****
	
	public void testValidInput(){
		String[] args = { "8080", "resources/", "web/WEB-INF/web.xml" };
		assertTrue(Validator.validate(args));
	}

	public void testInvalidNumArgs(){
		String[] args = { "8080" };
		assertFalse(Validator.validate(args));
	}
	
	public void testInvalidPort(){
		String[] args = { "900000", "resources/" }; //invalid port
		assertFalse(Validator.validate(args));
	}
	
	public void testInvalidPath(){
		String[] args = { "8080", "lalala/" }; //invalid path
		assertFalse(Validator.validate(args));
	}
	
	//***** Test for Config *****
	
	public void testStaticConfig(){
		assertNotNull(Config.httpDate.format((new java.util.Date()).getTime()));
		assertNotNull(Config.cookieDate.format((new java.util.Date()).getTime()));
		
		Config.errorLog.add("Error");
		assertEquals(1, Config.errorLog.size());
		assertTrue(Config.errorLog.contains("Error"));
	}
	
	
	//Using headers/params/attributes to test the rest
	///if they work, then most of the class should work
	public void testRequest(){
		Config.context = new HttpServletContext("testContext");
		
		HttpRequest r = new HttpRequest(new Socket(), new HashMap<String, String>(), "test", null, "test", "test", "test", "test");
		r.setAttribute("lol1", "rofl1");
		r.setAttribute("lol2", "rofl2");
		assertEquals("rofl1", r.getAttribute("lol1"));
		assertEquals("rofl2", r.getAttribute("lol2"));
		
	}
	
	public void testResponse(){
		HttpResponse r = new HttpResponse(null, null ,null);
		//make sure headers work
		r.addHeader("head1", "test1");
		r.addHeader("head2", "test2");
		assertTrue(r.containsHeader("head1"));
		assertTrue(r.containsHeader("head2"));
	}
	
	public void testHttpConfig(){
		HttpServletConfig c = new HttpServletConfig(null);
		c.setParm("Hi1", "Hello1");
		c.setParm("Hi2", "Hello2");
		assertEquals("Hello1", c.getInitParameter("Hi1"));
		assertEquals("Hello2", c.getInitParameter("Hi2"));
		
	}
	
	public void testContext(){
		HttpServletContext c = new HttpServletContext("Context");
		c.setAttribute("testAttr1", "abc");
		c.setAttribute("testAttr2", "def");
		assertEquals("abc", c.getAttribute("testAttr1"));
		assertEquals("def", c.getAttribute("testAttr2"));
	}
	
	public void testSession(){
		HttpServletSession s = new HttpServletSession();
		s.setAttribute("testAttr1", "abc");
		s.setAttribute("testAttr2", "def");
		assertEquals("abc", s.getAttribute("testAttr1"));
		assertEquals("def", s.getAttribute("testAttr2"));
	}
	
	public void testWorker(){
		Worker w = new Worker();
		w.start();
		assertTrue(w.isAlive());
		//Nothing public to test
	}
}
