using Hotline.pages;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

namespace Hotline
{
    class Program
    {
        static void Main(string[] args)
        {
            IWebDriver driver = new ChromeDriver();
            driver.Manage().Window.Maximize();
            var mainPage = new MainPage(driver);
            mainPage.GoToPage();
            var computersPage = mainPage.OpenComputersPage(driver);
            var resultPage = computersPage.OpenResultPage(driver);
            resultPage.TurnThePages();
            driver.Close();
        }
    }
}
