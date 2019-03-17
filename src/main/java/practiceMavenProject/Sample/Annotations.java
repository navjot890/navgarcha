package practiceMavenProject.Sample;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
  @BeforeTest	
public void ConnectCitrix(){
System.out.println(">>Connecting to Citrix");	
}
@AfterTest
public void disconnectCitrix(){
System.out.println(">>Disconecting to Citrix");	
}
 @BeforeClass
public void connectingDB(){
System.out.println(">>Connecting to DB");
}
@AfterClass
public void disconnectingDB(){
System.out.println(">>Disconnecting to DB");	
}
@BeforeMethod
public void logIn(){
System.out.println(">>Login");	
}
@Test
public void bookTicket(){
System.out.println(">>BookTicket");
}
@Test
public void cancelTicket(){
System.out.println(">>Cancel Ticket");
}
@AfterMethod
public void logOut(){
System.out.println(">>logout");	
}
}