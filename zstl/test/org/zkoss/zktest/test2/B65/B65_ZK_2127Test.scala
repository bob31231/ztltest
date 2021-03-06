package org.zkoss.zktest.test2.B65

import org.zkoss.ztl.Tags
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test

@Tags(tags = "B65-ZK-2127.zul")
class B65_ZK_2127Test extends ZTL4ScalaTestCase {

@Test
def testClick() = {
  runZTL(
    () => {
      click(jq(".z-radio:eq(1)").toWidget().$n("real"))
      waitResponse()
      
      verifyTrue("the combobox should be enable", !jq(".z-combobox.z-combobox-disabled").exists)
    })
    
  }
}