
/* Z60_B00848ValidationMessagesEmptyTest.scala

	Purpose:
		
	Description:
		
	History:
		Apr 20, 2012 Created by Pao Wang

Copyright (C) 2012 Potix Corporation. All Rights Reserved.
*/

package org.zkoss.zktest.bind.issue
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.zkoss.ztl.Tags

/**
 * @author pao
 */
@Tags(tags = "zbind")
class Z60_B00848ValidationMessagesEmptyTest extends ZTL4ScalaTestCase {

  def testArg() = {
    val zul = """
      <include src="/bind/issue/B00848ValidationMessagesEmpty.zul"/>
"""

    runZTL(zul, () => {

      var l11 = jq("$l11")
      var l12 = jq("$l12")

      var t21 = jq("$t21")
      var t22 = jq("$t22")

      var t31 = jq("$t31")
      var t32 = jq("$t32")
      var m31 = jq("$m31")
      var m32 = jq("$m32")

      var btn1 = jq("$btn1")

      var t41 = jq("$t41")
      var t42 = jq("$t42")
      var m41 = jq("$m41")
      var m42 = jq("$m42")
      var m43 = jq("$m43")
      var m44 = jq("$m44")
      var m45 = jq("$m45")
      var m46 = jq("$m46")

      var btn2 = jq("$btn2")
      var btn3 = jq("$btn3")

      var vmsize = jq("$vmsize")
      var vmempty = jq("$vmempty")

      verifyEquals("ABC", l11.toWidget().get("value"))
      verifyEquals("10", l12.toWidget().get("value"))

      verifyEquals("ABC", t21.toWidget().get("value"))
      verifyEquals(10L, t22.toWidget().get("value"))

      verifyEquals("ABC", t31.toWidget().get("value"))
      verifyEquals(10L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))

      verifyEquals("ABC", t41.toWidget().get("value"))
      verifyEquals(10L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))
      verifyEquals("0", vmsize.toWidget().get("value"))
      verifyEquals("true", vmempty.toWidget().get("value"))

      `type`(t21.toWidget(), "ABCD")
      waitResponse()
      `type`(t22.toWidget(), "6")
      waitResponse()
      verifyEquals("ABC", l11.toWidget().get("value"))

      verifyEquals("10", l12.toWidget().get("value"))

      verifyEquals("ABCD", t21.toWidget().get("value"))
      verifyEquals(6L, t22.toWidget().get("value"))
      verifyEquals("ABC", t31.toWidget().get("value"))
      verifyEquals(10L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("ABC", t41.toWidget().get("value"))
      verifyEquals(10L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))

      verifyEquals("2", vmsize.toWidget().get("value"))
      verifyEquals("false", vmempty.toWidget().get("value"))

      `type`(t21.toWidget(), "Abc")
      waitResponse()
      `type`(t22.toWidget(), "33")
      waitResponse()
      verifyEquals("Abc", l11.toWidget().get("value"))

      verifyEquals("33", l12.toWidget().get("value"))

      verifyEquals("Abc", t21.toWidget().get("value"))
      verifyEquals(33L, t22.toWidget().get("value"))
      verifyEquals("Abc", t31.toWidget().get("value"))
      verifyEquals(33L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("ABC", t41.toWidget().get("value"))
      verifyEquals(10L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))

      verifyEquals("0", vmsize.toWidget().get("value"))
      verifyEquals("true", vmempty.toWidget().get("value"))

      `type`(t31.toWidget(), "XXX")
      waitResponse()
      `type`(t32.toWidget(), "1")
      waitResponse()
      verifyEquals("Abc", l11.toWidget().get("value"))
      verifyEquals("33", l12.toWidget().get("value"))
      verifyEquals("Abc", t21.toWidget().get("value"))
      verifyEquals(33L, t22.toWidget().get("value"))
      verifyEquals("XXX", t31.toWidget().get("value"))
      verifyEquals(1L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("ABC", t41.toWidget().get("value"))
      verifyEquals(10L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))

      verifyEquals("0", vmsize.toWidget().get("value"))
      verifyEquals("true", vmempty.toWidget().get("value"))

      click(btn1.toWidget())
      waitResponse()
      verifyEquals("Abc", l11.toWidget().get("value"))
      verifyEquals("33", l12.toWidget().get("value"))
      verifyEquals("Abc", t21.toWidget().get("value"))
      verifyEquals(33L, t22.toWidget().get("value"))
      verifyEquals("XXX", t31.toWidget().get("value"))
      verifyEquals(1L, t32.toWidget().get("value"))
      verifyEquals("value must equals ignore case 'abc', but is XXX", m31.toWidget().get("value"))
      verifyEquals("value must not < 10 or > 100, but is 1", m32.toWidget().get("value"))
      verifyEquals("ABC", t41.toWidget().get("value"))
      verifyEquals(10L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))

