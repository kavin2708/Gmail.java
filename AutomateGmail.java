public class nm {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//input[@id='identifierId']").sendKeys("");
		driver.findElementByXPath("//div[@id='identifierNext']").click();
		Thread.sleep(5000);
		driver.findElementByXPath(".//*[@id='password']/div[1]/div/div[1]/input").sendKeys("");
		driver.findElementByXPath("//div[@id='passwordNext']").click();
	}
  }
  
