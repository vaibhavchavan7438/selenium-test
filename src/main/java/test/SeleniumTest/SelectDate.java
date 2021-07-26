package test.SeleniumTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDate {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://internal-campaigns.mnetads.com/campaigns/create?type=Search");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("admin@internalmnetads.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass@123");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		SelectDate sd = new SelectDate();
		// sd.chooseDate("7 Days From Today");
		// sd.selectBrowser("Safari, Chrome, Edge");
		sd.demographics("35-44,45-54,25-34", "Male");
		// String dateSelected =
		// driver.findElement(By.xpath("//input[@aria-haspopup='dialog']")).getText();
		// driver.close();
	}

	public void demographics(String ageGroup, String gender) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scroll to targetting parameters
		WebElement emailDomainsLabel = driver.findElement(By.xpath("//label[normalize-space()='Email Domains']"));
		js.executeScript("arguments[0].scrollIntoView();", emailDomainsLabel);
		Thread.sleep(5000);
		// for Age Groups
		// deselect Age groups first
		driver.findElement(By.xpath("//label[normalize-space()='Demographics']/following::span[3]")).click();

		if (ageGroup.equals("")) {
			driver.findElement(By.xpath("//label[normalize-space()='Demographics']/following::span[3]")).click();
		} else {

			if (ageGroup.contains(",")) {

				String[] ageGroups = ageGroup.split(",");

				for (String ageGroupValue : ageGroups) {
					driver.findElement(By.xpath("//label[normalize-space()='" + ageGroupValue.trim() + "']")).click();
				}

			} else {
				driver.findElement(By.xpath("//label[normalize-space()='" + ageGroup + "']")).click();
			}
		}

		// for Gender
		// deselect gender first
