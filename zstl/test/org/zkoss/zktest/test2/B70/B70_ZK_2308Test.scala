package org.zkoss.zktest.test2.B70

import org.zkoss.ztl.{IgnoreBrowsers, Tags}
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test
import org.openqa.selenium.Keys
import org.openqa.selenium.Dimension

@Tags(tags = "B70-ZK-2308.zul")
@IgnoreBrowsers("ie9,ie10,ie11")
class B70_ZK_2308Test extends ZTL4ScalaTestCase {

  @Test
  def testClick() = {
    runZTL(() => {
        val input = jq(".z-datebox-input");
        clickAt(input, "3,2");
        waitResponse();
        
        sendKeys(input, Keys.ALT + "" + Keys.ARROW_DOWN);
        waitResponse();
        
        val popup = jq(".z-datebox-popup");
        verifyTrue("should see datebox popup.", popup.exists());
        
        sendKeys(input, Keys.ARROW_DOWN);
        waitResponse();
        sendKeys(input, Keys.ESCAPE);
        waitResponse();
        
        verifyTrue("should see datebox popup closed.", !popup.isVisible());
      })

  }
}