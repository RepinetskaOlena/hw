using OpenQA.Selenium;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;

namespace Hotline.pages
{
    class ResultPage
    {
        private IWebDriver driver;
        private IList<Result> result = new List<Result>();

        public ResultPage(IWebDriver driver) => this.driver = driver;

       By NextButton = By.XPath("//a[@title='Следующая']");
       By NameField = By.CssSelector("li.product-item div p a");
       By PriceField = By.XPath("//div[@class='price-md']");
       
        public void TurnThePages ()
        {
            bool flag = true;
            while (flag)
            {
                Thread.Sleep(2000);
                List<string> names = driver.FindElements(NameField).Select(el => el.Text).ToList();
                Thread.Sleep(2000);
                List<string> prices = driver.FindElements(PriceField).Select(el => el.Text).ToList();
                if (names.Count == prices.Count)
                {
                    for (int i = 0; i < names.Count; i++)
                    {
                        result.Add(new Result(names[i], prices[i]));
                    }
                }
                else
                {
                    for (int i = 0; i < prices.Count; i++)
                    {
                        result.Add(new Result(names[i], prices[i]));
                    }
                    for (int i = prices.Count; i < names.Count; i++)
                    {
                        result.Add(new Result(names[i], "нет в наличии"));
                    }

                }

                if (driver.FindElements(NextButton).Count != 0)
                {
                    Thread.Sleep(5000);
                    driver.FindElement(NextButton).Click();
                }
                else flag = false;
            }
            for (int i = 0; i < result.Count; i++)
            {
                Console.WriteLine(result[i]);
            }
            Console.WriteLine(result.Count);
  //          Console.ReadKey();
        }
    }
            
}