//		driver.findElement(By.xpath("//label[normalize-space()='Demographics']/following::span[12]")).click();
//		if (gender.equalsIgnoreCase("All")) {
//			driver.findElement(By.xpath("//label[normalize-space()='Demographics']/following::span[12]")).click();
//		} else {
//
//			if (gender.contains(",")) {
//
//				String[] genders = gender.split(",");
//
//				for (String genderValue : genders) {
//					driver.findElement(By.xpath("//label[normalize-space()='" + genderValue.trim() + "']")).click();
//				}
//
//			} else {
//				driver.findElement(By.xpath("//label[normalize-space()='" + gender + "']")).click();
//			}
//		}

		// for Gender
		// deselect gender first
		driver.findElement(By.xpath("//label[normalize-space()='Demographics']/following::span[12]")).click();

		// dropdown
		switch (gender) {
		case "":
			driver.findElement(By.xpath("//label[normalize-space()='Demographics']/following::span[12]")).click();
			break;
		case "Male":
			driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
			break;
		case "Female":
			driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
			break;
		}

	}

	public static void selectBrowser(String browserValues) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scroll to targetting parameters
		WebElement browserLable = driver.findElement(By.xpath("//h4[normalize-space()='Targeting Parameters']"));
		js.executeScript("arguments[0].scrollIntoView();", browserLable);
		Thread.sleep(5000);

		if (browserValues.equalsIgnoreCase("All")) {

		} else {
			// click on custom browser's radio button
			driver.findElement(By.xpath("//label[normalize-space()='Browsers']/following::span[8]")).click();

			// de-selecting all the browsers initially
			driver.findElement(By.xpath("//span[contains(text(),'Chrome')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Firefox')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Explorer')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Edge')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Safari')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Others')]")).click();

			if (browserValues.contains(",")) {

				String[] Browsers = browserValues.split(",");

				for (String browser : Browsers) {
					driver.findElement(By.xpath("//span[normalize-space()='" + browser.trim() + "']")).click();
				}

			} else {
				driver.findElement(By.xpath("//span[normalize-space()='" + browserValues + "']")).click();
			}
		}

	}

	public void chooseDate(String insertDate) {

		// click on calendar icon
		driver.findElement(By.xpath("//body//campaign-app//mat-datepicker-toggle//span[1]//*[local-name()='svg']"))
				.click();
		// date format= dd-mm-yyyy
		Locale locale = new Locale("en", "IN");
		Calendar calendar = Calendar.getInstance(locale);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String currentDate = sdf.format(calendar.getTime());
		System.out.println("Today's date : " + currentDate);

//	     Present Day, Next Day, Preview Day, 3 Days From Current, 3 Days Before Current, 7 Days From Current,
//	     7 Days Before Current, 30 Days From Current, 30 Days Before Current, 60 Days From Current, 
//	     60 Days Before Current, 90 Days From Current, 90 Days Before Current, 1 Year From Current, 1 Year Before Current,
//	     More Than 3 Months, More Than 1 Year

		String dateToSelect;

		switch (insertDate) {
		case "Present Day":
			dateToSelect = currentDate;
			break;
		case "Next Day":
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "Previous Day":
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "3 Days From Today":
			calendar.add(Calendar.DAY_OF_MONTH, 3);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "3 Days Before Today":
			calendar.add(Calendar.DAY_OF_MONTH, -3);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "7 Days From Today":
			calendar.add(Calendar.DAY_OF_MONTH, 7);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "7 Days Before Today":
			calendar.add(Calendar.DAY_OF_MONTH, -7);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "30 Days From Today":
			calendar.add(Calendar.DAY_OF_MONTH, 30);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "30 Days Before Today":
			calendar.add(Calendar.DAY_OF_MONTH, -30);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "60 Days From Today":
			calendar.add(Calendar.DAY_OF_YEAR, 60);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "60 Days Before Today":
			calendar.add(Calendar.DAY_OF_YEAR, -60);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "90 Days From Today":
			calendar.add(Calendar.DAY_OF_YEAR, 90);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "90 Days Before Today":
			calendar.add(Calendar.DAY_OF_YEAR, -90);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "1 Year From Today":
			calendar.add(Calendar.YEAR, 1);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "1 Year Before Today":
			calendar.add(Calendar.YEAR, -1);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "More Than 3 Months":
			calendar.add(Calendar.DAY_OF_YEAR, 91);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		case "More Than 1 Year":
			calendar.add(Calendar.YEAR, 1);
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			dateToSelect = sdf.format(calendar.getTime());
			break;
		default:
			dateToSelect = insertDate;
		}

		String dateArray[] = (dateToSelect.split("-"));
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];
		int yearInt = Integer.parseInt(year);
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);

		// element showing current date on calendar window
		driver.findElement(By.xpath("//button[@aria-label='Choose month and year']//span//div")).click();

		String rangeString = driver.findElement(By.xpath("//button[@aria-label='Choose date']")).getText();
		// System.out.println("Range: "+rangeString);
		String rangeArray[] = rangeString.split(" ");
		String rangeBegin = rangeArray[0];
		String rangeEnd = rangeArray[2];
		int range = Integer.parseInt(rangeEnd) - Integer.parseInt(rangeBegin) + 1;

		int currentIndex = currentYear / range;

		int requiredIndex = yearInt / range;

		int difference = 0;
		if (yearInt > currentYear) {
			difference = requiredIndex - currentIndex;
			for (int i = 0; i < difference; i++) {
				driver.findElement(By.xpath("//button[@aria-label='Next 20 years']")).click();
			}
		} else if (currentYear > yearInt) {
			difference = currentIndex - requiredIndex;
			for (int i = 0; i < difference; i++) {
				driver.findElement(By.xpath("//button[@aria-label='Previous 20 years']")).click();
			}
		}
		// select year
		driver.findElement(By.xpath("//div[normalize-space()='" + year + "']")).click();

		int MonthInt = Integer.parseInt(month);
		String Mon = null;

		switch (MonthInt) {
		case 1:
			Mon = "JAN";
			break;
		case 2:
			Mon = "FEB";
			break;
		case 3:
			Mon = "MAR";
			break;
		case 4:
			Mon = "APR";
			break;
		case 5:
			Mon = "MAY";
			break;
		case 6:
			Mon = "JUN";
			break;
		case 7:
			Mon = "JUL";
			break;
		case 8:
			Mon = "AUG";
			break;
		case 9:
			Mon = "SEP";
			break;
		case 10:
			Mon = "OCT";
			break;
		case 11:
			Mon = "NOV";
			break;
		case 12:
			Mon = "DEC";
			break;

		}

		// select month
		driver.findElement(By.xpath("//div[normalize-space()='" + Mon + "']")).click();

		int dayInt = Integer.parseInt(day);
		// select day
		driver.findElement(By.xpath("//div[normalize-space()='" + dayInt + "']")).click();
		System.out.println(">>>>>Date is selected successfully<<<<<< ");
	}

}
