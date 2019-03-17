package practiceMavenProject.Sample;

import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test
	public void bookTicket(){
		System.out.println("book ticket");
		
	}
	@Test(dependsOnMethods = "bookTicket")
	public void CancelTicket(){
		System.out.println("Ticket cancelled");
	}

}
