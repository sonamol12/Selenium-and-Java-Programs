package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class Selenium11 {

    @Test(groups = "QA")

    public void testVWOLogin()throws  InterruptedException  {
//        WebDriver driver = new EdgeDriver();
//        // 1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
//        driver.get("https://app.vwo.com");
//        System.out.println(driver.getTitle());
//        Assert.assertEquals(driver.getTitle(), "Login - VWO");
//        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
       WebDriver driver = new EdgeDriver();
        // 1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
        driver.get("https://www.flipkart.com/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
       // WebElement from= driver.findElement(By.xpath("//img[@alt='Electronics']"));
       // WebElement to= driver.findElement(By.xpath("//div[@class='_23axDd']"));

       //Actions actions = new Actions(driver);
//
  // WebElement from = driver.findElement(By.xpath("//div[@class='_23axDd']"));
//        WebElement to = driver.findElement(By.xpath("//a[normalize-space()='Gaming']"));
//
//        //actions.dragAndDrop(from,to).perform();
//
//
        //actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
//
//
//        Thread.sleep(4000);
        // WebElement emailInputBox = driver.findElement(By.xpath("//a[@class='electronics']//following-sibling::ul//a[contains(text(),'Gaming')]"));

//        **Project #1 - TC ( Negaative) - Invalid username, pass - Error message**
//
//        1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
//        2. **Find the Email id** and enter the email as admin@admin.com
//        3. **Find the pass inputbox** and enter passwrod as admin.
//        4. Find and Click on the submit button
//        5. Verify that the error message is shown "Your email, password, IP address or location did not match"
//

        // 2. **Find the Email id** and enter the email as admin@admin.com
        //  id, className, name, css Selector, xpath
        //  LinkText and PartialText which are onlu for <a>
        // <input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi">
//        WebElement emailInputBox = driver.findElement(By.id("login-username"));
//        emailInputBox.sendKeys("admin@admin.com");
//
//        WebElement passwordInputBox = driver.findElement(By.name("password"));
//        passwordInputBox.sendKeys("admin");
//
//        driver.findElement(By.id("js-login-btn")).click();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
//        String error_msg_text = error_msg.getText();
//
//        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
//
//
//        driver.quit(); // Stop the session and edge browser which is opened.
//
//
    }
}
//
//}
//}
