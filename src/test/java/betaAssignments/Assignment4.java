package betaAssignments;

/*
 * import java.util.HashMap; import java.util.Iterator; import java.util.Map;
 * import java.util.Map.Entry; import java.util.Set;
 * 
 * 
 * 
 * public class Assignment4 { public static void main(String[] args){
 * 
 * String str = "selenium"; HashMap<Character, Integer> hs = new
 * HashMap<Character, Integer>(); char[] str_array =
 * str.toCharArray();//converts the given string into a sequence of characters.
 * The returned array length is equal to the length of the string //c is your
 * object key. If it matches then it will return boolean and you increment by 1
 * if the matching key is more than 1 for (char c : str_array) { if
 * (hs.containsKey(c)) { hs.put(c, hs.get(c) + 1); } else {
 * 
 * hs.put(c, 1); } } for(Map.Entry entry:hs.entrySet()) {
 * System.out.println(entry.getKey() + " " + entry.getValue()); }
 * 
 * } }
 * 
 * //Opening Chrome Browser package browser;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class BrowserSelection { static WebDriver driver;
 * 
 * public static WebDriver usingChrome() {
 * System.setProperty("webdriver.chrome.driver",
 * "E:\\SeleniumLibs\\\\chromedriver_win32\\chromedriver.exe"); driver = new
 * ChromeDriver(); driver.manage().window().maximize(); return driver; } }
 * 
 * //Test to select a desired date in the datepicker for departure
 * 
 * package makemytripdatepicker;
 * 
 * import java.awt.AWTException; import java.awt.Robot; import
 * java.awt.event.KeyEvent; import java.util.List; import
 * java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.JavascriptExecutor;
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebDriverException; import
 * org.openqa.selenium.WebElement; import org.testng.annotations.AfterMethod;
 * import org.testng.annotations.BeforeMethod; import
 * org.testng.annotations.Test;
 * 
 * import browser.BrowserSelection;
 * 
 * public class MakeMyTripDateTest { WebDriver driver;
 * 
 * @BeforeMethod public void openBrowser() {
 * 
 * driver = BrowserSelection.usingChrome(); }
 * 
 * @Test public void tripDetails() throws InterruptedException, AWTException {
 * 
 * //Modify Wait time as per the Network Ability in the Thread Sleep method
 * 
 * driver.get("https://www.makemytrip.com/");
 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * Thread.sleep(5000);
 * 
 * try {
 * 
 * driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
 * Thread.sleep(2000);
 * 
 * Date d = new Date(1); SimpleDateFormat formatter = new
 * SimpleDateFormat("dd-MMMM-yyyy"); String date = formatter.format(d); String
 * splitter[] = date.split("-"); String month_year = splitter[1]; String day =
 * splitter[0]; System.out.println(month_year); System.out.println(day);
 * 
 * 
 * selectDate(month_year,day); Thread.sleep(3000);
 * 
 * 
 * public void selectDate(String month_year, String select_day) throws
 * InterruptedException { List<WebElement> elements =
 * driver.findElements(By.xpath("//div[@class='ui-datepicker-title']/span[1]"));
 * 
 * for (int i=0; i<elements.size();i++) {
 * System.out.println(elements.get(i).getText());
 * 
 * //Selecting the month if(elements.get(i).getText().equals(month_year)) {
 * 
 * //Selecting the date List<WebElement> days = driver.findElements(By.
 * xpath("//div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/table/tbody/tr/td/a"
 * ));
 * 
 * for (WebElement d:days) { System.out.println(d.getText());
 * if(d.getText().equals(select_day)) { d.click(); Thread.sleep(10000); return;
 * } }
 * 
 * }
 * 
 * } driver.findElement(By.
 * xpath("//div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/div/a/span"
 * )).click(); selectDate(month_year,select_day);
 * 
 * }
 * 
 * @AfterMethod public void closeBrowser() { driver.quit(); }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
