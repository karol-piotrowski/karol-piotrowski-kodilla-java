package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_DAY = "//span[contains(@data-name, \"birthday_wrapper\")]/span/select";
    public static final String XPATH_SELECT_MONTH = "//span[contains(@data-name, \"birthday_wrapper\")]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[contains(@data-name, \"birthday_wrapper\")]/span/select[3]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectDayCombo);
        selectDay.selectByValue("7");

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.selectByIndex(7);

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByValue("1977");
    }
}
