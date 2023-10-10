import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;



public class project1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","E://Selenium\\driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://member.daraz.com.bd/user/register?");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[data-meta=Field]")).sendKeys("01891241878");
       // driver.findElement(By.cssSelector("input[placeholder=Verification Code]")).sendKeys("bbc");
        driver.findElement(By.cssSelector("input[placeholder=\"Minimum 6 characters with a number and a letter\"]")).sendKeys("abc");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[placeholder=\"Enter your first and last name\"]")).sendKeys("bbc");
        Thread.sleep(5000);
        driver.findElement(By.id("enableSmsNewsletter")).click();
        //driver.findElement(By.linkText("SIGN UP")).click();
       // driver.findElement(By.className("next-btn next-btn-primary next-btn-large")).click();
        //driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[3]/button")).click();
        //driver.findElement(By.className("next-btn next-btn-primary next-btn-large")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".next-btn.next-btn-primary.next-btn-large")).click();
       // driver.findElement(By.cssSelector(".next-btn.next-btn-primary.next-btn-large")).click();
       // driver.findElement(By.linkText("Terms of Use")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[6]/div/div[2]/button[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Login")).click();
        //driver.findElement(By.cssSelector("input[value data-spm-anchor-id=\"a2o42.login_signup.0.i0.7e892829IJ9BLI\"]")).sendKeys("abc");
        //driver.navigate("https://member.daraz.com.bd/user/login?");
        //driver.findElement(By.cssSelector("input[placeholder=\"Please enter your Phone Number or Email\")")).sendKeys("abc");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("01873279362");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("dhruba1256");
        //driver.findElement(By.cssSelector(".next-btn next-btn-primary next-btn-large")).click();
       // driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
       // driver.findElement(By.cssSelector("#container > div > div:nth-child(2) > form > div > div.mod-login-col2 > div.mod-login-btn > button")).click();
        //driver.findElement(By.linkText("Reset Your Password")).click();
        //driver.findElement(By.linkText("Go back")).click();
        //driver.findElement(By.cssSelector(".next-btn next-btn-primary next-btn-large")).click();
       // driver.findElement(By.cssSelector(".mod-button mod-button mod-third-party-login-btn mod-third-party-login-fb")).click();
       // driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[2]/div/div[2]/button[1]")).click();
        //driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[2]/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".search-box__input--O34g")).sendKeys("shirt");
        driver.findElement(By.cssSelector(".search-box__button--1oH7")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div/label[1]/span[1]/input")).click();
        driver.findElement(By.linkText("Half Sleeve Cotton Casual Shirt For Men Ero Blue")).click();
        driver.findElement(By.xpath("//*[@id=\"module_add_to_cart\"]/div/button[1]")).click();




    }
}
