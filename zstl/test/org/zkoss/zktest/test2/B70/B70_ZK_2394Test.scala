package org.zkoss.zktest.test2.B70

import org.zkoss.ztl.{ZK, Tags, ZKSeleneseTestBase}
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test
import java.awt.event.KeyEvent
import org.openqa.selenium.Keys
import org.zkoss.ztl.util.ConfigHelper

@Tags(tags = "B70-ZK-2394.zul")
class B70_ZK_2394Test extends ZTL4ScalaTestCase {

@Test
def testClick() = {
  val zscript = """
<zk>
  <grid>
    <columns>
      <column hflex="min" label="Column1"/>
      <column hflex="min" label="Column2"/>
    </columns>
    <rows>
      <row>
        <cell><label value="Label"/></cell>
        <cell><label value="Label2"/></cell>
      </row>
      <row>
        <cell><label value="Label"/></cell>
        <cell><label value="Label2"/></cell>
      </row>
      <row>
        <cell><label value="Label"/></cell>
        <cell><label value="Label2"/></cell>
      </row>
    </rows>
  </grid>
</zk>
"""
  runZTL(zscript,
    () => {
      var hdcolwidth = 0
      val hdtblwidth = jq(".z-grid-header > table").width
      var iter = jq(".z-grid-header > table > colgroup").children.iterator
      while (iter.hasNext) {
        hdcolwidth += iter.next.width
      }
      var bdcolwidth = 0
      val bdtblwidth = jq(".z-grid-body > table").width
      iter = jq(".z-grid-body > table > colgroup").children.iterator
      while (iter.hasNext) {
        bdcolwidth += iter.next.width
      }
      verifyTrue(Math.abs(hdtblwidth - hdcolwidth) < 1)
      verifyTrue(Math.abs(bdtblwidth - bdcolwidth) < 1)
    })
    
  }
}