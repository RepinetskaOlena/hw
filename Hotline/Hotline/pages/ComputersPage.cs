using OpenQA.Selenium;


namespace Hotline.pages
{
    class ComputersPage
    {
        private IWebDriver driver;

        public ComputersPage(IWebDriver driver) => this.driver = driver;

        readonly By SparePartsField = By.XPath("//div[@class='viewbox']/div/div/ul/li/span[contains(text(),'Комплектующие')]");
        readonly By ProcField = By.XPath("//div[@class='viewbox']//a[contains(@href,'processory')]");

        public ResultPage OpenResultPage(IWebDriver driver)
        {
            driver.FindElement(SparePartsField).Click();
            driver.FindElement(ProcField).Click();

            return new ResultPage(driver);
        }
    }
}
