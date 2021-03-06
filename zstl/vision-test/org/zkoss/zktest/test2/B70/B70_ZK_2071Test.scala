package org.zkoss.zktest.test2.B70

import org.zkoss.ztl.Tags
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test

@Tags(tags = "B70-ZK-2071.zul")
class B70_ZK_2071Test extends ZTL4ScalaTestCase {

@Test
def testClick() = {
  val zscript = """<window title="MeshWidget X Frozen X Scrollbar" border="normal" width="550px">
	<label multiline="true">
		1. Scroll all scrollbar in the meshwidget to the rightmost.
		2. Auxheadd and listhead/columns/treecols position should be aligned.
	</label>
	<grid width="500px">
		<custom-attributes org.zkoss.zul.nativebar="true"/> 
		<frozen columns="1"></frozen>
		<columns>
			<column label="A"/>
			<column label="B"/>
			<column label="C"/>
			<column label="D"/>
			<column label="E"/>
			<column label="F"/>
			<column label="G"/>
		</columns>
		<auxhead>
			<auxheader label="A aux"></auxheader>
			<auxheader label="B aux"></auxheader>
			<auxheader label="CDE aux" colspan="3"></auxheader>
			<auxheader label="FG aux" colspan="2"></auxheader>
		</auxhead>
		<rows>
			<row>
				<cell>A cell</cell>
				<cell>B cell</cell>
				<cell>C cell</cell>
				<cell>D cell</cell>
				<cell>E cell</cell>
				<cell>F cell</cell>
				<cell>G cell</cell>
			</row>
			<row>
				<cell>A cell</cell>
				<cell>B cell</cell>
				<cell>C cell</cell>
				<cell>D cell</cell>
				<cell>E cell</cell>
				<cell>F cell</cell>
				<cell>G cell</cell>
			</row>
		</rows>
	</grid>
	<grid width="500px">
		<frozen columns="1"></frozen>
		<columns>
			<column label="A"/>
			<column label="B"/>
			<column label="C"/>
			<column label="D"/>
			<column label="E"/>
			<column label="F"/>
			<column label="G"/>
		</columns>
		<auxhead>
			<auxheader label="A aux"></auxheader>
			<auxheader label="B aux"></auxheader>
			<auxheader label="CDE aux" colspan="3"></auxheader>
			<auxheader label="FG aux" colspan="2"></auxheader>
		</auxhead>
		<rows>
			<row>
				<cell>A cell</cell>
				<cell>B cell</cell>
				<cell>C cell</cell>
				<cell>D cell</cell>
				<cell>E cell</cell>
				<cell>F cell</cell>
				<cell>G cell</cell>
			</row>
			<row>
				<cell>A cell</cell>
				<cell>B cell</cell>
				<cell>C cell</cell>
				<cell>D cell</cell>
				<cell>E cell</cell>
				<cell>F cell</cell>
				<cell>G cell</cell>
			</row>
		</rows>
	</grid>
</window>"""  
  runZTL(zscript,
    () => {
      nativeFrozenScroll(jq(".z-grid").eq(0), 300)
      frozenScroll(jq(".z-grid").eq(1), 5)
      verifyImage()
    })
    
  }
}