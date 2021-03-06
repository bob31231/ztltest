package org.zkoss.zktest.test2.B65

import org.zkoss.ztl.Tags
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test

@Tags(tags = "B65-ZK-1909.zul")
class B65_ZK_1909Test extends ZTL4ScalaTestCase {

@Test
def testClick() = {
  val zscript = """<zk>
	enter number 111 to the doublebox and blur, it should not show any error message.
	<separator></separator>
	<doublebox maxlength="3" onChange=""/>
</zk>"""  
  runZTL(zscript,
    () => {
      val box = jq(".z-doublebox")
      sendKeys(box, "111")
      waitResponse()
      blur(box)
      
      verifyTrue("should not show any error message", !jq(".z-errbox").exists)
    })
    
  }
}