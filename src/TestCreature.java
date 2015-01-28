import java.util.ArrayList;

public class TestCreature {

	public static void main(String[] args) {
		
		final int THING_COUNT = 2;
		
		Thing[] arry = new Thing[4];
		
		
			Thing thg = new Thing("tname");
			Thing thg2 = new Thing("tname2");
			Tiger tig = new Tiger("Tiger1");
			Tiger tig2 = new Tiger("Tiger2");
			arry[0] = thg;
			arry[1] = thg2;
			arry[2] = tig;
			arry[3] = tig2;
			
				

		for(int j = 0; j < arry.length; j++)
		{
			System.out.println(arry[j]);
		}
	}

}