      verifyEquals("2", vmsize.toWidget().get("value"))
      verifyEquals("false", vmempty.toWidget().get("value"))

      `type`(t32.toWidget(), "55")
      waitResponse()
      verifyEquals("Abc", l11.toWidget().get("value"))
      verifyEquals("33", l12.toWidget().get("value"))
      verifyEquals("Abc", t21.toWidget().get("value"))
      verifyEquals(33L, t22.toWidget().get("value"))
      verifyEquals("XXX", t31.toWidget().get("value"))
      verifyEquals(55L, t32.toWidget().get("value"))
      verifyEquals("value must equals ignore case 'abc', but is XXX", m31.toWidget().get("value"))
      verifyEquals("value must not < 10 or > 100, but is 1", m32.toWidget().get("value"))
      verifyEquals("ABC", t41.toWidget().get("value"))
      verifyEquals(10L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))

      click(btn1.toWidget())
      waitResponse()
      verifyEquals("Abc", l11.toWidget().get("value"))
      verifyEquals("33", l12.toWidget().get("value"))
      verifyEquals("Abc", t21.toWidget().get("value"))
      verifyEquals(33L, t22.toWidget().get("value"))
      verifyEquals("XXX", t31.toWidget().get("value"))
      verifyEquals(55L, t32.toWidget().get("value"))
      verifyEquals("value must equals ignore case 'abc', but is XXX", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("ABC", t41.toWidget().get("value"))
      verifyEquals(10L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))

      verifyEquals("1", vmsize.toWidget().get("value"))
      verifyEquals("false", vmempty.toWidget().get("value"))

      `type`(t31.toWidget(), "aBC")
      waitResponse()
      verifyEquals("Abc", l11.toWidget().get("value"))
      verifyEquals("33", l12.toWidget().get("value"))
      verifyEquals("Abc", t21.toWidget().get("value"))
      verifyEquals(33L, t22.toWidget().get("value"))
      verifyEquals("aBC", t31.toWidget().get("value"))
      verifyEquals(55L, t32.toWidget().get("value"))
      verifyEquals("value must equals ignore case 'abc', but is XXX", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("ABC", t41.toWidget().get("value"))
      verifyEquals(10L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))

      click(btn1.toWidget())
      waitResponse()
      verifyEquals("aBC", l11.toWidget().get("value"))
      verifyEquals("55", l12.toWidget().get("value"))
      verifyEquals("aBC", t21.toWidget().get("value"))
      verifyEquals(55L, t22.toWidget().get("value"))
      verifyEquals("aBC", t31.toWidget().get("value"))
      verifyEquals(55L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("ABC", t41.toWidget().get("value"))
      verifyEquals(10L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))

      verifyEquals("0", vmsize.toWidget().get("value"))
      verifyEquals("true", vmempty.toWidget().get("value"))

      // ///////

      `type`(t41.toWidget(), "YYY")
      waitResponse()
      `type`(t42.toWidget(), "1999")
      waitResponse()
      verifyEquals("aBC", l11.toWidget().get("value"))
      verifyEquals("55", l12.toWidget().get("value"))
      verifyEquals("aBC", t21.toWidget().get("value"))
      verifyEquals(55L, t22.toWidget().get("value"))
      verifyEquals("aBC", t31.toWidget().get("value"))
      verifyEquals(55L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("YYY", t41.toWidget().get("value"))
      verifyEquals(1999L, t42.toWidget().get("value"))
      verifyEquals("value must equals ignore case 'abc', but is YYY", m41.toWidget().get("value"))
      verifyEquals("value must not < 10 or > 100, but is 1999", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))

      verifyEquals("2", vmsize.toWidget().get("value"))
      verifyEquals("false", vmempty.toWidget().get("value"))

      click(btn2.toWidget())
      waitResponse()
      verifyEquals("aBC", l11.toWidget().get("value"))
      verifyEquals("55", l12.toWidget().get("value"))
      verifyEquals("aBC", t21.toWidget().get("value"))
      verifyEquals(55L, t22.toWidget().get("value"))
      verifyEquals("aBC", t31.toWidget().get("value"))
      verifyEquals(55L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("YYY", t41.toWidget().get("value"))
      verifyEquals(1999L, t42.toWidget().get("value"))
      verifyEquals("value must equals ignore case 'abc', but is YYY", m41.toWidget().get("value"))
      verifyEquals("value must not < 10 or > 100, but is 1999", m42.toWidget().get("value"))
      verifyEquals("value must equals 'AbC', but is ABC", m43.toWidget().get("value"))
      verifyEquals("value must equals 'AbC', but is ABC", m44.toWidget().get("value"))
      verifyEquals("value must equals 'AbC', but is ABC", m45.toWidget().get("value"))
      verifyEquals("extra validation info ABC", m46.toWidget().get("value"))

      verifyEquals("4", vmsize.toWidget().get("value"))
      verifyEquals("false", vmempty.toWidget().get("value"))

      `type`(t41.toWidget(), "abc")
      waitResponse()
      `type`(t42.toWidget(), "77")
      waitResponse()
      verifyEquals("aBC", l11.toWidget().get("value"))
      verifyEquals("55", l12.toWidget().get("value"))
      verifyEquals("aBC", t21.toWidget().get("value"))
      verifyEquals(55L, t22.toWidget().get("value"))
      verifyEquals("aBC", t31.toWidget().get("value"))
      verifyEquals(55L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("abc", t41.toWidget().get("value"))
      verifyEquals(77L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("value must equals 'AbC', but is ABC", m43.toWidget().get("value"))
      verifyEquals("value must equals 'AbC', but is ABC", m44.toWidget().get("value"))
      verifyEquals("value must equals 'AbC', but is ABC", m45.toWidget().get("value"))
      verifyEquals("extra validation info ABC", m46.toWidget().get("value"))

      verifyEquals("2", vmsize.toWidget().get("value"))
      verifyEquals("false", vmempty.toWidget().get("value"))

      click(btn2.toWidget())
      waitResponse()
      verifyEquals("aBC", l11.toWidget().get("value"))
      verifyEquals("55", l12.toWidget().get("value"))
      verifyEquals("aBC", t21.toWidget().get("value"))
      verifyEquals(55L, t22.toWidget().get("value"))
      verifyEquals("aBC", t31.toWidget().get("value"))
      verifyEquals(55L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("abc", t41.toWidget().get("value"))
      verifyEquals(77L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("value must equals 'AbC', but is abc", m43.toWidget().get("value"))
      verifyEquals("value must equals 'AbC', but is abc", m44.toWidget().get("value"))
      verifyEquals("value must equals 'AbC', but is abc", m45.toWidget().get("value"))
      verifyEquals("extra validation info abc", m46.toWidget().get("value"))

      verifyEquals("2", vmsize.toWidget().get("value"))
      verifyEquals("false", vmempty.toWidget().get("value"))

      `type`(t41.toWidget(), "AbC")
      waitResponse()
      click(btn2.toWidget())
      waitResponse()
      verifyEquals("AbC", l11.toWidget().get("value"))
      verifyEquals("77", l12.toWidget().get("value"))
      verifyEquals("AbC", t21.toWidget().get("value"))
      verifyEquals(77L, t22.toWidget().get("value"))
      verifyEquals("AbC", t31.toWidget().get("value"))
      verifyEquals(77L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("", m32.toWidget().get("value"))
      verifyEquals("AbC", t41.toWidget().get("value"))
      verifyEquals(77L, t42.toWidget().get("value"))
      verifyEquals("", m41.toWidget().get("value"))
      verifyEquals("", m42.toWidget().get("value"))
      verifyEquals("", m43.toWidget().get("value"))
      verifyEquals("", m44.toWidget().get("value"))

      `type`(t31.toWidget(), "YYY")
      waitResponse()
      `type`(t32.toWidget(), "2")
      waitResponse()
      click(btn1.toWidget())
      waitResponse()
      verifyEquals("YYY", t31.toWidget().get("value"))
      verifyEquals(2L, t32.toWidget().get("value"))
      verifyEquals("value must equals ignore case 'abc', but is YYY", m31.toWidget().get("value"))
      verifyEquals("value must not < 10 or > 100, but is 2", m32.toWidget().get("value"))

      verifyEquals("2", vmsize.toWidget().get("value"))
      verifyEquals("false", vmempty.toWidget().get("value"))

      click(btn3.toWidget())
      waitResponse()
      verifyEquals("AbC", t31.toWidget().get("value"))
      verifyEquals(2L, t32.toWidget().get("value"))
      verifyEquals("", m31.toWidget().get("value"))
      verifyEquals("value must not < 10 or > 100, but is 2", m32.toWidget().get("value"))

      verifyEquals("1", vmsize.toWidget().get("value"))
      verifyEquals("false", vmempty.toWidget().get("value"))

    })
  }
}