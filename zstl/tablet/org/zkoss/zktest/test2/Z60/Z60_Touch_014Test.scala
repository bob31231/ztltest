package org.zkoss.zktest.test2.Z60
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.zkoss.ztl.Tags
import org.zkoss.ztl.JQuery
import org.junit.Test

@Tags(tags = "Touch,Android")
class Z60_Touch_014Test extends ZTL4ScalaTestCase {
	
  @Test
  def testClick() {
		val zscript = """
<zk>
	<div>
	1. click button on first datebox, should see a popup contains 3 spin wheels of year, month and date.<separator />
	2. click button on second datebox, should see a popup contains 6 spin wheels of year, month, date, hour, minute and second.<separator />
	3. click button on third datebox, should see a popup contains 7 spin wheels of year, month, date, hour, minute, second and APM.
	</div>
	<datebox width="300px" height="40px" format="yyyy/MM/dd" lenient="false" /><separator/>
	<datebox width="300px" height="40px" format="yyyy/MM/dd HH:mm:ss" lenient="false" constraint="between 20070101 and 20271231" /><separator/>
	<datebox width="300px" height="40px" format="yyyy/MM/dd a hh:mm:ss" lenient="false" constraint="between 20070101 and 20271231" />
</zk>		
		};
		
		runZTL(zscript,
			() => {
				var dateboxpopup    : JQuery = null;
				var date_wheel : JQuery = null;
				var time_wheel : JQuery = null;
				
				// 1. Click the button on first datebox
				singleTap(jq(".z-datebox").toWidget().$n("btn"));
				waitResponse(true);
				
				// should see a 3-column spin wheel
				dateboxpopup = jq(jq(".z-datebox").toWidget().$n("pp"));
				
				date_wheel = dateboxpopup.find(".z-calendar-wheel-date");
				verifyTrue(3 == date_wheel.find(".z-calendar-wheel-list").length());

				// 2. Click the button on second datebox
				singleTap(jq(".z-datebox:eq(1)").toWidget().$n("btn"));
				waitResponse(true);
				
				// should see a 6-column spin wheel
				dateboxpopup = jq(jq(".z-datebox:eq(1)").toWidget().$n("pp"));

				date_wheel = dateboxpopup.find(".z-calendar-wheel-date");
				verifyTrue(3 == date_wheel.find(".z-calendar-wheel-list").length());

				time_wheel = dateboxpopup.find(".z-timebox-wheel-time");
				verifyTrue(3 == time_wheel.find(".z-timebox-wheel-list").length());
				
				// 3. Click the button on third datebox
				singleTap(jq(".z-datebox:eq(2)").toWidget().$n("btn"));
				waitResponse(true);
				
				// should see a 7-column spin wheel
				dateboxpopup = jq(jq(".z-datebox:eq(2)").toWidget().$n("pp"));

				date_wheel = dateboxpopup.find(".z-calendar-wheel-date");
				verifyTrue(3 == date_wheel.find(".z-calendar-wheel-list").length());

				time_wheel = dateboxpopup.find(".z-timebox-wheel-time");
				verifyTrue(4 == time_wheel.find(".z-timebox-wheel-list").length());
			}
		);
	}
}