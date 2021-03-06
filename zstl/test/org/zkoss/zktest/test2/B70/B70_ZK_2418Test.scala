package org.zkoss.zktest.test2.B70

import org.zkoss.ztl.Tags
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test
import java.awt.event.KeyEvent
import org.openqa.selenium.Keys
import org.zkoss.ztl.ZKSeleneseTestBase

@Tags(tags = "B70-ZK-2418.zul")
class B70_ZK_2418Test extends ZTL4ScalaTestCase {

  @Test
  def testClick() = {
    runZTL(() => {
      val listbox = jq("@listbox").toWidget();
      val firstitem = jq(".z-listitem").first().children().last();
      val a = listbox.$n("a"); //button can be focused and sendKey

      mouseOver(listbox.$n("hor-embed"));
      waitResponse();
      horScroll(listbox.$n("hor"), 1);
      waitResponse();
      click(firstitem);
      focus(a);
      sendKeys(a, Keys.DOWN);
      waitResponse();
      println(">>>> " + jq(listbox.$n("hor-embed")).css("left"))
      verifyNotEquals(0, jq(listbox.$n("hor-embed")).css("left"));

    })

  }
}