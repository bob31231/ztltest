package org.zkoss.zktest.test2.B70

import org.zkoss.ztl.Tags
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test
import java.awt.event.KeyEvent
import org.openqa.selenium.Keys
import org.zkoss.ztl.ZKSeleneseTestBase

@Tags(tags = "B70-ZK-2656.zul")
class B70_ZK_2656Test extends ZTL4ScalaTestCase {

@Test
def testClick() = {
  val zscript = """

<?xml version="1.0" encoding="UTF-8"?>

<!--
B70-ZK-2656.zul

	Purpose:
		
	Description:
		
	History:
		Mon, Mar 16, 2015  3:45:17 PM, Created by Chunfu

Copyright (C)  Potix Corporation. All Rights Reserved.

-->
<zk xmlns:c="client">
    <window>
    	<label multiline="true">
    	1. you should see zk.log shows A~H, and none of them is undefined
    	</label>
		<textbox></textbox>
	    <datebox id="date" width='150px' format="dd/MM/yyyy" />
    </window> 
    <!-- Load the script -->
    <script src="http://cloud.github.com/downloads/digitalBush/jquery.maskedinput/jquery.maskedinput-1.3.js" type="text/javascript"></script>
    <script type="text/javascript">
        zk.afterMount(function() {
          zk.log('A', jq("@datebox input")[0]); //does not work in ZK 7
          zk.log('B', jq("@datebox > input")[0]); //does not work in ZK 7
          zk.log('C', jq("@datebox").find("input")[0]);  //workaround for case A using .find()
          zk.log('D', jq("@datebox").children("input")[0]); //workaround for case B using .children()
          zk.log('E', jq(".z-datebox input")[0]); //workaround for case A using css class
          zk.log('F', jq(".z-datebox > input")[0]); //workaround for case B using css class
          zk.log('G', jq("$date > input")[0]); //selection by ID also fails in ZK7
          zk.log('H', jq("$date").children("input")[0]); //workaround for G
        });
    </script>
</zk>

    
"""  
  runZTL(zscript,
    () => {
      var log = jq("#zk_log").eval("val()");
      verifyFalse(log.contains("undefined"));
    })
    
  }
}