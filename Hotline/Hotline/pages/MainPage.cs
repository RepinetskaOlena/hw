using OpenQA.Selenium;
using OpenQA.Selenium.Interactions;
using OpenQA.Selenium.Support.PageObjects;
using OpenQA.Selenium.Support.UI;
using System;
using System.Threading;

namespace Hotline.pages
{
    class MainPage
    {
        private readonly IWebDriver driver;
        
        public MainPage(IWebDriver driver) => this.driver = driver;

        readonly By ComputerMenuField = By.XPath("//a[contains(text(),'Компьютеры')]");

        public void GoToPage()
        {
            driver.Navigate().GoToUrl("https://hotline.ua/");
        }


        public ComputersPage OpenComputersPage(IWebDriver driver)
        {
            driver.FindElement(ComputerMenuField).Click();
            return new ComputersPage(driver);
        }
    }
}
