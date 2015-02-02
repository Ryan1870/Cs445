import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;


public class UnitTests {

	
	Thing thf = new Thing("thingName");
	Tiger tig = new Tiger("TestTiger");
	Tiger tig2 = new Tiger("TestTiger2");
	Fly tfly = new Fly("tFly");
	Bat tbat = new Bat("tbat");
	Ant tant = new Ant("tAnt");
	TestCreature tc = new TestCreature();
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	String sep = System.getProperty("line.separator");
	
		
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
		//temp = tig.eat(thf);
		//assertEquals(temp, "Tiger has just eaten a thingName");
		tig.move();
		//System.out.println("test");
		assertEquals("TestTiger Tiger has just pounced."+ sep , outContent.toString());
		outContent.reset();
		tig.whatDidYouEat();
		assertEquals("TestTiger Tiger has had nothing to eat!" + sep , outContent.toString());
		outContent.reset();
		tig.eat(thf);
		assertEquals("Tiger has just eaten a thingName Thing" + sep , outContent.toString());
		outContent.reset();
		tig.whatDidYouEat();
		assertEquals("TestTiger Tiger jas eaten a thingName Thing" + sep , outContent.toString());
		outContent.reset();
		
	}
	//Fly tfly = new Fly("tFly");
	@Test
	public void testFly(){
		
		assertEquals(tfly.getName(), "tFly");
		tfly.move();
		assertEquals("tFly Fly is buzzing around in flight." + sep, outContent.toString());
		outContent.reset();
		tfly.eat(thf);
		assertEquals("Fly has just eaten a thingName Thing" + sep,outContent.toString());
		outContent.reset();
		tfly.eat(tig);
		assertEquals("tFly Fly won't eat a TestTiger Tiger"+ sep, outContent.toString());
		outContent.reset();
		tfly.whatDidYouEat();
		assertEquals("tFly Fly jas eaten a thingName Thing" + sep, outContent.toString());
		outContent.reset();
			
	}
	//Ant tant = new Ant("tAnt");
	@Test
	public void testAnt(){
		
		tant.move();
		assertEquals("tAnt Ant is crawling around." + sep, outContent.toString());
	}
	//Bat tbat = new Bat("tbat");
	@Test
	public void testBat(){
		
		tbat.move();
		assertEquals("tbat Bat is swooping through the dark." + sep, outContent.toString());
		outContent.reset();
		tbat.eat(thf);
		assertEquals("tbat Bat wont eat a thingName Thing" + sep, outContent.toString());
		outContent.reset();
		tbat.eat(tig);
		assertEquals("Bat has just eaten a TestTiger Tiger" + sep, outContent.toString());
		outContent.reset();
	}
	
	//runs main
	@Test
	public void testMain(){
		TestCreature.main(null);
	}
}
