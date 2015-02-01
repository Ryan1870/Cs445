import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;


public class UnitTests {

	Thing thf = new Thing("thingName");
	Tiger tig = new Tiger("TestTiger");
	Tiger tig2 = new Tiger("TestTiger2");
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	//@Test
	//public void testTiger(){
////	assertEquals(tig,tig2);
	//}
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	@Test
	public void testThing(){
		
		
		assertEquals(thf.getName(),"thingName");
		String newSetName = "thingName2";
		thf.setName(newSetName);
		assertEquals(thf.getName(), "thingName2");
		assertEquals(thf.toString(),"thingName2 Thing");
		
	}
	
	@Test
	public void testTiger(){
		
		assertEquals(tig.getName(), "TestTiger");
		
		//assertEquals(tig.eat(thf), "Tiger has just eaten a thingName");
	}
}
