package testrunner;

import com.github.javafaker.Faker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PDetailPage;
import pages.PIMPage;
import setup.Setup;
import utils.Utils;

import java.io.IOException;
import java.util.List;


public class EmployeeTestRunner extends Setup {
    DashboardPage dashboardPage;
    LoginPage loginPage;
    PIMPage pimPage;
    Utils utils;

    PDetailPage pDetailPage;

    @BeforeTest
    public void doLogin() throws IOException, ParseException, InterruptedException {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);

        JSONObject userObject = Utils.loadJSONFiles("./src/test/resources/User.json", 0);
        String username = userObject.get("username").toString();
        String password = userObject.get("password").toString();
        loginPage.doLogin(username, password);
        Thread.sleep(1500);

        WebElement headerText = driver.findElement(By.tagName("h6"));
        String header_actual = headerText.getText();
        String header_expected = "Dashboard";
        org.junit.Assert.assertEquals(header_actual, header_expected);
        Thread.sleep(1500);
    }

    @Test(priority = 1, description = "Creating Employee without Username")
    public void createEmployeeWithoutUsername() throws InterruptedException, IOException, ParseException {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.menus.get(1).click(); //Click on PIM menu

        PDetailPage pDetailPage = new PDetailPage(driver);
        pDetailPage.topBarItem.get(2).click(); // click on add employee
        Thread.sleep(6000);

        pimPage = new PIMPage(driver);

        Faker faker = new Faker();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();
        int empId = Utils.generateNumber(10000, 99999);
        String employeeId = String.valueOf(empId);
        String password = "P@ssword123";
        String confirmPassword = password;
        Thread.sleep(1500);
        pimPage.createEmployeeWithoutUsername(firstname, lastname, employeeId,password,confirmPassword);

        driver.navigate().refresh();

    }

    @Test(priority = 2, description = "Creating 1st Employee")
    public void createEmployee1() throws InterruptedException, IOException, ParseException {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.menus.get(1).click(); //Click on PIM menu

        PDetailPage pDetailPage = new PDetailPage(driver);
        pDetailPage.topBarItem.get(2).click(); // click on add employee
        Thread.sleep(5000);

        pimPage = new PIMPage(driver);
        Faker faker=new Faker();
        String firstName=faker.name().firstName();//taking firstname from faker
        String lastName=faker.name().lastName();//taking lastname from faker

        utils = new Utils();
        int empIdInt = Utils.generateNumber(10000, 99999);
        String empIdStr = String.valueOf(empIdInt);//taking generate number

        WebElement empID = pimPage.txtInput.get(4);

        empID.clear();
        empID.sendKeys(Keys.CONTROL + "a");
        empID.sendKeys(empIdStr);

        String username = "test" + Utils.generateNumber(1000, 9999);//taking generate username
        String password = "P@ssword123";//taking password
        String confirmPassword = password;

        Thread.sleep(7000);
        pimPage.createEmployee(firstName, lastName, username, empIdStr, password,confirmPassword);
        Thread.sleep(5000);

        Utils.addJsonList(firstName,lastName,empIdStr, username, password,confirmPassword);

        pDetailPage.topBarItem.get(2).click();
        Thread.sleep(4000);

    }

    @Test(priority = 3, description = "Creating 2nd Employee")
    public void createEmployee2() throws InterruptedException, IOException, ParseException {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.menus.get(1).click(); //Click on PIM menu

        PDetailPage pDetailPage = new PDetailPage(driver);
        pDetailPage.topBarItem.get(2).click(); // click on add employee
        Thread.sleep(3000);

        pimPage = new PIMPage(driver);
        Faker faker=new Faker();
        String firstName=faker.name().firstName();//taking firstname from faker
        String lastName=faker.name().lastName();//taking lastname from faker

        utils = new Utils();
        int empIdInt = Utils.generateNumber(10000, 99999);
        String empIdStr = String.valueOf(empIdInt);//taking generate number

        WebElement empID = pimPage.txtInput.get(4);

        empID.clear();
        empID.sendKeys(Keys.CONTROL + "a");
        empID.sendKeys(empIdStr);

        String username = "test" + Utils.generateNumber(1000, 9999);//taking generate username
        String password = "P@ssword123";//taking password
        String confirmPassword = password;

        Thread.sleep(5000);
        pimPage.createEmployee(firstName, lastName, username, empIdStr, password,confirmPassword);
        Thread.sleep(7000);


        Utils.addJsonList(firstName,lastName,empIdStr, username, password,confirmPassword);

    }

    @Test(priority = 4, description = "Search Employee By Id")
    public void searchEmployee() throws InterruptedException, IOException, ParseException {

        pimPage = new PIMPage(driver);
        PDetailPage pDetailPage = new PDetailPage(driver);
        pimPage.clickOnPIM();

        String fileName = "./src/test/resources/User.json";
        JSONArray jsonArray = (JSONArray) Utils.readJSONArray(fileName);
       // int indexOfFirstEmp = jsonArray.size() - 2;
        int indexOfFirstEmp = jsonArray.size() - 1;

        JSONObject firstEmp = new JSONObject();
        firstEmp = (JSONObject) jsonArray.get(indexOfFirstEmp);
        String firstEmpId = (String) firstEmp.get("empIdStr");

        Thread.sleep(3000);
        pimPage.txtInputEmpId.get(1).sendKeys(firstEmpId);

        pimPage.btnSubmit.click();

        Utils.doScroll(driver);
        Thread.sleep(5000);
        pimPage.empList.click();
        Thread.sleep(3500);


        }



        @Test(priority = 5, description = "Search Updated Employee Id")
        public void searchEmployeeId() throws IOException, ParseException, InterruptedException {

        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        dashboardPage.menus.get(1).click();
        JSONObject userObject = Utils.loadJSONFiles("./src/test/resources/User.json", 0);
        String employeeId = userObject.get("employeeId").toString();
        pimPage.SearchEmployee(employeeId);
        Thread.sleep(1500);
        Utils.doScroll(driver);


        }


    @Test(priority = 6,description = "search emp by invalid name")
    public void seachEmpByInvlidName() throws InterruptedException, IOException, ParseException {
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.menus.get(1).click();
        dashboardPage.employeeName.get(1).click();
        dashboardPage.employeeName.get(1).sendKeys("AkshayKumar");
        driver.findElement(By.cssSelector("[type=submit]")).click();
        Thread.sleep(2000);

        SoftAssert softAssert=new SoftAssert();
        String empFound_actual=driver.findElements(By.className("oxd-text--span")).get(11).getText();
        String empFound_expected= "No Records found";
        softAssert.assertTrue(empFound_actual.contains(empFound_expected));

    }
    @Test(priority = 7,description = "search emp by valid name")
    public void seachEmpByName() throws InterruptedException, IOException, ParseException {
        DashboardPage dashboardPage= new DashboardPage(driver);
        PIMPage pimPage=new PIMPage(driver);
        Thread.sleep(3000);
        dashboardPage.menus.get(1).click();

        Thread.sleep(4000);
        JSONObject userObject = Utils.loadJSONFiles("./src/test/resources/User.json", 1);
        String employeeName = userObject.get("firstname").toString();
        pimPage.SearchEmployeeByValidName(employeeName);

        Utils.doScroll(driver);
    }

    @Test(priority = 8,description = "Admin Logout Successfully")
    public void logOut() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.doLogout();
        driver.close();
    }

}
