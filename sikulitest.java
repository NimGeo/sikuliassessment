package sikuliassessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class sikulitest {
  @Test
  public void googleLogin() throws FindFailed {
	  
	  //Screen is a base class provided by Sikuli. It allows us to access all the methods provided by Sikuli.
	  		Screen sc=new Screen(); 
	  // Creating Object of Pattern class and specify the path of specified images
	  		Pattern searchfield=new Pattern("C:\\Users\\Sajini\\Desktop\\Sikuli Imges.png");
	  		Pattern searchbtn=new Pattern("C:\\Users\\Sajini\\Desktop\\Sikuli Imges1.png");
	  		Pattern sikulihome=new Pattern("C:\\Users\\Sajini\\Desktop\\Sikuli Imges2.png");
	  

	  // Initialization of driver object to launch chrome browser 
	  		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Drivers\\chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  // To maximize the browser
	  		driver.manage().window().maximize();
	  // Open Google
	  		driver.get("https://www.google.com/");
	  
	  // Calling 'type' method to enter sikuli in the search field using 'screen' object
	  		sc.type(searchfield,"sikuli");
	  		sc.click(searchbtn);
	  		sc.click(sikulihome);
	  		sc.wait(sikulihome,10);
	  
  }
}
