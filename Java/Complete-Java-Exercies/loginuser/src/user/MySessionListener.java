package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener {
  @Override
  public void sessionCreated(HttpSessionEvent se) {
      System.out.println("-- HttpSessionListener#sessionCreated invoked --");
      HttpSession session = se.getSession();
      System.out.println("session id: " + session.getId());
      session.setMaxInactiveInterval(50);
  }
  @Override
  public void sessionDestroyed(HttpSessionEvent se) {
	  PreparedStatement stmt;
	  Connection con = DBConnection.getConn();
	  HttpSession session = se.getSession();
	  try {
	  stmt = con.prepareStatement("UPDATE users SET status = 0 WHERE uname = ?");
	  String uname = (String) session.getAttribute("name");
	  stmt.setString(1,uname);
      stmt.executeUpdate();
      System.out.println("-- HttpSessionListener#sessionDestroyed invoked --");
	  }
	  catch(Exception e) {}
  }
}